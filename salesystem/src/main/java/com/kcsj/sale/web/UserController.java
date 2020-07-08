package com.kcsj.sale.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcsj.sale.entity.User;
import com.kcsj.sale.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	/**
	 * 用户登录
	 * 
	 * @param req
	 * @param mv
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest req, Model model) {
		String tempId = req.getParameter("userId");
		int userId = Integer.parseInt(tempId);
		String password = req.getParameter("password");
		if(userService.isExistUser(userId))//在表中存在，说明已经注册完成
		{	
			User u =userService.getUser(userId);
			if(password.equals(u.getPassword()))
					{
				return "redirect:/goods/list";  //登录成功
			}else {
				model.addAttribute("message", "用户名或密码输入错误,请重新输入");
				return "login"; //登录失败 返回登录界面
			}	
		}else {
			model.addAttribute("message", "请注册");
			return "login";
		}
	}
	@RequestMapping("/zhuce")
	public String zhuce(HttpServletRequest req, Model model) {
		String tempId = req.getParameter("userId");
		int userId = Integer.parseInt(tempId);
		String password = req.getParameter("password");
		String password2= req.getParameter("password2");
		if(userService.isExistUser(userId))//在表中存在，说明已经注册过了
		{	
			model.addAttribute("message", "该账户已经注册过了");
			return "zhuce"; //登录失败 返回登录界面	
		}else if(userService.isExistSaler(userId)) {//表明没注册过，但是有资格注册
			if(password.equals(password2)) {
				userService.insertUser(userId, password, 1);//默认都是销售人员注册
				model.addAttribute("message", "success");
				return "zhucesuccess";
			}else {
				model.addAttribute("message", "2次密码输入错误请重新输入");
				return "zhuce";
			}
		}else {
			model.addAttribute("message", "对不起，该ID无资格注册");
			return "zhuce";
		}
	}
	@RequestMapping("/tozhuce")
	public String tozhuce(Model model){
		
		return "zhuce";
	}
	@RequestMapping("/tologin")
	public String tologin(Model model){
		
		return "login";
	}
	
}
