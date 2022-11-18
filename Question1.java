package GEC20222C;
import java.util.Scanner;
//Write a program that accepts a student course name,credit unit and calculate their grade.
//Get the the course name
//Get the the course credit unit.
//Calculate their grade.
public class Question1 {
	public static String Coursename ="Java";
	public static int Creditunit = 3;
    public static char Grade= 74;
    public static int Score= 74;
    
public static void main(String[] args) {
	getCoursename();
	getScore();
	getCreditunit();
	Grade();
	
}
public static void getCoursename() {
	Scanner input=new Scanner(System.in) ; 
    System.out.println("Enter Your Course Name:");
    Coursename=input.nextLine() ; 
}
public static void getCreditunit() {
	Scanner input=new Scanner(System.in) ; 
    System.out.println("Enter Creditunit:");
    Creditunit=input.nextInt() ; 
}
public static void getScore() {
	Scanner input=new Scanner(System.in) ; 
    System.out.println("Enter Score:");
    Score=input.nextInt() ; 
}
public static void Grade() {
		if (Score >= 70 && Score <= 100) {
			Grade = 'A';
			System.out.println("The grade is" + " A");
		}
		if (Score >= 60 && Score <= 69) {
			Grade = 'B';
			System.out.println("B");
		}
		if (Score >= 50 && Score <= 59) {
			Grade = 'C';
			System.out.println("C");
		}
		if (Score >= 40 && Score <= 49) {
			Grade = 'D';
			System.out.println("D");
		}
		if (Score >= 0 && Score <= 39) {
			Grade = 'F';
			System.out.println("F");
	
}
	}
}
