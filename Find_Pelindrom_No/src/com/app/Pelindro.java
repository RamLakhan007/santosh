package com.app;

public class Pelindro {
public static void main(String[] args) {
int x;
int sum=0;
int temp;
int y=98889;
temp=y;
while(y>0){
	x=y%10;
	sum=(sum*10)+x;
	y=y/10;
}
	if(temp==sum)
		System.out.println("palindrom");
	else
		System.out.println("no palindrom");
}
}