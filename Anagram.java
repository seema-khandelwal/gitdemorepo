package com.te.javabasic.pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string");
        String s1=scanner.next();
        System.out.println("Enter the second string");
        String s2=scanner.next();
		/*
		 * if(checkAnagram(s1,s2)) { System.out.println(s1+""+""+s2+"are anagram"); }
		 */
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        s2=s2.replaceAll("\\s", "");
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(s1.length()==s2.length()) {
        	if(Arrays.equals(c1, c2)) {
        		System.out.println("strings are anagram"); 
        		
        	}else {
        		System.out.println("strings are not anagram");
        	}
        }
        else {
        	System.out.println("strings are not anagram");
        }
        scanner.close();
}

/*
 * private static boolean checkAnagram(String s1, String s2) { // TODO
 * Auto-generated method stub return false; }
 */
}
