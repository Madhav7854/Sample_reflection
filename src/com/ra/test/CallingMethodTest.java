package com.ra.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallingMethodTest {
	static Method method =null;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("com.ra.test.Toy");
		Object obj =clazz.newInstance();
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method :methods) {
			System.out.println(method);
		}
		
		System.out.println("....................");
		
		//invoke without parameter method
		method =clazz.getDeclaredMethod("play");
		method.invoke(obj);
		
		System.out.println("....................");
		
		//calling a single parameter
		Class[] paramType1 = new Class[] {String.class};
		method=clazz.getDeclaredMethod("play", paramType1);
		System.out.println(method);
		String ree=(String)method.invoke(obj, "electronic");
		System.out.println(ree);
		
		System.out.println("....................");
		
	    //calling method multiple parameters
		Class[] paramTypes = new Class[] {String.class,int.class};
		method = clazz.getDeclaredMethod("play", paramTypes);
		System.out.println(method);
		String re=(String) method.invoke(obj, "magnetic",10);
		System.out.println(re);
	}

}
