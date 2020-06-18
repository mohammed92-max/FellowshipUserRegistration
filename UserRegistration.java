import java.util.Scanner;

public class ValidEmail 
{
	public static boolean patternMatching( String pattern ) 
	{
	   return pattern.matches( "^([a-z][a-z 0-9 \\ ]*[@][a-z]*[.][a-z . ]*)$" );
	}
	   
	public static void main( String[] args ) 
	{
	   Scanner scan = new Scanner(System.in);	
	   		   
	   System.out.println("Enter the pattern");
	   String pattern = scan.nextLine();
       System.out.println(patternMatching(pattern));
	}
}
