package com.project.sample.domain;


public class Greeter {
	
	 public void greetCustomer(String name) {
	        System.out.println(createGreeting(name));
	    }

	    public String createGreeting(String name) {
	        return "Hello, " + name + "!";
	    }

}
