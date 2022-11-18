package GEC20222C;
import java.util.Scanner;
//write a program that accepts the necessary inputs to compute the area of a circle and its circumference.
//Input the r
//input the pi
//input the area
//input the circumference

public class Question4 {
	public static int r=5;
	public static double pi=3.14;
	public static double area=35;
	public static double circumference=6;
	
	public static void main (String [] args) {
		getArea();
		getCircumference();
		getRadius();
	}
	
	public static void getRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("Radius of the circle " + r);
		r =  input.nextInt();
	}
	
	public static void getArea() {
		area = pi * (r^2);
		System.out.println("Area of the Circle = " + area);
	}
	
	public static void getCircumference() {
		circumference = 2 * pi * r;
		System.out.println("Circumference of the Circle = " + circumference);
		
	}

}
