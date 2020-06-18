import java.util.Scanner;

public class ValidLastName 
{
	public static boolean patternMatching( String pattern ) 
	{
	   return pattern.matches( "^([A-Z]{1}[a-z]{2,})$" );
	}
	   
	public static void main( String[] args ) 
	{
	   Scanner scan = new Scanner(System.in);	
	   		   
	   System.out.println("\nEnter the pattern");
	   String pattern = scan.nextLine();
      System.out.println(patternMatching(pattern));
	}
}




