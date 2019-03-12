package com.example.defaultmethod.example2;

public interface IDefaultDemo1 extends IDefaultDemo2{
	String MESSAGE="IDefaultDemo1";
	String getname();
	static String getdata(){
		return MESSAGE;
	}
	//Extension Methods
	default String getdata(String param){
		return MESSAGE.concat(param);
	}
	// Object method cannot be overriddden default,static(method with same signature)
/*	default String toString(){
		return "";
	}*/
}
