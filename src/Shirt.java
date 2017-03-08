/*PROGRAM USES BASIC OOPS FEATURE 
 * IN THE PROGRAM we will be calling our method using default constructor
 * parameterised constructor and will try to change the value of shirtlength
 * and collorlength 
 * 
 */

//declaring class Shirt
public class Shirt {
	// properties of the class Shirt
	private int ShirtLength;
	private int CollorLength;
	private String material;
	// default constructor

	Shirt() {
		// making material cotton final as per the question
		final String material = "Cotton";
		this.ShirtLength = 12;
		// defining shirtlength and collorlength
		this.CollorLength = 11;
		System.out.println("\n" + material);
		System.out.println("Collor length in default costructor " + CollorLength);
		System.out.println("Shirt Length in default constructor " + ShirtLength);

	}

	// parameterized constructor changing the value of its parameter
	Shirt(int ShirtLength, int CollorLength) {
		// printing changed in the value
		System.out.println("Collor length in parameterized constructor  " + CollorLength);
		System.out.println("Shirt Length parameterized  " + ShirtLength);

	}
	// get method to get the value for the Shirtlength

	public int getShirtLength() {
		System.out.println("shirt length in get metod " + ShirtLength);
		return ShirtLength;
	}

	// set method to set the value of shirtlength
	public void setShirtLength(int shirtLength) {
		ShirtLength = shirtLength;
		System.out.println("Shirt Length set by set method passed by get method " + ShirtLength);
	}

	// get method to get the value for the Collorlength
	public int getCollorLength() {
		return CollorLength;
	}

	// set method to set the value of Collorlength
	public void setCollorLength(int collorLength) {
		CollorLength = collorLength;
	}
}
