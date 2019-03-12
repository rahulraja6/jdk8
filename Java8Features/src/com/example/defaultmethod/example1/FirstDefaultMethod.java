package com.example.defaultmethod.example1;

import com.example.defaultmethod.example1.IDefaultDemo;

public class FirstDefaultMethod implements IDefaultDemo {
public static void main(String[] args) {
	System.out.println(IDefaultDemo.getdata());				//Static Method
	FirstDefaultMethod obj=new FirstDefaultMethod();		
	System.out.println(obj.getdata("jdk8"));				//Default Method
	IDefaultDemo demo=new IDefaultDemo(){					//Anonymous Implementation
		@Override
		public String getname() {
			return "jdk8";
		}
	};
	System.out.println(demo.getdata(demo.getname()));
}
//public abstract String getdata(String param);			//Can make it abstract so the subclass can provide implementation

@Override
public String getname() {
	return null;
}
}
