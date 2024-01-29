package com.mandar.webflux.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.yaml.snakeyaml.tokens.DocumentEndToken;

import com.mandar.webflux.dao.CustomerDao;
import com.mandar.webflux.dto.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {
	
	@Autowired
	private CustomerDao dao;
	
	public Mono<ServerResponse> loadCustomers(ServerRequest request){
		Flux<Customer> customerList = dao.getCustomerList();
		return ServerResponse.ok().body(customerList,Customer.class);
	}
	
	public Mono<ServerResponse> findCustomer(ServerRequest request){
		int customerId = Integer.valueOf(request.pathVariable("input"));
//		dao.getCustomerList().filter(c->c.getId()==customerId).take(1).single();
		Mono<Customer> customerMono = dao.getCustomerList().filter(c->c.getId()==customerId).next();
		return ServerResponse.ok().body(customerMono, Customer.class);
	}
	
	public Mono<ServerResponse> saveCustomers(ServerRequest request){
		Flux<Customer> customerFlux = request.bodyToFlux(Customer.class);
		Flux<String> saveResponseFlux = customerFlux.map(dto-> dto.getId()+" : " + dto.getName());
		return ServerResponse.ok().body(saveResponseFlux,String.class);
	}

}
