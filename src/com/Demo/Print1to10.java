package com.Demo;

import java.util.Scanner;

public class Print1to10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int i=1;
while(i<=b) {
	System.out.print(i);
	System.out.print(" ");
	i++;
}
System.out.println(" ");
for(int j=1;b>=j;b--) {
	System.out.print(b);
	System.out.print(" ");
}
System.out.println(" ");
int a=1;
do
{
	
	System.out.print(a);
	System.out.print(" ");
	a++;
}while(a<=b);
System.out.println(" ");
int j=1;
while(b>=j) {
	System.out.print(b);
	System.out.print(" ");
	b--;
}
}
}
