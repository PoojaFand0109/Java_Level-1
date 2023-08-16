package com.level_1;

public class StringReverse {
	
	 public static void main(String[] args) {
	        String original = "APPLE";
	        String reversed = reverseString(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
	    
	    public static String reverseString(String input) {
	        char[] characters = input.toCharArray();
	        int length = characters.length;
	        for (int i = 0; i < length / 2; i++) {
	            char temp = characters[i];
	            characters[i] = characters[length - i - 1];
	            characters[length - i - 1] = temp;
	        }
	        return new String(characters);
	    }

}
