package GEC20222C;
import java.util.Scanner;
//start
//create a variable named number=1
//create if variable named sum=0
//check if the number falls between 1 and 100
//increment the number
//check if the number is an odd number
//sum up all the odd numbers between 1 and 100
//end
public class ClassWork {
	public static void main(String[] args) {
		sumOfOddNumbers();
	}
	
public static void sumOfOddNumbers() {
	int number= 1;
	int sum=0;
	while(number <=100) {
		if(number%2 == 1) {
			sum = sum + number;
			System.out.println(number + " is an odd number between 1 and 100");
		}
		number++;
	}
}
}
