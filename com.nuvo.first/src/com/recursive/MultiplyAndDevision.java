package com.recursive;

public class MultiplyAndDevision {

	public static void main(String[] arg0) {
		
		int multuply1 = multiply(4,9);
		int multuply2 = multiply(-4,9);
		int multuply3 = multiply(4,-9);
		
		System.out.println("Multiply 1 = " + multuply1);
		System.out.println("Multiply 2 = " + multuply2);
		System.out.println("Multiply 3 = " + multuply3);
		

		division(100,7);
		division(25,-3);
		division(-25,-3);
		division(-25,3);
		division(0,-3);
		division(0,3);
		
		

	}

	public static int multiply(int x, int y) {
		/* 0 multiplied with anything gives 0 */
		if (y == 0) {
			return 0;

			/* Add x one by one */
		} else if (y > 0) {
			return (x + multiply(x, y - 1));

			/* the case where y is negative */
		} else if (y < 0) {
			return -multiply(x, -y);
		}
		return 0;
	}
	
	private static void division(int x, int y){

		if (y == 0){
			System.out.println("Division by 0 is unexcptable");
			return;
		}
		
		if ( x >= 0 ){
			if ( y > 0 ){
				division(x,y,false);
			}else {
				division(x,-y,true);
			}
		}else {
			if ( y > 0 ){
				division(-x,y,true);
			}else {
				division(-x,-y,false);
			}
		}

	}
	
	private static void division(int x, int y, boolean isNegative){
		int division = 0;
		
		while( x >= y ){
			x = x-y;
			division++;		
		}
		
		System.out.println("Division result = " + (isNegative? -division: division) + ", reminder = " + (isNegative? -x: x));
	}
}
