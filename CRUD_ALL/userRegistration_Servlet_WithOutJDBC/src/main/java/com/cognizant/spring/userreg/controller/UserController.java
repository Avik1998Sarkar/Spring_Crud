package com.cognizant.spring.userreg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.spring.userreg.dao.UserDao;
import com.cognizant.spring.userreg.dao.UserDaoImpl;
import com.cognizant.spring.userreg.model.User;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDaoImpl();
	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Action : "+action);
		
		if(action.equals("Insert")) {
			insert(request, response);
		}else if(action.equals("Update")) {
			update(request, response);
		}else if(action.equals("Delete")) {
			delete(request, response);
		}else if(action.equals("getall")) {
			getall(request, response);
		}
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		String insert = userDao.insert(user);
		if(insert.equals("SUCCESS")) {
			request.setAttribute("msg", "INSERTED");
		}else {
			request.setAttribute("msg", "NOT INSERTED");
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("insert.jsp");
		requestDispatcher.forward(request, response);
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		String insert = userDao.update(user);
		if(insert.equals("SUCCESS")) {
			request.setAttribute("msg", "UPDATED");
		}else {
			request.setAttribute("msg", "NOT UPDATED");
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		String insert = userDao.delete(user);
		if(insert.equals("SUCCESS")) {
			request.setAttribute("msg", "UPDATED");
		}else {
			request.setAttribute("msg", "NOT UPDATED");
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete.jsp");
		requestDispatcher.forward(request, response);
	}

	private void getall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> getall = userDao.getall();
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
		request.setAttribute("list", getall);
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
