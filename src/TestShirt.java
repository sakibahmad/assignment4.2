//TestShirt extend the feature of Shirt class
public class TestShirt extends Shirt {
		//Shirt class method
	public void tailor(){
		System.out.println("\nthe measurement  of the shirt and fabric  ");
	}

		//main function
public static void main(String [] args){
		//creating object for shirt class
	TestShirt ob=new TestShirt();
	
	ob.tailor();
	System.out.println( "\nprinting  from default constructor  ");
	Shirt obj=new Shirt();
	
	System.out.println("\n printing  from parameterized constructor ");
	Shirt obj1=new Shirt(45,20);
	System.out.println("\nvia get and set method");
	obj.getShirtLength();
	obj.setShirtLength( 411);
	
}}


