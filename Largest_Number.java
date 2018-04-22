import java.util.*;
public class Largest_Number {

	public static void main(String[] args) {
	System.out.println("Enter the three numbers :");
	Scanner scan = new Scanner(System.in);
    int num1= scan. nextInt(); // input for three numbers.
    int num2= scan. nextInt();
    int num3= scan. nextInt();
     if(num1>num2 && num1> num3) // condition to check whether 1st number is greater than the two or not.
       { 
    	 System.out.println("The largest number is " + num1);
       }
     else if(num2>num1 && num2>num3) //condition to check whether 2nd number is greater than the two or not.
       {
    	 System.out.println("The largest number is " + num2);
       }
     else // if the above two conditions are false then obviously the 3rd number is greatest among all.
       {
    	 System.out.println("The largest number is " + num3);
       }
	   }

}
