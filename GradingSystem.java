package GEC20222C;
import java.util.Scanner;
// Write down a code that can be used to calculate the CGPA and grades of 5 courses.
//Start
//Get the course variables
//Enter the scores for each course
//Set the range for the grades
//Calculate the CGPA
public class GradingSystem {
	public static String Course1; 
	public static String Course2; 
	public static String Course3;
	public static String Course4;
	public static String Course5; 
	public static int Score1;
	public static int Score2;
	public static int Score3;
	public static int Score4;
	public static int Score5;
	public static char Grade1;
	public static char Grade2;
	public static char Grade3;
	public static char Grade4;
	public static char Grade5;
	public static float CGPA; 
	
			public static void main(String[] args) {
				getCourse1(); 
				getCourse2(); 
				getCourse3(); 
				getCourse4(); 
				getCourse5(); 
				getScore1();
				getScore2();
				getScore3();
				getScore4();
				getScore5();
				
			}
			public static void getCourse1() {
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter Course name1");
			Course1= input.nextLine(); 
			}
			public static void getCourse2() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Course name2");
				Course2= input.nextLine(); 
			}
			public static void getCourse3() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Course name3");
				Course3= input.nextLine(); 
			}
			public static void getCourse4() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Course name4");
				Course4= input.nextLine(); 
			}
			public static void getCourse5() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Course name5");
				Course5= input.nextLine();
			}
			public static void getScore1() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Score1");
				Score1= input.nextInt(); 
			}
			public static void getScore2() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Score2");
				Score2= input.nextInt(); 
			}
			public static void getScore3() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Score3");
				Score3= input.nextInt(); 
			}
			public static void getScore4() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Score");
				Score4= input.nextInt(); 
			}
			public static void getScore5() {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter Score");
				Score5= input.nextInt(); 
			}
			public static void getGrade1() {
				Scanner input = new Scanner(System.in);
				if(Score1 >= 70 && Score1 <=100) {
					Grade1 = 'A';
					System.out.print("The grade for " + Course1 + "Grade1");
				}
				if(Score1>=60 && Score2<=69) {
					Grade1='B'; 
					System.out.println("The grade for " + Course1 + "Grade1");
				}
			if(Score1>=50 && Score2<=59) {
				Grade1='c'; 
				System.out.println("The grade for " + Course1 + "Grade1");
			}
			if(Score1>=40 && Score4<=49) {
				Grade1='D';
				System.out.println("The grade for " + Course1 + "Grade1");
			}
			if(Score1>=30 && Score5<=39) {
				Grade1='F';
				System.out.println("The grade for " + Course1 + "Grade1");
			}
			}
			public static void getGrade2() {
				Scanner input = new Scanner(System.in);
				if(Score2>=60 && Score2<=69) {
					Grade2='B'; 
					System.out.println(Grade2);
				}
				
			if(Score3>=50 && Score2<=59) {
				Grade3='c'; 
				System.out.println(Grade3);
			}
			}

			public static void getGrade3() {
				Scanner input = new Scanner(System.in);
				if(Score3>=50 && Score2<=59) {
					Grade3='c'; 
					System.out.println(Grade3);
				}
			}
			public static void getGrade4() {
				Scanner input = new Scanner(System.in);
				if(Score4>=40 && Score4<=49) {
					Grade4='D';
					System.out.println(Grade4);
				}
			}
			public static void getGrade5() {
				Scanner input = new Scanner(System.in);
				if(Score5>=30 && Score5<=39) {
					Grade5='F';
					System.out.println(Grade5);
				}
			}
				
			
			
			
			
			
				
				
				
		
		
	}

