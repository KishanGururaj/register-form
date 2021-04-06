package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dao.RegisterServletDAO;
import com.wolken.wolkenapp.dao.RegisterServletDAOImpl;
import com.wolken.wolkenapp.dto.RegisterServletDTO;

public class RegisterServletServiceImpl implements RegisterServletService{
	RegisterServletDAO registerDAO=new RegisterServletDAOImpl();

	@Override
	public void validateAndSave(RegisterServletDTO registerDTO) {
		// TODO Auto-generated method stub
		if(registerDTO.getUserId()>0) {
			if(registerDTO.getName()!=null) {
				if(registerDTO.getAddress()!=null) {
					if(registerDTO.getPhoneNo()>0) {
						if(registerDTO.getDate()!=null) {
							try {
								registerDAO.add(registerDTO);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}else {
							System.out.println("wrong date ");
						}
					}else {
						System.out.println("wrong phone no");
					}
				}else {
					System.out.println("wrong address");
				}
			}else {
				System.out.println("wrong name");
			}
		}else {
			System.out.println("wrong userID");
		}
		
	}

	

}
