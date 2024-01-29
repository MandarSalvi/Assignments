package com.mandar.webflux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mandar.webflux.dao.CustomerDao;
import com.mandar.webflux.dto.Customer;

import reactor.core.publisher.Flux;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao dao;
	
	public List<Customer> loadAllCustomers(){
		long startTimeMillis = System.currentTimeMillis();
		List<Customer> customers = dao.getCustomers();
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Total execution time: "+(endTimeMillis-startTimeMillis));
		return customers;
	}
	
	public Flux<Customer> fluxLoadAllCustomersStream(){
		long startTimeMillis = System.currentTimeMillis();
		Flux<Customer> customers = dao.getCustomersStream();
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Total execution time: "+(endTimeMillis-startTimeMillis));
		return customers;
	}

}
