import java.io.*;
import java.util.*;
public class class10_ReadFilePaths_NeetuSingh {

	public static void main(String[] args) throws IOException {
		FileWriter out = null;
		System.out.println("Enter no. of paths"); // multiple user input for paths.
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int j=0;j<num;j++)
		{
		  System.out.println("Enter the path"); 
		  Scanner scan1 = new Scanner(System.in);
	      String path = scan1.nextLine().trim();
		  File file = new File(path);
		
//		File file = new File("E:\");  // for single file path
		  String[] filename =file.list();
          File[] files = file.listFiles();

             try
              {   out = new FileWriter("abc.txt",true);
        	      for(int i=0;i<=filename.length;i++)
        	       {
//        		System.out.println(filename[i]);
        		    out.write(filename[i] + "\n");	
                	}
        	}
             catch(Exception e)
             {
        	    System.out.println(e);
              }
             finally
              { if(out != null)
        	 out.close();
              }
        
		}
	}
}
		
		
		
		
		
		
