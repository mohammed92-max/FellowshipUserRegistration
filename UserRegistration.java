import java.util.Scanner;

public class RuleOne
{
	public static boolean patternMatching( String pattern ) 
	{
	   return pattern.matches( "^([A-Z a-z]{8,})$" );
	}
	   
	public static void main( String[] args ) 
	{
	   Scanner scan = new Scanner(System.in);	
	   		   
	   System.out.println("Enter the pattern");
	   String pattern = scan.nextLine();
      System.out.println(patternMatching(pattern));
	}
}
