import java.util.Scanner;

public class RuleFour 
{
	public static boolean patternMatching( String pattern ) 
	{
	   return pattern.matches( "([ 0-9{1,} A-Z{1,} ?=.*[@#$%^&+=]{1}  a-z  ]{7,})$" );
	}
	   
	public static void main( String[] args ) 
	{
	   Scanner scan = new Scanner(System.in);	
	   		   
	   System.out.println("Enter the pattern");
	   String pattern = scan.nextLine();
       System.out.println(patternMatching(pattern));
	}
}
