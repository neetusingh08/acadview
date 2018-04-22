import java.util.*;
public class Reverse_of_a_Number {
	public static void main(String[] args)
	{
		int reverse=0;
  System.out.println("Enter the number");
	Scanner scan=new Scanner(System.in);
	int num = scan.nextInt();
	while(num!=0)
	{
		 reverse=reverse*10;// multiple the variable by 10 and store it in the variable itself.
		 reverse= reverse+num%10; // add the number stored in reverse and the remainder of number when divided by 10,then store it in reverse variable itself.
		num = num/10; // divide the number by 10.
		
	}System.out.println("Reverse of the number" + reverse ); // print the reverse variable .
}}
