package com.arcus.javatrainings.collections.list.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}

		System.out.println(al);

		Iterator iter = al.iterator();

		while (iter.hasNext()) {
			Integer element = (Integer) iter.next();

			if(element%2 == 0)
				System.out.println(element);
				else
					iter.remove();
				}
				System.out.println(al);
			
			
		}
		
	

	}


