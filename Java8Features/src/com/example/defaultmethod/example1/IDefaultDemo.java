package com.example.defaultmethod.example1;

public interface IDefaultDemo {
	String MESSAGE="Hi";
	String getname();
	static String getdata(){
		return MESSAGE;
	}
	//Extension Methods
	default String getdata(String param){
		return MESSAGE.concat(param);
	}
	
}
