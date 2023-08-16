package com.level_1;

public class Addition_Without_Plus {
	
	   public static void main(String[] args) {
	        int a = 5;
	        int b = 7;
	        int sum = addNumbers(a, b);
	        System.out.println("Sum: " + sum);
	    }
	    
	    public static int addNumbers(int a, int b) {
	        while (b != 0) {
	            int carry = a & b; 
	            a = a ^ b; 
	            b = carry << 1;
	        }
	        return a;
	    }

}
