package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Order;

@WebServlet(urlPatterns = "/reg",loadOnStartup = 0)
public class RegisterServlet extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("oid"));
		String name=request.getParameter("oname");
		String date=request.getParameter("odate");
		
		Order o=new Order();
		o.setOid(id);
		o.setOname(name);
		o.setOdate(date);
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		
	}
	
}
