package org.jdiscript.example;

//A test class you can use for simple debugging scripts.
public class HelloWorld {
	private String helloTo;

	public HelloWorld() {
		this("World");
	}
	
	public HelloWorld(String helloTo) {
		this.helloTo = helloTo;
	}
	
	public String sayHello() {
		return "Hello, " + helloTo;
	}
	
	public static void main(String[] args) {
		HelloWorld hello;
		
		hello = new HelloWorld();
		System.out.println(hello.sayHello());
		
		hello = new HelloWorld("Barry");
		System.out.println(hello.sayHello());
		
		System.out.println(hello.sayHello());
	}
}
