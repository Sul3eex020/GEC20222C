package GEC20222C;
import java.util.Scanner;
//write a program that accepts the necessary inputs to calculate the area of a triangle and rectangle
		//define length (L)
		//define breadth (B)
		//define the area (L x B)
		
		//define the base of the triangle (B)
		//define the height of the triangle (H)
		//define the area (1/2(H x B)
public class Question2 {
	public static int area;
	public static int b;
		public static int l;
		
		public static int area2;
		public static int base;
		public static int height;
		
		public static void main (String [] args) {
			getLength();
			getBreadth();
			getArea();
			getBase();
			getHeight();
			getArea2();
			
		}
		
		public static void getLength() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Length of Rectangle " + l);
			l =  input.nextInt();
		}
		
		public static void getBreadth() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Breadth of Rectangle " + b);
			b =  input.nextInt();
		}
		
		public static void getArea() {
			area = (l * b);
			System.out.println("The Area of the Rectangle is " + area);
		}
		
		
		public static void getBase() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Base of the Triangle " + base);
			base =  input.nextInt();
		}
		
		public static void getHeight() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Base of the Triangle " + height);
			height =  input.nextInt();
		}
		
		public static void getArea2() {
			area2 = (base*height) / 2;
			System.out.println("The Area of the Triangle is " + area2);
		}



	}

