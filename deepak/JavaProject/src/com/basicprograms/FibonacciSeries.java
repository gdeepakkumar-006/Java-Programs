package com.basicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

int n=2,t1=0,t2=1;
System.out.println("upto"+n+":");

while(t1<=n) {
	System.out.print(t1+"+");
	int sum=t1+t2;
	t1=t2;
	t2=sum;
}

	}

}
