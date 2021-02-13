package com.service;

import java.util.List;

import com.dao.DaoI;
import com.dao.DaoImpl;
import com.model.Client;

public class ServiceImpl implements ServiceI {

	DaoI d=new DaoImpl();
	
	@Override
	public void insertData(Client client) {

		System.out.println("In service Layer : " + client );
		d.insertData(client);
	}

	@Override
	public List<Client> getAllData(String u, String p) {
		List<Client>  clist= d.getAllData(u, p);
		return clist;
	}

}
