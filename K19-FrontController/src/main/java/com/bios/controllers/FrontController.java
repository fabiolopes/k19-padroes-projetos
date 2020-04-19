package com.bios.controllers;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.k19")
public class FrontController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String[] split = req.getRequestURI().split("/");
		String controlerName = split[2];
		String actionName = split[3].split("\\.")[0];
		System.out.println(controlerName);
		System.out.println(actionName);
		
		try {
			Class<?> controllerClass = Class.forName("com.bios.controllers.	" + controlerName);
			Method method = controllerClass.getDeclaredMethod(actionName);
			Object controller = controllerClass.newInstance();
			method.invoke(controller);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/"+controlerName+"/"+actionName+".jsp");
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
