package com.example.defaultmethod.example3;

public class MyDataImpl implements IMyData {

	//@Override throws compilation error
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");			//it is not overriding
		boolean result = IMyData.isNull("abc");	// Calling static method
	}
}
