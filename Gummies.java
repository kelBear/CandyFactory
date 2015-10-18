//****************************************************************************************
//Gummies Class
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This class is a template to create gummies
//<List of Identifiers>
//		packNum - the number of gummies in a package (int)
//		gummiesID - represents the ID number of a gummy made by the user (byte)
//		numGummies - counts the total number of gummies made by the user (byte)
//		side - the side length of the gummy (double)
//<Process>
//		- accessor, mutator, and constructor methods are called from the use class based on the need
//		- when changing a value, mutator methods are called
//		- when getting information, accessor methods are called
//		- when first constructing a candy, either default or the overloaded constructor is called
//		- when searching for a candy, the overloaded constructor and equals method are called
//		- when displaying information, volume and calories methods are uesd to determine the values and
//		  toString method is used to output all information to the user
//****************************************************************************************
public class Gummies extends Candy{
	
	private int packNum;
	private byte gummiesID = 0;
	private static byte numGummies = 0;
	private double side;
	
	/**Default Constructor
	 * This method sets the initial values of the variables based on a default setting
	 * 
	 * @param test - determines whether a gummy is made or not (boolean)
	 */
	public Gummies (boolean test) {
		super(test);
		packNum = 50;
		side = 1;
		numGummies++;
		gummiesID = numGummies;
	}	//ends default constructor
	
	/**Overload Constructor
	 * This method initializes values of the variables based on a user input
	 * 
	 * @param test - determines whether a gummy is made or not (boolean)
	 * @param packNum - represents the number of gummies in a pack (int)
	 * @param side - represents the side length of the gummy (int)
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public Gummies (boolean test, int packNum, double side, String factName){
		super(test, factName);
		this.packNum = packNum;
		this.side = side;
		numGummies++;
		gummiesID = numGummies;
	}	//ends overloaded constructor 
	
	/**Overload Constructor
	 * This method initializes the ID number of the gummy
	 * 
	 * @param test - determines whether a gummy is made or not (boolean)
	 * @param gummiesID - represents the unique ID of a gummy (byte)
	 */
	public Gummies (boolean test, byte gummiesID){
		super(test);
		this.gummiesID = gummiesID;
	}	//ends overloaded constructor for the ID number of the gummies
	
	/**Procedural Mutator setPackNum method
	 * This method changes the value of packNum
	 * 
	 * @param packNum- represents the number of gummies in a pack (int)
	 */
	public void setPackNum (int packNum){
		this.packNum=packNum;
	}	//ends setPackNum method
	
	/**Functional accessor getPackNum method
	 * This method returns the variable packNum
	 * 
	 * @param none
	 * @return packNum - the number of gummies in a pack (int)
	 */
	public int getPackNum (){
		return packNum;
	}	//ends getPackNum method
	
	/**Procedural mutator setSide method
	 * This method changes the value of side
	 * 
	 * @param side - represents the side length of a gummy (double)
	 * @return void
	 */
	public void setSide (double side) {
		this.side = side;
	}	//ends setSide method
	
	/**Functional accessor getSide method
	 * This method returns the variable side 
	 * 
	 * @param none
	 * @return side - represents the side length of a gummy (double)
	 */
	public double getSide (){
		return side;
	}	//ends getSide method
	
	/**Functional accessor getNumGummies method
	 * This method returns the total number of gummies
	 * 
	 * @param none
	 * @return numGummies - total number of gummies created
	 */
	public static byte getNumGummies(){
		return numGummies;
	}	//ends getNumGummies method
	
	/**Procedural mutator getGummiesID method
	 * This method returns the ID number of a gummy
	 * 
	 * @param none
	 * @return gummiesID - represents the unique ID number of a gummy (byte)
	 */
	public byte getGummiesID(){
		return gummiesID;
	}	//ends getGummiesID method
	
	/**Functional findVolume method
	 * This method calculates and returns the volume of the candy based on the dimensions
	 * 
	 * @param none
	 * @return volume(side*side*side) (double)
	 */
	public double findVolume (){
		return side*side*side;
	}	//ends findVolume method
	
	/**Functional findCalories method
	 * This method calculates and returns the calories of the candy based on the volume
	 * 
	 * @param none
	 * @return calories(10*volume*number of gummies) (double)
	 */
	public double findCalories (){
		return 10*findVolume()*packNum;
	}	//ends findCalories method
	
	/**Functional toString method
	 * This method overrides the toString method and returns the attributes of the object in String type
	 * 
	 * @param none
	 * @return string representation of the object
	 */
	public String toString (){
		return ("Gummies No. "+gummiesID+"\nManufacturer's Name: "+getFactName()+"\nNumber per Package: "+packNum+"\nSide Length: "+side+" cm\nVolume: "+Math.round(findVolume())+" cm^3"+"\nCalories: "+Math.round(findCalories()));
	}	//ends toString method
	
	/**Functional equals method
	 * This method overrides the equals method and indicates whether some object is equal to this one 
	 * 
	 * @param g1 - the object being sent from the use class representing the user's selection of a candy (object)
	 * @return true/false for whether the object sent is equal to an object of this class or not (boolean)
	 */
	public boolean equals (Object g1){
		if (g1 instanceof Gummies){
			Gummies g = new Gummies (false,((Gummies)g1).getGummiesID());
			if (this.gummiesID == g.gummiesID)
				return true;
		}
		return false;
	}	//ends equals method
}	//ends Gummies class
