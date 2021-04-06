package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.RegisterServletDTO;
import com.wolken.wolkenapp.service.RegisterServletService;
import com.wolken.wolkenapp.service.RegisterServletServiceImpl;
//@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	public RegisterServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("request object is created ");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("resources have been intialised");
	}
	RegisterServletDTO registerDTO=new RegisterServletDTO();
	RegisterServletService registerService=new RegisterServletServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// TODO Auto-generated method stub
		String userId=req.getParameter("id");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String phoneNo=req.getParameter("phno");
		String date=req.getParameter("date");
		int userId1=Integer.parseInt(userId);
		long phoneNo1=Long.parseLong(phoneNo);
		registerDTO.setUserId(userId1);
		registerDTO.setName(name);
		registerDTO.setAddress(address);
		registerDTO.setPhoneNo(phoneNo1);
		registerDTO.setDate(date);
		registerService.validateAndSave(registerDTO);
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("namsate "+name );
		printWriter.println("Your into gaming world");
		printWriter.flush();
		printWriter.close();
	}
	
	
	
	
	
	
	
	/*
	 * @Override protected void doPost(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException {
	 * 
	 * }
	 */
	 
@Override
public void destroy() {
	// TODO Auto-generated method stub
	System.out.println("closing all costly resources");
}
}
