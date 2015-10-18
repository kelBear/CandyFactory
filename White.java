//****************************************************************************************
//White Class (Assignment 2)
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This class is a template to create white chocolates
//<List of Identifiers>
//		nuts - represents whether the chocolate contains nuts or not (boolean)
//		whiteID - represents the ID number of a white chocolate made by the user (byte)
//		numWhite - counts the total number of white chocolates made by the user (byte)
//<Process>
//		- accessor, mutator, and constructor methods are called from the use class based on the need
//		- when changing a value, mutator methods are called
//		- when getting information, accessor methods are called
//		- when first constructing a candy, either default or the overloaded constructor is called
//		- when searching for a candy, the overloaded constructor and equals method are called
//		- when displaying information, volume and calories methods are uesd to determine the values and
//		  toString method is used to output all information to the user
//****************************************************************************************
public class White extends Chocolate {

	private boolean nuts;
	private static byte numWhite = 0;
	private byte whiteID = 0;

	/**Default Constructor
	 * This method sets the initial values of the variables based on a default setting
	 * 
	 * @param test - determines whether a white chocolate is made or not (boolean)
	 */
	public White (boolean test){
		super(test);
		nuts = false;
		numWhite++;
		whiteID = numWhite;
	}	//ends default constructor

	/**Overload Constructor
	 * This method initializes values of the variables based on a user input
	 * 
	 * @param test - determines whether a dark chocolate is made or not (boolean)
	 * @param nuts - represents whether the chocolate contains nuts or not (boolean)
	 * @param length - the length of the rectangular prism of the chocolate bar (double)
	 * @param width - the width of the rectangular prism of the chocolate bar (double)
	 * @param height - the height of the rectangular prism of the chocolate bar (double)
	 * @param sugar - represents the sugar content of the chocolate bar (int)
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public White (boolean test, boolean nuts, double length, double width, double height, int sugar, String factName){
		super(test, length, width, height, sugar, factName);
		this.nuts = nuts;
		numWhite++;
		whiteID = numWhite;
	}	//ends overloaded constructor
	
	/**Overload Constructor
	 * This method initializes the ID number of the candy when needed to search a candy
	 * 
	 * @param test - determines whether a white chocolate is made or not 
	 * @param whiteID - represents the ID number of a white chocolate made by the user (byte)
	 */
	public White (boolean test, byte whiteID){
		super(test);
		this.whiteID = whiteID;
	}	//ends overloaded constructor
	
	/**Procedural mutator setNuts method
	 * This method changes the value of whether the chocolate bar contains nuts or not 
	 * 
	 * @return void
	 * @param nuts - represents whether the chocolate bar contains nuts or not (boolean)
	 */
	public void setNuts (boolean nuts) {
		this.nuts = nuts;
	}	//ends setNuts method

	/**Functional accessor getNuts method
	 * This method returns the variable nuts
	 * 
	 * @param none
	 * @return nuts - represents whether the chocolate contains nuts or not (boolean)
	 */
	public boolean getNuts (){
		return nuts;
	}	//ends getNuts method
	
	/**Functional accessor getNumWhite method
	 * This method returns the variable numWhite
	 * 
	 * @param none
	 * @return numWhite - the total number of white chocolate created (byte)
	 */
	public static byte getNumWhite (){
		return numWhite;
	}	//ends getNumWhite method
	
	/**Functional accessor getWhiteID method
	 * This method returns the variable whiteID
	 * 
	 * @param none
	 * @return whiteID - the unique ID of a white chocolate (byte)
	 */
	public byte getWhiteID(){
		return whiteID;
	}	//ends getWhiteID method

	/**Functional toString method
	 * This method overrides the toString method and returns the attributes of the object in String type
	 * 
	 * @param none
	 * @return string representation of the object
	 */
	public String toString (){
		return ("White Chocolate No. "+whiteID+"\nManufacturer's Name: "+getFactName()+"\nContains Nuts: "+nuts+"\nLength: "+getLength()+" cm\nWidth: "+getWidth()+" cm\nHeight: "+getHeight()+"  cm\nSugar Content: "+getSugar()+" %\nVolume: "+Math.round(findVolume())+" cm^3"+"\nCalories: "+Math.round(findCalories()));
	}	//ends toString method
	
	/**Functional equals method
	 * This method overrides the equals method and indicates whether some object is equal to this one 
	 * 
	 * @param g1 - the object being sent from the use class representing the user's selection of a candy (object)
	 * @return true/false for whether the object sent is equal to an object of this class or not (boolean)
	 */
	public boolean equals (Object w1){
		if (w1 instanceof White){
			White w = new White (false,((White)w1).getWhiteID());
			if (this.whiteID == w.whiteID)
				return true;
		}
		return false;
	}	//ends equals method

}	//ends White class
