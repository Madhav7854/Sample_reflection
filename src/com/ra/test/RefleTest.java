package com.ra.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefleTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        
		//caling privivate constructor of random class using reflection
		Constructor<Random> constructor = Random.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Random random1 = constructor.newInstance();
        System.out.println("random1....."+random1.hashCode());
        Random random2 = constructor.newInstance();
        System.out.println("random2....."+random2.hashCode());
        System.out.println(random1.equals(random2));
        
		Random r2 =Random.getInstance();
		Random r22 =Random.getInstance();
		System.out.println(r2.hashCode());
		System.out.println(r22.hashCode());
		System.out.println(r22.equals(r2));
		
	}

}
