package com.cognizant.spring.userreg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.spring.userreg.dto.User;
import com.cognizant.spring.userreg.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "hello")
	public String goToHello() {
		return "hello";
	}
	
	@RequestMapping(value = "/")
	public String goToHomePage() {
		return "index";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public ModelAndView insert() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("insert");
		return modelAndView;
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public ModelAndView insertData(@ModelAttribute("insert") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		String insert = userService.insert(user);
		if (insert.equals("SUCCESS")) {
			modelAndView.addObject("msg", "INSERTED");
		} else {
			modelAndView.addObject("msg", "NOT INSERTED");
		}
		modelAndView.setViewName("insert");
		return modelAndView;
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", id);
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.setViewName("update");
		return modelAndView;
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView updateData(@ModelAttribute("update") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		String update = userService.update(user);
		if (update.equals("SUCCESS")) {
			modelAndView.addObject("msg", "UPDATED");
		} else {
			modelAndView.addObject("msg", "NOT UPDATED");
		}
		modelAndView.setViewName("update");
		return modelAndView;
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam("id") int id) {
		ModelAndView modelAndView = new ModelAndView();
		String delete = userService.delete(id);
		if (delete.equals("SUCCESS")) {
			modelAndView.addObject("msg", "DELETED");
		} else {
			modelAndView.addObject("msg", "NOT DELETED");
		}
		modelAndView.setViewName("display");
		return getall();
	}

	@RequestMapping(value = "display")
	public ModelAndView getall() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> list = userService.getAll();
		System.out.println(list);
		modelAndView.addObject("list", list);
		modelAndView.setViewName("display");
		return modelAndView;
	}
}
