//****************************************************************************************
//Lollipops Class
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This class is a template to create lollipops
//<List of Identifiers>
//		colour - the colour of the lollipop (String)
//		lollipopsID - represents the ID number of a lollipop made by the user (byte)
//		numLollipops - counts the total number of lollipops made by the user (byte)
//		radius - the radius length of the lollipop (double)
//<Process>
//		- accessor, mutator, and constructor methods are called from the use class based on the need
//		- when changing a value, mutator methods are called
//		- when getting information, accessor methods are called
//		- when first constructing a candy, either default or the overloaded constructor is called
//		- when searching for a candy, the overloaded constructor and equals method are called
//		- when displaying information, volume and calories methods are uesd to determine the values and
//		  toString method is used to output all information to the user
//****************************************************************************************
public class Lollipops extends Candy{
	
	private String colour;
	private double radius;
	private static byte numLollipops = 0;
	private byte lollipopsID = 0;
	
	/**Default Constructor
	 * This method sets the initial values of the variables based on a default setting
	 * 
	 * @param test - determines whether a lollipop is made or not (boolean)
	 */
	public Lollipops (boolean test) {
		super(test);
		colour = "Rainbow";
		radius = 1;
		numLollipops++;
		lollipopsID = numLollipops;
	}	//ends default constructor
	
	/**Overload Constructor
	 * This method initializes values of the variables based on a user input
	 * 
	 * @param test - determines whether a lollipop is made or not (boolean)
	 * @param colour - the colour of the lollipop (String)
	 * @param radius - the radius length of the lollipop (double)
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public Lollipops (boolean test, String colour, double radius, String factName){
		super (test, factName);
		this.colour = colour;
		this.radius = radius;
		numLollipops++;
		lollipopsID = numLollipops;
	}	//ends overloaded constructor
	
	/**Overload Constructor
	 * This method initializes the ID number of the candy when needed to search a candy
	 * 
	 * @param test - determines whether a lollipop is made or not (boolean)
	 * @param lollipopsID - represents the ID number of a lollipop made by the user (byte)
	 */
	public Lollipops (boolean test, byte lollipopsID){
		super (test);
		this.lollipopsID = lollipopsID;
	}	//ends overloaded constructor
	
	/**Procedural mutator setColour method
	 * This method changes the value of colour
	 * 
	 * @return void
	 * @param colour - represents the colour of the lollipop (String)
	 */
	public void setColour (String colour){
		this.colour=colour;
	}	//ends setColour method
	
	public String getColour (){
		return colour;
	}	//ends getColour method
	
	/**Procedural mutator setRadius method
	 * This method changes the value of radius 
	 * 
	 * @return void
	 * @param radius - represents the radius of the lollipop (String)
	 */
	public void setRadius (double radius){
		this.radius = radius;
	}	//ends setRadius method
	
	/**Functional accessor getRadius method
	 * This method returns the variable radius
	 * 
	 * @param none
	 * @return radius - the radius of the lollipop (double)
	 */
	public double getRadius () {
		return radius;
	}	//ends getRadius method

	/**Functional accessor getNumLollipops method
	 * This method returns the variable numLollipops
	 * 
	 * @param none
	 * @return numLollipops - the total number of lollipops created (byte)
	 */
	public static byte getNumLollipops(){
		return numLollipops;
	}	//ends getNumLollipops method
	
	/**Functional accessor getLollipopsID method
	 * This method returns the variable lollipopsID
	 * 
	 * @param none
	 * @return lollipopsID - the unique ID number of a lollipop (byte)
	 */
	public byte getLollipopsID(){
		return lollipopsID;
	}	//ends getLollipopsID method
	

	/**Functional findVolume method
	 * This method calculates and returns the volume of the candy based on the dimensions
	 * 
	 * @param none
	 * @return volume(radius*radius*radius*PI*4/3) (double)
	 */
	public double findVolume (){
		return radius*radius*radius*Math.PI*4/3;
	}	//ends findVolume method
	
	/**Functional findCalories method
	 * This method calculates and returns the calories of the candy based on the volume
	 * 
	 * @param none
	 * @return (10*volume) (double)
	 */
	public double findCalories (){
		return Math.round(10*findVolume());
	}	//ends findCalories method
	
	/**Functional toString method
	 * This method overrides the toString method and returns the attributes of the object in String type
	 * 
	 * @param none
	 * @return string representation of the object
	 */
	public String toString (){
		return ("Lollipop No. "+lollipopsID+"\nManufacturer's Name: "+getFactName()+"\nColour: "+colour+"\nRadius: "+radius+" cm"+"\nVolume: "+Math.round(findVolume())+" cm^3"+"\nCalories: "+Math.round(findCalories()));
	}	//ends toString method
	
	/**Functional equals method
	 * This method overrides the equals method and indicates whether some object is equal to this one 
	 * 
	 * @param g1 - the object being sent from the use class representing the user's selection of a candy (object)
	 * @return true/false for whether the object sent is equal to an object of this class or not (boolean)
	 */
	public boolean equals (Object l1){
		if (l1 instanceof Lollipops){
			Lollipops l = new Lollipops (false,((Lollipops)l1).getLollipopsID());
			if (this.lollipopsID == l.lollipopsID){
				return true;
		}
		}
		return false;
	}	//ends equals method
}	//ends Lollipops class
