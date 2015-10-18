//****************************************************************************************
//Use Class
//Kelly Guo
//Date:November 22, 2012
//Java, Eclipse 3.4
//****************************************************************************************
//<Problem Definition>
//		This class is the use class of the program that allows the user to customize their own candies. It prompts the user
//		to choose between lollipops, gummies, white and dark chocolate. The user can also view all candies that they have
//		created along with the number of each candy and the total of all candies. A search function is provided for the
//		user to look for a candy they have made with its ID number.
//<Input>
//		- attributes of each corresponding candy, including: dimensions of shapes, colour, number per pack, nuts, cocoa content
//		- selection to confirm or change the candy and build default candy or not
//		- selection of menu for the action to be performed
//		- selection needed for each corresponding action performed
//<Output>
//		- specific candy designed by the user with corresponding attributes
//		- number of candies as acquired by user
//		- database if wanted by user
//		- menu for user to selection an action from
//<List of Identifiers>
//		packNum - the number of gummies in a package (int)
//		sugar - the sugar content of chocolate (int)
//		cocoa - the cocoa content of chocolate (int)
//		input - the choice selected by the user from the main menu (byte)
//		selection - the type of candy the user selects to make (byte)
//		change - the choice of the user to whether change the current candy or not (byte)
//		radius - the radius of the sphere for the lollipop (double)
//		side - the side length of the cube for the gummies (double)
//		length - the length of the chocolate bar (double)
//		width - the width of the chocolate bar (double)
//		height - the height of the chocolate bar (double)
//		nuts - determines whether the chocolate bar contains nuts or not (boolean)
//		colour - the colour of the lollipop (String)
//		factName - the manufacturer's name (String)
//		u1 - object of the use class used to call methods (object)
//<Process>
//		- Prompts the user to enter a selection from the menu
//		- Based on the user selection, the program will allow the user to:
//			- Build a candy (lollipop, gummies, white/dark chocolate)
//				- Use default settings or customize the features of the candies
//			- Search for a candy by entering the type and ID number of the candy
//			- View summary and total number of candies or each type of candy
//			- Exit
//		- The menu will be displayed for the user each time until the user selects to exit
//let MAX = constant used to represent the maximum number of each candy to be created (byte)
//let lollipops [] represent the array used to store all lollipops made by the user (Object [])
//let gummies [] represent the array used to store all gummies made by the user (Object [])
//let white [] represent the array used to store all white chocolate made by the user (Object [])
//let dark [] represent the array used to store all dark chocolate made by the user (Object [])
//****************************************************************************************
import java.io.*;
public class Use {

	final byte MAX = 20;
	Object lollipops [] = new Object [MAX];
	Object gummies [] = new Object [MAX];
	Object white [] = new Object [MAX];
	Object dark [] = new Object [MAX];

