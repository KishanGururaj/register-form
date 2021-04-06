package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wolken.wolkenapp.dto.RegisterServletDTO;

public class RegisterServletDAOImpl implements RegisterServletDAO{

	@Override
	public void add(RegisterServletDTO registerDTO) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Password@1234567890"))
		{
			try(PreparedStatement pre=con.prepareStatement("insert into wolken.register_table values(?,?,?,?,?)")){
				pre.setInt(1, registerDTO.getUserId());
				pre.setString(2, registerDTO.getName());
				pre.setString(3,registerDTO.getAddress());
				pre.setLong(4,registerDTO.getPhoneNo());
				pre.setString(5,registerDTO.getDate());
				System.out.println("data has been added");
				pre.executeUpdate();
				pre.close();


				
			}con.close();
		}
	}
	

}
