import java.util.*;
public class Palindrome_Num {

	public static void main(String[] args) {
		int reverse =0;
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);// user input for the number.
		int num =  scan.nextInt();
		int temp= num; // store the original number in a temporary variable.
		while(num!=0) // if number is not equal to 0, then 
		{
			 reverse=reverse*10; // multiple the variable by 10 and store it in the variable itself.
			 reverse= reverse+num%10;// add the number stored in reverse and the remainder of number when divided by 10,then store it in reverse variable itself.
			num = num/10;// divide the number by 10.
			
		}
if(temp==reverse) // if the number is same as the number you get as output after applying the logic, then number is palindrome else not.
      {
	System.out.println("Number is palindrome");
      }
else
     {
	System.out.println("Number you entered is not a palindrome");
	 }
	}

}
