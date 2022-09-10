package com.Demo;

public class Demo {
	public static void main(String[] args0) {
int x=20;
int y=80;
int z=90;

if(x>y && x>z) {
	System.out.println(x+" is greater than "+y+" and "+z);
	
}else if(y>z && y>x)
{
	System.out.println(y+" is greater than "+x+" and "+z);
}else
{
	System.out.println(z+" is greater than "+x+" and "+y);
}
}
}
