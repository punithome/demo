package com.resteasy.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.resteasy.service.HelloService;

public class HelloApplication extends Application{
	
	private Set<Object> singletons = new HashSet<>();
	
	public HelloApplication(){
		singletons.add(new HelloService());
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
