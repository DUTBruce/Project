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
	 * �û���¼
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
		if(userService.isExistUser(userId))//�ڱ��д��ڣ�˵���Ѿ�ע�����
		{	
			User u =userService.getUser(userId);
			if(password.equals(u.getPassword()))
					{
				return "redirect:/goods/list";  //��¼�ɹ�
			}else {
				model.addAttribute("message", "�û����������������,����������");
				return "login"; //��¼ʧ�� ���ص�¼����
			}	
		}else {
			model.addAttribute("message", "��ע��");
			return "login";
		}
	}
	@RequestMapping("/zhuce")
	public String zhuce(HttpServletRequest req, Model model) {
		String tempId = req.getParameter("userId");
		int userId = Integer.parseInt(tempId);
		String password = req.getParameter("password");
		String password2= req.getParameter("password2");
		if(userService.isExistUser(userId))//�ڱ��д��ڣ�˵���Ѿ�ע�����
		{	
			model.addAttribute("message", "���˻��Ѿ�ע�����");
			return "zhuce"; //��¼ʧ�� ���ص�¼����	
		}else if(userService.isExistSaler(userId)) {//����ûע������������ʸ�ע��
			if(password.equals(password2)) {
				userService.insertUser(userId, password, 1);//Ĭ�϶���������Աע��
				model.addAttribute("message", "success");
				return "zhucesuccess";
			}else {
				model.addAttribute("message", "2�����������������������");
				return "zhuce";
			}
		}else {
			model.addAttribute("message", "�Բ��𣬸�ID���ʸ�ע��");
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
