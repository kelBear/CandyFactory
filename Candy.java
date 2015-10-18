//****************************************************************************************
//Candy Class (Assignment 2)
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This abstract class contains abstract methods findVolume and findCalories to calculate the 
//		volume and calories when used by subclasses. It contains default and overloaded constructors
//		to initialize the manufacturer's name. It also contains accessor and mutator methods for
//		the manufacturer's name along with an accessor method for the number of candies. It keeps
//		track of the total number of candies created.
//<List of Identifiers>
//		factName - represents the manufacturer's name (String)
//		numCandy - represents the total number of candy made (int)
//<Process>
//		- accessor, mutator, and constructor methods are called from the use class based on the need
//		- when changing a value, mutator methods are called
//		- when getting information, accessor methods are called
//		- when first constructing a candy, either default or the overloaded constructor is called
//		- volume and calories are calculated in abstract methods and are used in subclasses
//****************************************************************************************
public abstract class Candy {

	private String factName;
	private static int numCandy;

	/**Default Constructor
	 * This method sets the initial values of the variables based on a default setting
	 * 
	 * @param test - determines whether a candy is made or not (boolean)
	 */
	public Candy (boolean test){
		factName = "Awesome Candy";
		if (test == true)
			numCandy++;
	}	//ends default constructor

	/**Overload Constructor
	 * This method initializes values of the variables based on a user input
	 * 
	 * @param test - determines whether a gummy is made or not (boolean)
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public Candy (boolean test, String factName){
		this.factName = factName;
		if (test == true)
			numCandy++;
	}	//ends overloaded constructor

	/**Functional accessor getFactName method
	 * This method returns the variable factName
	 * 
	 * @param none
	 * @return factName - represents the manufacturer's name of the candy (String)
	 */
	public String getFactName () {
		return factName;
	}	//ends getFactName method

	/**Procedural mutator setFactName method
	 * This method changes the manfacturer's name
	 * 
	 * @return void
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public void setFactName (String factName) {
		this.factName = factName;
	}	//ends setFactName method
	
	/**Functional accessor getNumCandy method
	 * This method returns the variable numCandy
	 * 
	 * @param none
	 * @return numCandy - represents the total number of candies made (int)
	 */
	public static int getNumCandy (){
		return numCandy;
	}	//ends getNumCandy method
	
	public abstract double findVolume();	//abstract method findVolume (double)
	public abstract double findCalories();	//abstract method findCalories (double)
	
}
