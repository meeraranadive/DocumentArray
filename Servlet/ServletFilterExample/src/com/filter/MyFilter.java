package com.filter;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns = {"/reg"})
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("When Destroy called");
	}

	public MyFilter(){
		System.out.println("Myfileter constructor Called");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		System.out.println("DoFilter MEthod Called");
	    
		String error="Pls Enter All detail in perticuler filed";
		
		int id=Integer.parseInt(request.getParameter("oid"));
		String  name=request.getParameter("oname");
		String date=request.getParameter("odate");
		
		if(name.equals("") || date.equals("")) {
			
			request.setAttribute("msg", error);
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
		else if( !Pattern.matches("[a-zA-Z]", name) ||  !Pattern.matches("[0-9]", date)) {
			System.out.println("Ok done it");
			String msg1="Only Caractor used";
			request.setAttribute("ms", msg1);
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
		else {
			String s="Successsfully Registered";
			request.setAttribute("m", s);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("When Init Called");
	}

}
