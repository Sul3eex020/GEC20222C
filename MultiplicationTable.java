package GEC20222C;

import java.util.Scanner;

public class MultiplicationTable {
public static int number; 

public static void main(String[] args) {
	multiply();
}

public static void multiply() { 
	Scanner s= new Scanner(System.in);
	System.out.print("Enter number");
	int n= s . nextInt(); 
	for(int i=1; i<=12; i++)
	{
    System.out.println(n+" * "+i+" = "+n*i);
}
}
}
