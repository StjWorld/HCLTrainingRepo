package com.mtumer;

public class MyMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		String out = employee.toString();
		
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say(out);
		
	}

}
