import java.util.*;
public class Pattern {

	public static void main(String[] args) {
	System.out.println("Enter the number of rows you want to print");
	Scanner scan = new Scanner(System.in);// user input for no. of rows.
	int row= scan.nextInt();
	for(int i=0;i<row;i++)// iterate till the no. of rows user wants.
	   { for(int j=0;j<=i;j++) // iterate for no. of stars in each row.
	       {
		   System.out.print("*" + "");
	       }
	   System.out.println("");
		
	   }
	
	}

}
