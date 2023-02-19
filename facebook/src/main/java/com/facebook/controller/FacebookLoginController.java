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


public class FacebookLoginController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		
		FacebookUser fb=new FacebookUser();
		fb.setEmail(email);
		fb.setPassword(password);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.loginProfileService(fb);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><body>");
		if(i>0) {
		out.println("Welcome "+email);
		out.println("<br> <a href=FacebookViewProfileController>view profile </a>");
		out.println("<br> <a href=FacebookViewAllProfileController>view all profile </a>");
		out.println("<br> <a href=FacebookDeleteProfileController>delete profile </a>");
		out.println("<br> <a href=FacebookEditProfileController>edit profile </a>");
		
		}
		else {
			out.println("Invalid id and password");
			out.println("<br> <a href=login.html>login again </a>");
		}
		out.println("</body></html>");
		
	}

}
