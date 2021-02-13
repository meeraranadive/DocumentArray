package com.service;

import java.util.List;

import com.model.Client;

public interface ServiceI {

	void insertData(Client client);
	
	List<Client> getAllData(String u,String p);
	
}
