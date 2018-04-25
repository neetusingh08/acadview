
public class class3_AreaofRectangle_NeetuSingh {

	public static void main(String[] args) {
		Rectangle rec= new Rectangle(5,5); // calling parameterized constructor
		System.out.println( "Area of Rectangle for values being passed "+ rec.DisplayArea()); // calling the display function
		Rectangle rec1 = new Rectangle(); // calling default constructor
		System.out.println( "Area of Rectangle for default values "+ rec1.DisplayArea()); // calling the display function
		
	}}

class Rectangle
{ int l,b;

Rectangle() // default constructor
{ this(4,4); // default values. if no value is entered.
	}
Rectangle(int length, int breadth) // parameterized constructor
{ this.l=length;
this.b=breadth;
	}
public int DisplayArea() // function to calculate and return area
{ return l*b; // returning the area of rectangle.
	}}
