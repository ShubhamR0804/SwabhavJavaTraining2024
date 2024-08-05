package com.techlabs.reflector;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectorTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class intClass = Class.forName("java.lang.Integer");

		System.out.println(intClass.getName());
		System.out.println(intClass.getSimpleName());

		Method intMethod[] = intClass.getMethods();
		for (Method method : intMethod) {
			System.out.println(method.getName() + "\t" + method.getParameterCount());
			Parameter parameters[] = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println(parameter.getName() + parameter.getType());
			}
		}
		
		Constructor constructors[] = intClass.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName());
			System.out.println(constructor.getName());
			
			
		}
	}
}
