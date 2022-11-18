package GEC20222C;
import java.util.Scanner;
public class Question3 {
	public class OddNumbers1 {
		public static Scanner sc;
		public static void main(String[] args) 
		{
			int number, i;
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Number : ");
			number = sc.nextInt();	
			
			for(i = 1; i <= number; i++)
			{
				if(i % 2 != 0)
				{
					System.out.print(i +"\t"); 
				}
			}	
		}
	}
}
