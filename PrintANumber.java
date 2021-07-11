//2. Java Program to Print an Integer (Entered by the User)
package Training;

import java.util.Scanner;

public class PrintANumber {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("enter a number");
	int a = scan.nextInt();
	
	System.out.println("The number is:"+ a);
	
}
}
