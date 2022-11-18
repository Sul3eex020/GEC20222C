import java.util.Scanner;

public class InputOutput {
	public static String name ;
	public static int age;
	public static String department; 
	public static String Id;
	
    public static void main (String [] args) {
        getName() ;
        getDepartment() ; 
        getAge() ; 
        getId() ; 
        myInfo() ;
    }
    
    public static void getName() {
    	Scanner input = new Scanner (System.in) ;
    	System.out.println("Enter your name:") ;
    	name = input.nextLine() ; 
    }
    public static void getDepartment() {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter your department") ;
        department = input.nextLine() ;
    }
   
   	public static void getAge() {
   	    Scanner input = new Scanner (System.in) ;
   	    System.out.println("Enter your Age:") ;
   	    age = input.nextInt() ;
    }
   	public static void getId() {
   	Scanner input = new Scanner (System. in) ; 
   	System.out.println("Enter your Id:") ; 
   	Id = input.nextLine() ; 
   	}
    public static void myInfo() {

      	 System.out.println("My name is " + name + " I am " + age + " Years Old" +  " I am in " + department +"." 
      	 		 ) ;
}
}




