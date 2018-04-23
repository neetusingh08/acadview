import java.util.*;
public class Linear_search {

	public static void main(String[] args) {
		
		System.out.println("Enter the no. of elements ");
		Scanner scan = new Scanner(System.in); // for no. of elements in array
		  int num = scan.nextInt();
		  int ele[] = new int[num]; //declare array ele for storing int values
		System.out.println("Enter the elements ");
		   for(int i =0 ;i<num;i++) // iterating to enter elements in array
		{
			ele[i] = scan.nextInt();
		}
		
   System.out.println("Enter the element to be searched"); 
     int search = scan.nextInt(); // store the element to be searched in variable search
     boolean found = false;
        for(int i : ele) // iterate array to search for value
        {
	        if(i == search) // if search element is in the array
	          {
		        found = true; 
		        break;
		        }
	        else
	          {
	        	found = false; 
                } 
	        }
        if (found) {
        	System.out.println("yes"); // print yes
        }
        else {
        	System.out.println("no");// else print no
        }
        
   }
	 }
