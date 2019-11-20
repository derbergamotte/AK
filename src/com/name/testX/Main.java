package com.name.testX;

public class Main {

	public static void main(String[] args) {
		int a = 12; 
		int b = 0;
		double c = divisio(a, b);
		System.out.println(c);
		
	}
	
	public static double divisio(double x, double y) {
		try {
			double result = (y!=0)? x/y: 1/0;
			return result;
		}catch(Exception e) {
			System.out.println("Деление на ноль(a/0)!");
			return 0;
		}
	}

}