	/**Procedural main method
	 * This method calls other non-static methods to assign variables and passes variables as arguments.
	 * <p>
	 * Call description and menu methods to provide information regarding the program to the user
	 * Call input method to accept user input
	 * Based on the user's selection, switch/case is used to determine the type of candy the user wants to create
	 * Calls buildDefaultCandy method to ask whether the user would like to create a default candy or not
	 * Calls various methods to set the dimensions and attributes of the candies
	 * Calls mutator methods to set new values entered by the user
	 * Calls final... methods when the user decides to create the candy of their preference
	 * Calls search method if the user wants to search for a candy
	 * Calls outputTotalCandy method if the user wants to view the number and summary of all candies created
	 * 
	 * @param args (String[])
	 * @return void
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Use u1 = new Use ();
		int packNum = 50, sugar = 5, cocoa = 50;
		byte input, selection, change = 0; 
		double radius = 1, side = 1, length = 1, width = 1, height = 1;
		boolean nuts = false;
		String colour = "Rainbow", factName = "Awesome Candy";
		u1.description();
		u1.menu();
		input = u1.input();
		while (input!=7){
			switch (input){
			case 1:
				selection = u1.buildDefaultCandy(input);
				while (true){
					if (selection == 1){
						Lollipops l1 = new Lollipops (true);
						change = u1.confirmLollipops (l1);
						while (true){
							while (change == 1){
								radius = u1.customRadius();
								l1.setRadius(radius);
								colour = u1.customColour();
								l1.setColour(colour);
								factName = u1.customManuName();
								l1.setFactName(factName);
								change = u1.confirmLollipops(l1);
							}
							if (change == 2){
								u1.finalLollipops(l1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmLollipops(l1);
							}
						}
						break;
					}
					else if (selection == 2){
						radius = u1.customRadius();
						colour = u1.customColour();
						factName = u1.customManuName();
						Lollipops l1 = new Lollipops (true, colour, radius, factName);
						l1.setRadius(radius);
						l1.setColour(colour);
						l1.setFactName(factName);
						change = u1.confirmLollipops(l1);
						while (true){
							while (change == 1){
								radius = u1.customRadius();
								l1.setRadius(radius);
								colour = u1.customColour();
								l1.setColour(colour);
								factName = u1.customManuName();
								l1.setFactName(factName);
								change = u1.confirmLollipops(l1);
							}
							if (change == 2){
								u1.finalLollipops(l1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmLollipops(l1);
							}
						}
						break;
					}
					else {
						System.out.println("Invalid Input!");
						selection = u1.buildDefaultCandy(input);
					}
				}
				break;
			case 2:
				selection = u1.buildDefaultCandy(input);
				while (true){
					if (selection == 1){
						Gummies g1 = new Gummies (true);
						change = u1.confirmGummies (g1);
						while (true){
							while (change == 1){
								packNum = u1.customPackNum();
								g1.setPackNum(packNum);
								side = u1.customSide();
								g1.setSide(side);
								factName = u1.customManuName();
								g1.setFactName(factName);
								change = u1.confirmGummies(g1);
							}
							if (change == 2){
								u1.finalGummies(g1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmGummies(g1);
							}
						}
						break;
					}
					else if (selection == 2){
						packNum = u1.customPackNum();
						side = u1.customSide();
						factName = u1.customManuName();
						Gummies g1 = new Gummies (true, packNum, side, factName);
						g1.setPackNum(packNum);
						g1.setSide(side);
						g1.setFactName(factName);
						change = u1.confirmGummies(g1);
						while (true){
							while (change == 1){
								packNum = u1.customPackNum();
								g1.setPackNum(packNum);
								side = u1.customSide();
								g1.setSide(side);
								factName = u1.customManuName();
								g1.setFactName(factName);
								change = u1.confirmGummies(g1);
							}
							if (change == 2){
								u1.finalGummies(g1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmGummies(g1);
							}
						}
						break;
					}
					else {
						System.out.println("Invalid Input!");
						selection = u1.buildDefaultCandy(input);
					}
				}
				break;
			case 3:
				selection = u1.buildDefaultCandy(input);
				while (true){
					if (selection == 1){
						White w1 = new White (true);
						change = u1.confirmWhiteChocolate (w1);
						while (true){
							while (change == 1){
								length = u1.customLength();
								w1.setLength(length);
								width = u1.customWidth();
								w1.setWidth(width);
								height = u1.customHeight();
								w1.setHeight(height);
								sugar = u1.customSugarContent();
								w1.setSugar(sugar);
								nuts = u1.customNuts();
								w1.setNuts(nuts);
								factName = u1.customManuName();
								w1.setFactName(factName);
								change = u1.confirmWhiteChocolate (w1);
							}
							if (change == 2){
								u1.finalWhiteChocolate(w1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmWhiteChocolate (w1);
							}
						}
						break;
					}
					else if (selection == 2){
						length = u1.customLength();
						width = u1.customWidth();
						height = u1.customHeight();
						sugar = u1.customSugarContent();
						nuts = u1.customNuts();
						factName = u1.customManuName();
						White w1 = new White (true, nuts, length, width, height, sugar, factName);
						w1.setLength(length);
						w1.setWidth(width);
						w1.setHeight(height);
						w1.setSugar(sugar);
						w1.setNuts(nuts);
						w1.setFactName(factName);
						change = u1.confirmWhiteChocolate (w1);
						while (true){
							while (change == 1){
								length = u1.customLength();
								w1.setLength(length);
								width = u1.customWidth();
								w1.setWidth(width);
								height = u1.customHeight();
								w1.setHeight(height);
								sugar = u1.customSugarContent();
								w1.setSugar(sugar);
								nuts = u1.customNuts();
								w1.setNuts(nuts);
								factName = u1.customManuName();
								w1.setFactName(factName);
								change = u1.confirmWhiteChocolate (w1);
							}
							if (change == 2){
								u1.finalWhiteChocolate(w1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmWhiteChocolate (w1);
							}
						}
						break;
					}
					else {
						System.out.println("Invalid Input!");
						selection = u1.buildDefaultCandy(input);
					}
				}
				break;
			case 4:
				selection = u1.buildDefaultCandy(input);
				while (true){
					if (selection == 1){
						Dark d1 = new Dark (true);
						change = u1.confirmDarkChocolate(d1);
						while (true){
							while (change == 1){
								length = u1.customLength();
								d1.setLength(length);
								width = u1.customWidth();
								d1.setWidth(width);
								height = u1.customHeight();
								d1.setHeight(height);
								sugar = u1.customSugarContent();
								d1.setSugar(sugar);
								cocoa = u1.customCocoaContent();
								d1.setCocoaContent(cocoa);
								factName = u1.customManuName();
								d1.setFactName(factName);
								change = u1.confirmDarkChocolate(d1);
							}
							if (change == 2){
								u1.finalDarkChocolate(d1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmDarkChocolate (d1);
							}
						}
						break;
					}
					else if (selection == 2){
						length = u1.customLength();
						width = u1.customWidth();
						height = u1.customHeight();
						sugar = u1.customSugarContent();
						cocoa = u1.customCocoaContent();
						factName = u1.customManuName();
						Dark d1 = new Dark (true, cocoa, length, width, height, sugar, factName);
						d1.setLength(length);
						d1.setWidth(width);
						d1.setHeight(height);
						d1.setSugar(sugar);
						d1.setCocoaContent(cocoa);
						d1.setFactName(factName);
						change = u1.confirmDarkChocolate(d1);
						while (true){
							while (change == 1){
								length = u1.customLength();
								d1.setLength(length);
								width = u1.customWidth();
								d1.setWidth(width);
								height = u1.customHeight();
								d1.setHeight(height);
								sugar = u1.customSugarContent();
								d1.setSugar(sugar);
								cocoa = u1.customCocoaContent();
								factName = u1.customManuName();
								d1.setFactName(factName);
								change = u1.confirmDarkChocolate(d1);
							}
							if (change == 2){
								u1.finalDarkChocolate(d1);
								break;
							}
							else if (change != 1 && change != 2){
								System.out.println("Invalid Input!");
								change = u1.confirmDarkChocolate (d1);
							}
						}
						break;
					}
					else {
						System.out.println("Invalid Input!");
						selection = u1.buildDefaultCandy(input);
					}
				}
				break;
			case 5:
				u1.search();
				break;
			case 6:
				u1.outputTotalCandy();
				break;
			default:
				System.out.println("Invalid Input!");
				break;
			}
			u1.menu();
			input = u1.input();
		}
		System.out.println("Byebye!");
	}	//ends main method

	/**Procedural description method
	 * This method provides the information needed for the user to understand the purpose and limitations of this
	 * program
	 * 
	 * @param none
	 * @return void
	 */
	public void description () {
		System.out.println("Welcome to the best Build-Your-Own Candy Factory in the world.");
		System.out.println("Here, we offer you to build your own lollipops, gummies, or white/dark chocolate.");
		System.out.println("Simply follow the instructions to complete your candy-building process.");
		System.out.println("Please be prepared to enter the dimensions of your candy. Additional information");
		System.out.println("will also be required for each type of candy. When making a selection, please");
		System.out.println("enter the number shown on the left of the option you wish to choose. Note that a");
		System.out.println("maximum of 20 candies per each category is allowed. Let's enter the amazing Candy Factory!");
	}	//ends description method

