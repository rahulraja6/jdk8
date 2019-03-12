package com.example.defaultmethod.example2;

public class MultipleInheritence implements IDefaultDemo1 , IDefaultDemo2{

	@Override
	public String getname() {
		return "jdk8";
	}

	@Override
	public String getdata(String param) {				//Diamond Problem
		return IDefaultDemo1.super.getdata(param);
	}
	public static void main(String[] args) {
		MultipleInheritence mi=new MultipleInheritence();
		System.out.println(mi.getdata(mi.getname()));
		System.out.println(mi.toString());
		
	}
	
	

}
