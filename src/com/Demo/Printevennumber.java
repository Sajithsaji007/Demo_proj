package com.Demo;

import java.util.Scanner;

public class Printevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=2;
while(i<=a) {
	System.out.print(i);
	System.out.print(" ");
	i+=2;
}
System.out.println(" ");
for(i=2;i<=a;i+=2) {
	System.out.print(i);
	System.out.print(" ");
}
System.out.println(" ");
int j=2;
do
{
	System.out.print(j);
	System.out.print(" ");
	j++;
}while(j<=a);
	}
}