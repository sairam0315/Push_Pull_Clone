package org.array;

public class Demo {
	public static void main(String[] args) {

		int i[] = new int[5];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		i[4] = 5;

		System.out.println(i[3]);
		
	int l = i.length;
	System.out.println(l);
	
	
	for (int j = 0; j < i.length; j++) {
		System.out.println(i[j]);
		
	}
	}  
}
