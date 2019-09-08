package com.example.rest.webservices.restfulwebservices;

public class HelloWorldBean {
	private int count;
	private String message;
	
	public HelloWorldBean(int count, String message) {
		this.count = count;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [count=" + count + ", message=" + message + "]";
	}
	
}