	/**Procedural menu method
	 * This method provides a menu for the user to select an action that they would like to perform
	 * 
	 * @param none
	 * @return void
	 */
	public void menu (){
		System.out.println("Please enter your selection from the list below:");
		System.out.println("1. Build your own lollipop");
		System.out.println("2. Build your own gummies");
		System.out.println("3. Build your own white chocolate");
		System.out.println("4. Build your own dark chocolate");
		System.out.println("5. Search database for a candy");
		System.out.println("6. View total number of candies");
		System.out.println("7. Exit");
	}	//ends menu method

	/**Functional customManuName method
	 * This method asks the user to choose their preferred manufacturer's name from a given list and accepts a valid input
	 * from the user.
	 * <p>
	 * Let factNameNum represent the numerical choice entered by the user (byte)
	 * Let factName represent the actual name of the manufacturer chosen by the user (String)
	 * 
	 * @param none
	 * @return factName - the manufacturer's name selected by the user (String)
	 * @throws IOException
	 */
	public String customManuName () throws IOException{
		byte factNameNum = 1;
		String factName = "Awesome Candy";
		System.out.println("Please choose the candy maufacturer you would like: ");
		System.out.println("1. Awesome Candy");
		System.out.println("2. Amazing Candy");
		System.out.println("3. Fantastic Candy");
		factNameNum = input();
		if (factNameNum == 1)
			factName = "Awesome Candy";
		else if (factNameNum == 2)
			factName = "Amazing Candy";
		else if (factNameNum == 3)
			factName = "Fantastic Candy";
		else {
			while (factNameNum != 1 && factNameNum != 2 && factNameNum != 3){
				System.out.println("Invalid Input!");
				factNameNum = input();
			}
		}
		return factName;
	}	//ends factName method

