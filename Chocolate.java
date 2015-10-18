//****************************************************************************************
//Chocolate Class (Assignment 2)
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This class is a template to create chocolate
//<List of Identifiers>
//		length - the length of the rectangular prism of the chocolate bar (double)
//		width - the length of the rectangular prism of the chocolate bar (double)
//		height - the length of the rectangular prism of the chocolate bar (double)
//		sugar - represents the sugar content of the chocolate bar (int)
//<Process>
//		- accessor, mutator, and constructor methods are called from the use class based on the need
//		- when changing a value, mutator methods are called
//		- when getting information, accessor methods are called
//		- when first constructing a candy, either default or the overloaded constructor is called
//		- volume and calories are calculated based on the dimensions of the chocolate bars if called from subclasses
//****************************************************************************************
public abstract class Chocolate extends Candy{
	
	private double length, width, height;
	private int sugar;
	
	/**Default Constructor
	 * This method sets the initial values of the variables based on a default setting
	 * 
	 * @param test - determines whether a chocolate bar is made or not (boolean)
	 */
	public Chocolate (boolean test) {
		super(test);
		length = 1;
		width = 1;
		height = 1;
		sugar = 5;
	}	//ends default constructor
	
	/**Overload Constructor
	 * This method initializes values of the variables based on a user input
	 * 
	 * @param test - determines whether a dark chocolate is made or not (boolean)
	 * @param length - the length of the rectangular prism of the chocolate bar (double)
	 * @param width - the width of the rectangular prism of the chocolate bar (double)
	 * @param height - the height of the rectangular prism of the chocolate bar (double)
	 * @param sugar - represents the sugar content of the chocolate bar (int)
	 * @param factName - represents the manufacturer's name of the candy (String)
	 */
	public Chocolate (boolean test, double length, double width, double height, int sugar, String factName){
		super (test, factName);
		this.length = length;
		this.width = width;
		this.height = height;
		this.sugar = sugar;
	}	//ends overloaded constructor
	
	/**Procedural mutator setLength method
	 * This method changes the value of length
	 * 
	 * @return void
	 * @param length - represents the length of the chocolate bar (double)
	 */
	public void setLength (double length) {
		this.length = length;
	}	//ends setLength method
		
	/**Functional accessor getLength method
	 * This method returns the variable length
	 * 
	 * @param none
	 * @return length - represents the length of the chocolate bar (double)
	 */
	public double getLength (){
		return length;
	}	//ends getLength method
	
	/**Procedural mutator setWidth method
	 * This method changes the value of width
	 * 
	 * @return void
	 * @param width - represents the width of the chocolate bar (double)
	 */
	public void setWidth (double width) {
		this.width = width;
	}	//ends setWidth method
	
	/**Functional accessor getWidth method
	 * This method returns the variable width
	 * 
	 * @param none
	 * @return width - represents the width of the chocolate bar (double)
	 */
	public double getWidth (){
		return width;
	}	//ends getWidth method
	
	/**Procedural mutator setHeight method
	 * This method changes the value of height
	 * 
	 * @return void
	 * @param height - represents the height of the chocolate bar (double)
	 */
	public void setHeight(double height) {
		this.height = height;
	}	//ends setHeight method
	
	/**Functional accessor getHeight method
	 * This method returns the variable height
	 * 
	 * @param none
	 * @return height - represents the height of the chocolate bar (double)
	 */
	public double getHeight (){
		return height;
	}	//ends getHeight method
	
	/**Procedural mutator setSugar method
	 * This method changes the value of sugar content 
	 * 
	 * @return void
	 * @param length - represents the length of the chocolate bar (double)
	 */
	public void setSugar (int sugar){
		this.sugar = sugar;
	}	//ends setSugar method
	
	/**Functional accessor getSugar method
	 * This method returns the variable sugar
	 * 
	 * @param none
	 * @return sugar - represents the sugar content of the chocolate bar (double)
	 */
	public int getSugar () {
		return sugar;
	}	//ends getSugar method

	/**Functional findVolume method
	 * This method calculates and returns the volume of the candy based on the dimensions
	 * 
	 * @param none
	 * @return volume(length*width*height) (double)
	 */
	public double findVolume (){
		return length*width*height;
	}	//ends findVolume method
	
	/**Functional findCalories method
	 * This method calculates and returns the calories of the candy based on the volume
	 * 
	 * @param none
	 * @return calories(10*volume) (double)
	 */
	public double findCalories (){
		return 10*findVolume();
	}	//ends findCalories method
	
}	//ends Chocolate class
