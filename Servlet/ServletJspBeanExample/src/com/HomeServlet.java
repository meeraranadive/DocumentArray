package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class HomeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Student s=new Student();
		 s.setId(1);
		 s.setName("ABC");
		 s.setAddress("PUNE");
		 
		 Student s1=new Student();
		 s1.setId(2);
		 s1.setName("ABCD");
		 s1.setAddress("Akurdi");
		 
		 List<Student> list=new ArrayList<Student>();
		 list.add(s);
		 list.add(s1);
		 
		 String msg="Data send to success page";
		 
		 request.setAttribute("data", s);
		 request.setAttribute("data1", s1);
		 request.setAttribute("m", msg);
		 request.setAttribute("l", list);
		 
		 RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		 rd.forward(request, response);
	}
	
}
