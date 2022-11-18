package GEC20222C;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main (String[] args) {
		 i();	 
	}
	static void i() {
		int n, count=0; 
		System.out.print("Enter any Number");
		Scanner input=new Scanner (System.in);
		n=input.nextInt();
		input.close();
		
		for(int i=1; 1<=n; i++) {
			if(n%1==0) { 
				count++;
			}
		{if(count==2) 
			System.out.print(+n+" is a prime number");
		
		else
			System.out.print(+n+" is not a prime number");
	}
}
	}
}
		
	