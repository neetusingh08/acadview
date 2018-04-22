import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		int temp=0;
		System.out.println("Enter the number");
		Scanner scan= new Scanner(System.in); // get user input for the number.
		int num= scan.nextInt();
		if(num==0 && num==1) // if number is 0 or 1 then the number is not prime.
		{
			System.out.println("Number is not prime");
		}
		for(int i=2;i<=num;i++)
		{
             temp = num%i;// dividing the number by ever number below it , if it gives remainder as 0, then is prime else not.
		}
            if(temp==0)
            {
            	System.out.println("Number is not prime");
            	
            }
            else
            {
            	System.out.println("Number is Prime");
            }
		  
	}

}
