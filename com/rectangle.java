package com;

public class rectangle {
int length;
int width;
void insert(int l,int w)
{
	length=l;
	width=w;
}
void calculateArea()
{
	System.out.println("Area of the Rectangle  " + (length*width));
}
}
