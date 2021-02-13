package com.dao;

import java.util.List;

import com.model.Client;

public interface DaoI {

	void insertData(Client client);
	
	List<Client> getAllData(String u,String p);
}
