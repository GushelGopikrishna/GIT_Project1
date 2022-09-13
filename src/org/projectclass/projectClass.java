package org.projectclass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.lang.model.util.Elements;

public class projectClass {
	
	
	public static void main(String[] args) {
		List <Object> l = new LinkedList<>();
		
		Object a[]= {'s',78,23.23,1234.76545678f,987656789l,"Gopikrishna"};
		for (Object x : a) {
			l.add(x);
		}
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(70);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(100);
		l.add(12);
		l.add(45);
		l.add(30);
		l.add(20);
		System.out.println(l);
			
		System.out.println(l.size());
		System.out.println(l.contains(20));
		System.out.println(l.contains(34));
		System.out.println(l.indexOf(12));
		System.out.println(l.lastIndexOf(20));
		System.out.println(l.get(3));
		System.out.println(l.isEmpty());
		System.out.println("End of Program");
	}

}
