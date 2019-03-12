package com.example.defaultmethod.example3;

public interface IMyData {
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}
//default boolean isNull(String str)			--> making it default , we can override
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
