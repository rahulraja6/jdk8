package com.example.defaultmethod.example2;

public interface IDefaultDemo2 {
	String MESSAGE="IDefaultDemo2";
	String getname();
	static String getdata(){
		return MESSAGE;
	}
	//Extension Methods
	default String getdata(String param){
		return MESSAGE.concat(param);
	}	
}