	/**Functional input method
	 * This method accepts a user input in the byte type by the use of BufferedReader and try/catch to prevent
	 * invalid inputs.
	 * <p>
	 * 
	 * Let input represent the variable that holds the input entered by the user (byte)
	 * 
	 * @param none
	 * @return input - the input entered by the user (byte)
	 * @throws IOException
	 */
	public byte input () throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		byte input;
		while (true){
			try{
				input = Byte.parseByte(br.readLine());
				break;
			}
			catch (NumberFormatException e){
				System.out.println ("Invalid Input!");
			}
		}
		return input;
	}	//ends input method

	/**Functional inputDouble method
	 * This method accepts a user input in the double type by the use of BufferedReader and try/catch to prevent
	 * invalid inputs. It returns the input by the user. 
	 * <p>
	 * 
	 * Let input represent the variable that holds the input entered by the user (double)
	 * 
	 * @param none
	 * @return input - the input entered by the user (double)
	 * @throws IOException
	 */
	public double inputDouble () throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		double input;
		while (true){
			try{
				input = Double.parseDouble(br.readLine());
				break;
			}
			catch (NumberFormatException e){
				System.out.println ("Invalid Input!");
			}
		}
		return input;
	}	//ends inputDouble method

	/**Functional buildDefaultCandy method
	 * This method asks the user if they would like to create a default candy based on their selection. It returns
	 * the selection of the user's choice
	 * <p>
	 * Let selection represent the user input of whether they would like to build a default candy or not
	 * 
	 * @param input - represents the candy that the user would like to create (byte)
	 * @return selection - represents the user selection of default or no default (byte)
	 * @throws IOException
	 */
	public byte buildDefaultCandy (byte input) throws IOException {
		byte selection = 0;
		switch (input){
		case 1:
			System.out.println("Would you like to make a default lollipop?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			selection = input();
			break;
		case 2:
			System.out.println("Would you like to make a default package of gummies?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			selection = input();
			break;
		case 3:
			System.out.println("Would you like to make a default white chocolate bar?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			selection = input();
			break;
		case 4:
			System.out.println("Would you like to make a default dark chocolate bar?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			selection = input();
			break;
		}
		return selection;
	}	//ends buildDefaultCandy method

	/**Functional confirmLollipops method
	 * This method outputs the current features of a lollipop and asks the user whether changes are to be made
	 * to the current lollipop. It returns the choice of the user. 
	 * <p>
	 * Let change represent the choice of the user to change the features of the lollipop or not (byte)
	 * 
	 * @param l1 - object in Lollipops class that holds attributes of candy being created by user (object)
	 * @return change - represents the user's choice to change the features of their candy or not (byte)
	 * @throws IOException
	 */
	public byte confirmLollipops (Lollipops l1) throws IOException{
		byte change;
		System.out.println(l1.toString());
		System.out.println ("Would you like to change your lollipop?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}	//end of confirmLollipops method

	/**Functional customRadius method
	 * This method prompts the user to enter a desired radius for the custom lollipop being created. 
	 * It returns the radius entered by the user.
	 * <p>
	 * Let radius represent the radius entered by the user (double)
	 * 
	 * @param none
	 * @return radius - radius entered by the user (double)
	 * @throws IOException
	 */
	public double customRadius () throws IOException{
		double radius;
		System.out.println("Please enter the radius of your lollipop: ");
		radius = inputDouble();
		return radius;
	}	//ends customRadius method

	/**Functional customColour method
	 * This method prompts the user to input the colour of the lollipop by the use of BufferedReader. 
	 * It returns the colour entered by the user.
	 * <p>
	 * Let colour represent the colour of the lollipop as entered by the user (String)
	 * 
	 * @param none
	 * @return colour - input by user (String)
	 * @throws IOException
	 */
	public String customColour () throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String colour;
		System.out.println("Please enter the colour of your lollipop: ");
		colour = br.readLine();
		return colour;
	}	//ends customColour

	/**Procedural finalLollipops method
	 * This method outputs the lollipop that the user agreed to create with its corresponding features.
	 * It assigns the object to the lollipops array.
	 * 
	 * @param l1 - object of Lollipops class that holds the attributes of the lollipop (object)
	 * @return void
	 */
	public void finalLollipops (Lollipops l1){
		lollipops [Lollipops.getNumLollipops()-1] = l1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(l1.toString());
		System.out.println();
	}	//ends finalLollipops method

	/**Functional confirmGummies method
	 * This method outputs the current features of gummies and asks the user whether changes are to be made
	 * to the current gummies order. It returns the choice of the user. 
	 * <p>
	 * Let change represent the choice of the user to change the features of the gummies or not (byte)
	 * 
	 * @param l1 - object in Gummies class that holds attributes of candy being created by user (object)
	 * @return change - represents the user's choice to change the features of their candy or not (byte)
	 * @throws IOException
	 */
	public byte confirmGummies (Gummies g1) throws IOException{
		byte change;
		System.out.println(g1.toString());
		System.out.println ("Would you like to change your gummies order?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}	//ends confirmGummies method

	/**functional customSide method
	 * This method prompts the user to enter the side length of one gummy. 
	 * It returns the user input.
	 * <p>
	 * Let side represent the input of the user (double)
	 * 
	 * @param none
	 * @return side - the input of the user (double)
	 * @throws IOException
	 */
	public double customSide () throws IOException{
		double side;
		System.out.println("Please enter the length of the side of one gummy: ");
		side = inputDouble();
		return side;
	}	//ends customSide method

	/**functional customPackNum method
	 * This method prompts the user to enter the number of gummies per pack. 
	 * It returns the user input.
	 * <p>
	 * Let packNum represent the input of the user (int)
	 * 
	 * @param none
	 * @return packNum - the input of the user (int)
	 * @throws IOException
	 */
	public int customPackNum () throws IOException {
		int packNum;
		System.out.println("Please enter the number of gummies in your order: ");
		packNum = input();
		return packNum;
	}	//ends customPackNum method

	/**Procedural finalGummies method
	 * This method outputs the gummies that the user agreed to create with its corresponding features.
	 * It assigns the object to the gummies array.
	 * 
	 * @param g1 - object of Gummies class that holds the attributes of the gummies (object)
	 * @return void
	 */
	public void finalGummies (Gummies g1){
		gummies[Gummies.getNumGummies()-1]=g1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(g1.toString());
		System.out.println();
	}	//ends finalGummies method

	/**Functional confirmWhiteChocolate method
	 * This method outputs the current features of a white chocolate and asks the user whether changes are to be made
	 * to the current white chocolate. It returns the choice of the user. 
	 * <p>
	 * Let change represent the choice of the user to change the features of the white chocolate or not (byte)
	 * 
	 * @param l1 - object in White class that holds attributes of candy being created by user (object)
	 * @return change - represents the user's choice to change the features of their candy or not (byte)
	 * @throws IOException
	 */
	public byte confirmWhiteChocolate (White w1) throws IOException{
		byte change;
		System.out.println(w1.toString());
		System.out.println ("Would you like to change your chocolate bar?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}	//ends confirmWhiteChocolate method

	/**Functional confirmDarkChocolate method
	 * This method outputs the current features of a dark chocolate and asks the user whether changes are to be made
	 * to the current dark chocolate. It returns the choice of the user. 
	 * <p>
	 * Let change represent the choice of the user to change the features of the dark chocolate or not (byte)
	 * 
	 * @param d1 - object in Dark class that holds attributes of candy being created by user (object)
	 * @return change - represents the user's choice to change the features of their candy or not (byte)
	 * @throws IOException
	 */
	public byte confirmDarkChocolate (Dark d1) throws IOException{
		byte change;
		System.out.println(d1.toString());
		System.out.println ("Would you like to change your chocolate bar?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}	//ends confirmDarkChocolate method

	/**functional customLength method
	 * This method prompts the user to enter the length of the chocolate bar. 
	 * It returns the user input.
	 * <p>
	 * Let length represent the input of the user (double)
	 * 
	 * @param none
	 * @return length - the input of the user (double)
	 * @throws IOException
	 */
	public double customLength () throws IOException{
		double length;
		System.out.println("Please enter the length of your chocolate bar: ");
		length = inputDouble();
		return length;
	}	//ends customLength method

	/**functional customWidth method
	 * This method prompts the user to enter the width of the chocolate bar. 
	 * It returns the user input.
	 * <p>
	 * Let width represent the input of the user (double)
	 * 
	 * @param none
	 * @return width - the input of the user (double)
	 * @throws IOException
	 */
	public double customWidth () throws IOException{
		double width;
		System.out.println("Please enter the width of your chocolate bar: ");
		width = inputDouble();
		return width;
	}	//ends customWidth

	/**functional customHeight method
	 * This method prompts the user to enter the height of the chocolate bar. 
	 * It returns the user input.
	 * <p>
	 * Let height represent the input of the user (double)
	 * 
	 * @param none
	 * @return height - the input of the user (double)
	 * @throws IOException
	 */
	public double customHeight () throws IOException{
		double height;
		System.out.println("Please enter the height of your chocolate bar: ");
		height = inputDouble();
		return height;
	}	//ends customHeight method

	/**functional customSugarContent method
	 * This method prompts the user to enter the sugar content of the chocolate bar. 
	 * It returns the user input.
	 * <p>
	 * Let sugar represent the input of the user of the chocolate's sugar content (int)
	 * 
	 * @param none
	 * @return sugar - the input of the user (int)
	 * @throws IOException
	 */
	public int customSugarContent () throws IOException {
		int sugar;
		System.out.println("Please enter the sugar content of your chocolate bar: ");
		sugar = input();
		return sugar;
	}	//ends customSugarContent method

	/**functional customCocoaContent method
	 * This method prompts the user to enter the cocoa content of the chocolate bar. 
	 * It returns the user input.
	 * <p>
	 * Let cocoa represent the input of the user of the chocolate's cocoa content (int)
	 * 
	 * @param none
	 * @return sugar - the input of the user (int)
	 * @throws IOException
	 */
	public int customCocoaContent () throws IOException{
		int cocoa;
		System.out.println("Please enter the cocoa content of your dark chocolate bar: ");
		cocoa = input();
		return cocoa;
	}	//ends customCocoaContent

	/**functional customNumts method
	 * This method prompts the user to select whether the chocolate bar contains nuts or not. 
	 * It returns the user's selection.
	 * <p>
	 * Let nuts represent the user's choice of having nuts or not in the white chocolate bar (boolean)
	 * Let nutsChoice represent the numeral selection of the user (byte)
	 * 
	 * @param none
	 * @return nuts - the input of the user (boolean)
	 * @throws IOException
	 */
	public boolean customNuts () throws IOException{
		boolean nuts = false;
		byte nutsChoice;
		System.out.println("Does your white chocolate bar contain nuts?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		nutsChoice = input();
		while(true){
			if (nutsChoice==1){
				nuts = true;
				break;
			}
			else if (nutsChoice==2){
				nuts = false;
				break;
			}
			else {
				System.out.println("Invalid Input!");
				nutsChoice = input();
			}
		}
		return nuts;
	}	//ends customNuts method

	/**Procedural finalDarkChocolate method
	 * This method outputs the dark chocolate that the user agreed to create with its corresponding features.
	 * It assigns the object to the dark array.
	 * 
	 * @param d1 - object of Dark class that holds the attributes of the dark chocolate (object)
	 * @return void
	 */
	public void finalDarkChocolate (Dark d1){
		dark[Dark.getNumDark()-1]=d1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(d1.toString());
		System.out.println();
	}	//ends finalDarkChocolate method

	/**Procedural finalWhiteChocolate method
	 * This method outputs the white chocolate that the user agreed to create with its corresponding features.
	 * It assigns the object to the white array.
	 * 
	 * @param w1 - object of White class that holds the attributes of the white chocolate (object)
	 * @return void
	 */
	public void finalWhiteChocolate (White w1){
		white[White.getNumWhite()-1] = w1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(w1.toString());
		System.out.println();
	}	//ends finalWhiteChocolate

	/**Procedural search method
	 * This method prompts the user to enter the type of candy along with the candy's ID number of the candy that 
	 * they would like to search for. It then calls the corresponding equals method to check if the candy exists and
	 * outputs the existing candy.
	 * <p>
	 * Let selection represent the type of candy the user is searching for (byte)
	 * Let idNum represent the ID number of the candy the user is searching for (byte)
	 * 
	 * @param none
	 * @return void
	 * @throws IOException
	 */
	public void search () throws IOException {
		byte selection, idNum;
		boolean exists = false;
		System.out.println("Please enter the candy that you would like to search for: ");
		System.out.println("1. Lollipop");
		System.out.println("2. Gummies");
		System.out.println("3. White Chocolate");
		System.out.println("4. Dark Chocolate");
		selection = input();
		while (true){
			switch(selection){
			case 1:
				System.out.println("Please enter the ID number of the lollipop: ");
				idNum = input();
				Lollipops l2 = new Lollipops (false, idNum);
				for (byte a = 0; a < Lollipops.getNumLollipops(); a ++){
					exists = lollipops[a].equals(l2);
					if (exists == true){
						System.out.println("Your candy has been found: ");
						System.out.println(lollipops[a].toString());
						System.out.println();
						break;
					}
				}
				if (exists == false)
					System.out.println("Sorry, this candy does not exist!");
				break;
			case 2:
				System.out.println("Please enter the ID number of the gummy: ");
				idNum = input();
				Gummies g2 = new Gummies (false, idNum);
				for (byte a = 0; a < Gummies.getNumGummies(); a ++){
					exists = gummies[a].equals(g2);
					if (exists == true){
						System.out.println("Your candy has been found: ");
						System.out.println(gummies[a].toString());
						System.out.println();
						break;
					}
				}
				if (exists == false)
					System.out.println("Sorry, this candy does not exist!");
				break;
			case 3:
				System.out.println("Please enter the ID number of the white chocolate: ");
				idNum = input();
				White w2 = new White (false, idNum);
				for (byte a = 0; a < White.getNumWhite(); a ++){
					exists = white[a].equals(w2);
					if (exists == true){
						System.out.println("Your candy has been found: ");
						System.out.println(white[a].toString());
						System.out.println();
						break;
					}
				}
				if (exists == false)
					System.out.println("Sorry, this candy does not exist!");
				break;
			case 4:
				System.out.println("Please enter the ID number of the dark chocolate: ");
				idNum = input();
				Dark d2 = new Dark (false, idNum);
				for (byte a = 0; a < Dark.getNumDark(); a ++){
					exists = dark[a].equals(d2);
					if (exists == true){
						System.out.println("Your candy has been found: ");
						System.out.println(dark[a].toString());
						System.out.println();
						break;
					}
				}
				if (exists == false)
					System.out.println("Sorry, this candy does not exist!");
				break;
			default:
				System.out.println("Invalid input!");
			}
			if (selection == 1 || selection == 2 || selection == 3 || selection == 4)
				break;
			else
				selection = input();
		}
		System.out.println();
	}	//ends search method

	/**Procedural outputTotalCandy method
	 * This method prompts the user to enter which candy they would like to view the list for.
	 * It accepts a valid input and outputs the database of that candy to the user. 
	 * It also displays the total number of the corresponding candy.
	 * <p>
	 * Let selection represent the type of candy the user would like to see (byte)
	 * 
	 * @param none
	 * @throws IOException
	 */
	public void outputTotalCandy () throws IOException {
		byte selection;
		System.out.println();
		System.out.println("Please choose the candy you would like to list your orders for: ");
		System.out.println("1. Lollipop");
		System.out.println("2. Gummies");
		System.out.println("3. White Chocolate");
		System.out.println("4. Dark Chocolate");
		System.out.println("5. All candies");
		System.out.println();
		selection = input();
		while (true){
			switch(selection){
			case 1:
				System.out.println("Total number of Lollipops: "+Lollipops.getNumLollipops());
				System.out.println();
				for (byte a = 0; a < Lollipops.getNumLollipops(); a ++){
					System.out.println(lollipops[a].toString());
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Number of Gummies: "+Gummies.getNumGummies());
				for (byte a = 0; a < Gummies.getNumGummies(); a ++){
					System.out.println(gummies[a].toString());
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Number of White Chocolate: "+White.getNumWhite());
				for (byte a = 0; a < White.getNumWhite(); a ++){
					System.out.println(white[a].toString());
					System.out.println();
				}
				break;
			case 4:
				System.out.println("Number of Dark Chocolate: "+Dark.getNumDark());
				for (byte a = 0; a < Dark.getNumDark(); a ++){
					System.out.println(dark[a].toString());
					System.out.println();
				}
				break;
			case 5:
				System.out.println("Total number of Candies: "+Candy.getNumCandy());
				System.out.println("Total number of Lollipops: "+Lollipops.getNumLollipops());
				for (byte a = 0; a < Lollipops.getNumLollipops(); a ++){
					System.out.println(lollipops[a].toString());
					System.out.println();
				}
				System.out.println("Number of Gummies: "+Gummies.getNumGummies());
				for (byte a = 0; a < Gummies.getNumGummies(); a ++){
					System.out.println(gummies[a].toString());
					System.out.println();
				}
				System.out.println("Number of White Chocolate: "+White.getNumWhite());
				for (byte a = 0; a < White.getNumWhite(); a ++){
					System.out.println(white[a].toString());
					System.out.println();
				}
				System.out.println("Number of Dark Chocolate: "+Dark.getNumDark());
				for (byte a = 0; a < Dark.getNumDark(); a ++){
					System.out.println(dark[a].toString());
					System.out.println();
				}
				break;
			default:
				System.out.println("Invalid Input!");
			}
			if (selection == 1 || selection == 2 || selection == 3 || selection == 4 || selection == 5)
				break;
			else
				selection = input();
		}
		System.out.println();
	}	//endsOutputTotalCandy method

}	//ends Use class
