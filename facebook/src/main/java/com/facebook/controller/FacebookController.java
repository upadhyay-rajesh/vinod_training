package com.facebook.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;


public class FacebookController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		String address=request.getParameter("ad");
		
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		fb.setEmail(email);
		fb.setAddress(address);
		fb.setPassword(password);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.createProfileService(fb);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><body>");
		if(i>0) {
		out.println("Profile created successfuly Mr./Mrs. "+name);
		out.println("<br> to continue <a href=login.html>click here </a>");
		
		}
		else {
			out.println("could not create profile");
		}
		out.println("</body></html>");
		
	}

}
