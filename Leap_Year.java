import java.util.*;
public class Leap_Year {

	public static void main(String[] args) {
	System.out.println("Enter the year to check whether it is a leap year or not");
	Scanner scan= new Scanner(System.in);// user input for the year
	int year=scan.nextInt();
	if(year%4==0) // if year is divisible by 4 then it is a leap year else not.
	 {
		System.out.println("This year is a leap year");
	 }
	else
	{ System.out.println("The year is not a leap year");
	}

	}

}
