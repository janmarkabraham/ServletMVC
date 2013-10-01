package com.test.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.mvc.DataModel;


public class ControllerServlet extends HttpServlet {
	
	public ControllerServlet() {
        super();
    }
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  HttpSession session = request.getSession(true);
	      PrintWriter out = response.getWriter();

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		String prof = request.getParameter("prof");
		String username = request.getParameter("username");
		DataModel model = new DataModel();
		int accountType = model.checkAccount(prof, password);
		if(accountType == 1){
			response.sendRedirect("/transaction.jsp?username="+username+"&prof="+prof);
			return;
		}
		if(accountType == 2){
			response.sendRedirect("/transaction.jsp?username="+username+"&prof="+prof);
		}
		else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			return;
		}
	}
	

	
	

}
