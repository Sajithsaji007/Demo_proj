package com.Demo;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Static array method 
//		int a[]=new int[5];	
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//		for(int i=0;i<5;i++) {
//			System.out.print(a[i]);
//			System.out.print(" ");
//		}
		
		
		//Dynamic array method 
		int a[]= {11,22,33,44,55,66,77};//declared without specifying the size.
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);//Extracts values from an array
			
			System.out.print(" ");

		}
		System.out.println(" ");
		System.out.println(a[2]);//Extracts specific value from an array
		System.out.println(a.length);//size of an array
		
		}

}
