package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.RegisterServletDTO;

public interface RegisterServletDAO {
	public void add(RegisterServletDTO registerDTO) throws SQLException;

}
