package com.bishu.servlet.testing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author bishu
 * 
 * testing for the servlet
 *
 */
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String jspFile = "/WEB-INF/pages/servlettest/helloServlet.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jspFile);
		dispatcher.forward(request,response);
	}

	public void destroy() {
	}
}
