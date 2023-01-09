package com.example.restSer;

public class HelloWorldBean {

	public String msg;

	public HelloWorldBean(String string) {
		// TODO Auto-generated constructor stub
		this.msg=string;
	}

	public HelloWorldBean(String string, String name) {
		// TODO Auto-generated constructor stub
		this.msg= string+name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + "]";
	}
	

}
