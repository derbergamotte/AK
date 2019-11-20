package com.name.testX;

public class Main {

	public static void main(String[] args) {
	divisio(10, 7);
		
		
	}
	
	public static void divisio(int x, int y) {
		try {
			int c= x/y;
			int d= x%y;
			System.out.print(c+".");
			for (int i=0; i<5 && d!=0; i++) {
				c = d*10/y;
				d = d*10%y;
				System.out.print(c);
			}
			System.out.println();
		
		}catch(Exception e) {
			System.out.println("Деление на ноль(a/0)!");
	
		}
	}

}
