//****************************************************************************************
//Dark Class 
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This class is a template to create dark chocolate
//<List of Identifiers>
//		cocoaContent - the cocoa content of the dark chocolate (int)
//		darkID - represents the ID number of a dark chocolate made by the user (byte)
//		numDark - counts the total number of dark chocolates made by the user (byte)
//<Process>
//		- accessor, mutator, and constructor methods are called from the use class based on the need
//		- when changing a value, mutator methods are called
//		- when getting information, accessor methods are called
//		- when first constructing a candy, either default or the overloaded constructor is called
//		- when searching for a candy, the overloaded constructor and equals method are called
//		- when displaying information, volume and calories methods are uesd to determine the values and
//		  toString method is used to output all information to the user
//****************************************************************************************
public class Dark extends Chocolate{

	private int cocoaContent;
	private byte darkID = 0;
	private static byte numDark = 0;

	/**Default Constructor
	 * This method sets the initial values of the variables based on a default setting
	 * 
	 * @param test - determines whether a dark chocolate is made or not (boolean)
	 */
	public Dark (boolean test){
		super(test);
		cocoaContent = 50;
		numDark++;
		darkID = numDark;
	}	//ends default constructor

	/**Overload Constructor
	 * This method initializes values of the variables based on a user input
	 * 
	 * @param test - determines whether a dark chocolate is made or not (boolean)
	 * @param cocoaContent - the cocoa content of the dark chocolate (int)
	 * @param length - the length of the rectangular prism of the chocolate bar (double)
	 * @param width - the width of the rectangular prism of the chocolate bar (double)
	 * @param height - the height of the rectangular prism of the chocolate bar (double)
	 * @param sugar - represents the sugar content of the chocolate bar (int)
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public Dark (boolean test, int cocoaContent, double length, double width, double height, int sugar, String factName){
		super(test, length, width, height, sugar, factName);
		this.cocoaContent = cocoaContent;
		numDark++;
		darkID = numDark;
	}	//ends overloaded constructor
	
	/**Overload Constructor
	 * This method initializes the ID number of the candy when needed to search a candy
	 * 
	 * @param test - determines whether a dark chocolate is made or not (boolean)
	 * @param darkID - represents the ID number of a dark chocolate made by the user (byte)
	 */
	public Dark (boolean test, byte darkID){
		super(test);
		this.darkID = darkID;
	}	//ends overloaded constructor

	/**Procedural mutator setCocoaContent method
	 * This method changes the value of cocoa content 
	 * 
	 * @return void
	 * @param cocoaContent - represents the cocoa content of the chocolate bar (int)
	 */
	public void setCocoaContent (int cocoaContent) {
		this.cocoaContent = cocoaContent;
	}	//ends setCocoaContent method

	/**Functional accessor getCocoaContent method
	 * This method returns the variable cocoaContent
	 * 
	 * @param none
	 * @return cocoaContent - the cocoa content in the chocolate bar (int)
	 */
	public int getCocoaContent (){
		return cocoaContent;
	}	//ends getCocoaContent method
	
	/**Functional accessor getNumDark method
	 * This method returns the variable numDark
	 * 
	 * @param none
	 * @return numDark - the total number of dark chocolates made (byte)
	 */
	public static byte getNumDark(){
		return numDark;
	}	//ends getNumDark method
	
	/**Functional accessor getDarkID method
	 * This method returns the variable darkID
	 * 
	 * @param none
	 * @return darkID - the unique ID of a dark chocolate bar (byte)
	 */
	public byte getDarkID(){
		return darkID;
	}	//ends getDarkID method

	/**Functional toString method
	 * This method overrides the toString method and returns the attributes of the object in String type
	 * 
	 * @param none
	 * @return string representation of the object
	 */
	public String toString (){
		return ("Dark Chocolate No. "+darkID+"\nManufacturer's Name: "+getFactName()+"\nCocoa Content: "+cocoaContent+" %\nLength: "+getLength()+" cm\nWidth: "+getWidth()+" cm\nHeight: "+getHeight()+" cm\nSugar Content: "+getSugar()+" %\nVolume: "+Math.round(findVolume())+" cm^3\nCalories: "+Math.round(findCalories()));
	}	//ends toString method
	
	/**Functional equals method
	 * This method overrides the equals method and indicates whether some object is equal to this one 
	 * 
	 * @param g1 - the object being sent from the use class representing the user's selection of a candy (object)
	 * @return true/false for whether the object sent is equal to an object of this class or not (boolean)
	 */
	public boolean equals (Object d1){
		if (d1 instanceof Dark){
			Dark d = new Dark (false,((Dark)d1).getDarkID());
			if (this.darkID == d.darkID);
				return true;
		}
		return false;
	}	//ends equals method

}	//ends Dark class
