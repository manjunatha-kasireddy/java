package com.programs.self;
import java.util.Scanner;

public class Fibanacci {

	public static void main(String[] args) {
		int firstno = 0,secondno = 1,userno ,count = 0,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number : ");
		userno = sc.nextInt();
		 while(true) {
			 result = firstno + secondno;
			 count++;
			 if(result >= userno) {
				 break;
			 }
			 firstno = secondno;
			 secondno = result;
			 System.out.println("\n Fibanacci  no : " +count+"  =  "+result);
		 }

	}

}
