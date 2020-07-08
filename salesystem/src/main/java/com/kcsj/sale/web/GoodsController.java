package com.kcsj.sale.web;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kcsj.sale.dto.DemandExecution;
import com.kcsj.sale.dto.Result;
import com.kcsj.sale.entity.Goods;
import com.kcsj.sale.entity.User;
import com.kcsj.sale.enums.DemandStateEnum;
import com.kcsj.sale.exception.OrderDoneException;
import com.kcsj.sale.exception.OrderGetException;
import com.kcsj.sale.service.SalerService;
import com.kcsj.sale.service.UserService;



@Controller
@RequestMapping("/goods") // url:/Ä£ï¿½ï¿½/ï¿½ï¿½Ô´/{id}/Ï¸ï¿½ï¿½ /seckill/list
public class GoodsController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SalerService salerService;
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list")
	public String list(Model model) {
		List<Goods> list = salerService.getList();
	//	Goods list = salerService.getById(3);
		model.addAttribute("goodslist", list);
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}
	@RequestMapping("/user")
	public String getUser(Model model) {
		int userId = 1;
		User user=userService.getUser(userId);
		model.addAttribute("user",user);
		return "user";
	}
	@RequestMapping("/one")
    public String findStudentById(Integer goodsId, Model model) {
        Goods good = salerService.getById(goodsId);
        model.addAttribute("good", good);
        return "one";
    }
	@RequestMapping("/login")
	public String Login(Model model) {
		return "login";
	}

	@RequestMapping(value = "/{goodsId}/detail", method = RequestMethod.GET)
	private String detail(@PathVariable("goodsId") int goodsId, Model model) {
		if (goodsId == 0) {
			return "redirect:/goods/list";
		}
		Goods goods = salerService.getById(goodsId);
		if (goods == null) {
			return "forward:/goods/list";
		}
		model.addAttribute("goods", goods);
		return "detail";
	}
   
	//ajax json
	@RequestMapping(value = "/{goodsId}/demand", method = RequestMethod.POST, produces = {
			"application/json; charset=utf-8" })
	@ResponseBody
	private Result<DemandExecution> demand(@PathVariable("customId") int customId, @RequestParam("goodsId") int goodsId) {
		if (customId == 0 || goodsId==0) {
			return new Result<DemandExecution>(false, "ID²»ÄÜÎª¿Õ");
		}
		//AppointExecution execution = bookService.appoint(bookId, studentId);//
		DemandExecution execution = null;
		try {
			execution = salerService.demand(customId, goodsId);
		} catch (OrderGetException e1) {
			execution = new DemandExecution(customId,goodsId, DemandStateEnum.ORDER_GET);
		} catch (OrderDoneException e2) {
			execution = new DemandExecution(customId,goodsId,DemandStateEnum.ORDER_DONE);
		} catch (Exception e) {
			execution = new DemandExecution(customId,goodsId,DemandStateEnum.INNER_ERROR);
		}
		return new Result<DemandExecution>(true, execution);
	}

}

