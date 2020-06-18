public class EmailSamples 		
{		
	public boolean email(String email) 
	{
	   return email.matches("^([a-z][a-z 0-9 \\ ]*[@][a-z]*[.][a-z . ]*)$");
	}
		   
	public static void main( String[] args ) 
	{
		EmailSamples emailSample = new EmailSamples();
		
	   System.out.println(emailSample.email("abc@yahoo.com"));	
	   System.out.println(emailSample.email("abc-100@yahoo.com"));
	   System.out.println(emailSample.email("abc.100@yahoo.com"));
	   System.out.println(emailSample.email("abc111@abc.com"));
	   System.out.println(emailSample.email("abc-100@abc.net"));
	   System.out.println(emailSample.email("abc.100@abc.com.au"));
	   System.out.println(emailSample.email("abc@1.com"));
	   System.out.println(emailSample.email("abc@gmail.com.com"));
	   System.out.println(emailSample.email("abc+100@gmail.com"));
	   
	   System.out.println("\n");
	   
	   System.out.println(emailSample.email("abc"));
	   System.out.println(emailSample.email("abc@.com.my"));
	   System.out.println(emailSample.email("abc123@gmail.a"));
	   System.out.println(emailSample.email("abc123@.com"));
	   System.out.println(emailSample.email("abc123@.com.com"));
	   System.out.println(emailSample.email(".abc@abc.com"));
	   System.out.println(emailSample.email(".abc()*@gmail.com"));
	   System.out.println(emailSample.email("abc@%*.com"));
	   System.out.println(emailSample.email("abc..2003@gmail.com"));
	   System.out.println(emailSample.email("abc.@gmail.com"));
	   System.out.println(emailSample.email("abc@abc@gmail.com"));
	   System.out.println(emailSample.email("abc@gmail.com.1a"));
	   System.out.println(emailSample.email("abc@gmail.com.aa.au"));	
	} 
}
