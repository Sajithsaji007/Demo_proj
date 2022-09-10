package com.Demo;

public class JumpingStstement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i>5) {
				break;}
				System.out.print(i);
			}
		System.out.println(" ");
		for(int i=1;i<=10;i++) {
			if(i==5 || i==7 || i==9) {
				continue;
				}
				System.out.print(i);
			}
		
	}

}
