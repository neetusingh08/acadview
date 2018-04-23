import java.util.*;
public class Addition {

	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers"); 
		Scanner scan= new Scanner(System.in);
		int a= scan.nextInt(); //input for two numbers.
		int b= scan.nextInt();
		int add=a+b; // adding of the two numbers.
		System.out.println("Addition of two numbers :" + add); // print statement for output of addition

	}

}
