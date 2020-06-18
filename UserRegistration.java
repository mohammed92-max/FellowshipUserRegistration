import java.util.Scanner;

public class ValidMobile 
{
	public static boolean patternMatching( String pattern ) 
	{
	   return pattern.matches( "^([9]{1}[1]{1}([\\\\w ]+)[1-9]{1}[0-9]{9})$" );
	}
	   
	public static void main( String[] args ) 
	{
	   Scanner scan = new Scanner(System.in);	
	   		   
	   System.out.println("Enter the pattern");
	   String pattern = scan.nextLine();
       System.out.println(patternMatching(pattern));
	}
}
