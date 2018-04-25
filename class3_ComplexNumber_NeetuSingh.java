import java.util.Scanner;

public class class3_ComplexNumber_NeetuSingh {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the real part"); 
		int real1= scan.nextInt(); // taking user input for complex real part
		System.out.println("Enter the imaginary part");
		int img1= scan.nextInt(); // taking user input for complex imaginary part
		System.out.println("Enter the real part");
		int real2= scan.nextInt(); // taking user input for complex real part
		System.out.println("Enter the imaginary part");
		int img2= scan.nextInt(); // taking user input for complex imaginary part
		Complex c1 = new Complex(real1,img1,real2,img2);
		System.out.println("Two Complex numbers are " + c1.Display()); //calling the Display function
		System.out.println( "Sum of complex numbers "+ c1.Addition()); //calling the Addition function
	}

}
class Complex
{ int r1,i1,r2,i2;
	
	 Complex(int real1, int img1,int real2, int img2)// parameterized constructor
	{
		this.r1=real1;
		this.i1=img1;
		this.r2=real2;
		this.i2=img2;
	}
	public String Display() // function to display complex numbers
	{
	return r1 + "+" + i1 + "i" +" and " + r2 + "+" + i2 + "i" ;	// returning the numbers in complex number format
	}
	public String Addition() // function to add complex numbers
	{
		return((r1+r2)+ "+" + (i1+i2) + "i"); // returning the addition of two complex numbers
		
	}
	}
	
