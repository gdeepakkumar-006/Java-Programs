package com.basicprograms;
import java.util.Scanner;
public class FactorialPrograms {

	public static void main(String[] args) {
		 Scanner Scan=new Scanner(System.in);
		 System.out.println("enter the number:");
		 int num=Scan.nextInt();
		 int factorial=fact(num);
		 System.out.println("Factorial of entered number is:"+factorial);
		 Scan.close();
	}
	static int fact(int n)
	{
		int output;
		if(n==1) {
			return 1;
		}
			output=fact(n-1)*n;
			return output;
		}
	}


