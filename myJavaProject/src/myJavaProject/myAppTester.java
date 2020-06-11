package myJavaProject;
import java.util.*;

public class myAppTester {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("Hello World");
		System.out.println("On the new branch b1");
		String message =  Message();
		System.out.print("Your Message is : "+ message);
		
		
		
	}

	public static String Message()
	{
		System.out.println("Enter a message Please");
		String msg= sc.nextLine();
		
		return msg;
		
	}
}
