import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Use1 {

	final static byte MAX = 10;
	static Object lollipops [] = new Object [MAX];
	static Object gummies [] = new Object [MAX];
	static Object white [] = new Object [MAX];
	static Object dark [] = new Object [MAX];
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Use1 u1 = new Use1 ();
		int index = 0;
		byte input, selection, change = 0, idNum; 
		u1.description();
		u1.menu();
		input = u1.input();
		while (input!=7){
			switch (input){
			case 1:
				selection = u1.buildDefaultCandy(input);
				while (true){
					if (selection == 1){
						Lollipops l1 = new Lollipops ();
						lollipops[Lollipops.getNumLollipops()-1] = l1;
						change = u1.confirmLollipops (l1);
						while (true){
							while (change == 1){
								u1.customRadius(l1);
								u1.customColour(l1);
								l1.setFactName(u1.customManuName());
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
						Lollipops l1 = new Lollipops (u1.customColour(l1), u1.customRadius(l1), u1.customManuName());
						lollipops[Lollipops.getNumLollipops()-1] = l1;
						u1.customRadius(l1);
						u1.customColour(l1);
						l1.setFactName(u1.customManuName());
						change = u1.confirmLollipops(l1);
						while (true){
							while (change == 1){
								l1.setFactName(u1.customManuName());
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
						Gummies g1 = new Gummies ();
						gummies[Gummies.getNumGummies()-1] = g1;
						change = u1.confirmGummies (g1);
						while (true){
							while (change == 1){
								g1.setFactName(u1.customManuName());
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
						Gummies g1 = new Gummies (u1.customPackNum(g1), u1.customSide(g1), u1.customManuName());
						gummies[Gummies.getNumGummies()-1] = g1;
						g1.setFactName(u1.customManuName());
						change = u1.confirmGummies(g1);
						while (true){
							while (change == 1){
								g1.setFactName(u1.customManuName());
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
						White w1 = new White ();
						white[White.getNumWhite()-1] = w1;
						change = u1.confirmWhiteChocolate (w1);
						while (true){
							while (change == 1){
								w1.setLength(u1.customLength());
								w1.setWidth(u1.customWidth());
								w1.setHeight(u1.customHeight());
								w1.setFactName(u1.customManuName());
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
						White w1 = new White (u1.customNuts(w1), u1.customLength(), u1.customWidth(), u1.customHeight(), u1.customSugarContent(), u1.customManuName());
						white[White.getNumWhite()-1] = w1;
						w1.setLength(u1.customLength());
						w1.setWidth(u1.customWidth());
						w1.setHeight(u1.customHeight());
						w1.setFactName(u1.customManuName());
						change = u1.confirmWhiteChocolate (w1);
						while (true){
							while (change == 1){
								w1.setLength(u1.customLength());
								w1.setWidth(u1.customWidth());
								w1.setHeight(u1.customHeight());
								w1.setFactName(u1.customManuName());
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
						Dark d1 = new Dark ();
						dark[Dark.getNumDark()-1] = d1;
						change = u1.confirmDarkChocolate(d1);
						while (true){
							while (change == 1){
								d1.setLength(u1.customLength());
								d1.setWidth(u1.customWidth());
								d1.setHeight(u1.customHeight());
								d1.setFactName(u1.customManuName());
								change = u1.confirmDarkChocolate (d1);
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
						Dark d1 = new Dark (u1.customCocoaContent(d1), u1.customLength(), u1.customWidth(), u1.customHeight(), u1.customSugarContent(), u1.customManuName());
						dark[Dark.getNumDark()-1] = d1;
						d1.setLength(u1.customLength());
						d1.setWidth(u1.customWidth());
						d1.setHeight(u1.customHeight());
						d1.setFactName(u1.customManuName());
						change = u1.confirmDarkChocolate (d1);
						while (true){
							while (change == 1){
								d1.setLength(u1.customLength());
								d1.setWidth(u1.customWidth());
								d1.setHeight(u1.customHeight());
								d1.setFactName(u1.customManuName());
								change = u1.confirmDarkChocolate (d1);
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
				System.out.println("Please enter the cnady that you would like to search for: ");
				System.out.println("1. Lollipop");
				System.out.println("2. Gummies");
				System.out.println("3. White Chocoalte");
				System.out.println("4. Dark Chocolate");
				selection = u1.input();
				switch(selection){
				case 1:
					System.out.println("Please enter the ID number of the lollipop: ");
					idNum = u1.input();
					break;
				case 2:
					System.out.println("Please enter the ID number of the gummy: ");
					idNum = u1.input();
					break;
				case 3:
					System.out.println("Please enter the ID number of the white chocolate: ");
					idNum = u1.input();
					break;
				case 4:
					System.out.println("Please enter the ID number of the dark chocolate: ");
					idNum = u1.input();
					break;
				default:
					System.out.println("Invalid input!");
				selection = u1.input();
				}
				break;
			case 6:

			default:
				System.out.println("Invalid Input!");
			break;
			}
			u1.menu();
			input = u1.input();
		}
		System.out.println("Byebye!");
	}

	public void description () {
		System.out.println("Welcome to the best Build-Your-Own Candy Factory in the world.");
		System.out.println("Here, we offer you to build your own lollipops, gummies, or white/dark chocolate.");
		System.out.println("Simply follow the instructions to complete your candy-building process.");
		System.out.println("Please be prepared to enter the dimensions of your candy. Additional information");
		System.out.println("will also be required for each type of candy. When making a selection, please");
		System.out.println("enter the number shown on the left of the option you wish to choose. Let's enter");
		System.out.println("the amazing Candy Factory!");
	}

	public void menu (){
		System.out.println("Enter your selection from the list below:");
		System.out.println("1. Build your own lollipop");
		System.out.println("2. Build your own gummies");
		System.out.println("3. Build your own white chocolate");
		System.out.println("4. Build your own dark chocolate");
		System.out.println("5. Search database for a candy");
		System.out.println("6. View total number of candies");
		System.out.println("7. Exit");
	}

	public String customManuName () throws IOException{
		int factNameNum = 1;
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
	}

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
	}

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
	}

	public byte buildDefaultCandy (int input) throws IOException {
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
	}

	public byte confirmLollipops (Lollipops l1) throws IOException{
		byte change;
		System.out.println(l1.toString());
		System.out.println ("Would you like to change your lollipop?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}

	public double customRadius (Lollipops l1) throws IOException{
		double radius;
		System.out.println("Please enter the radius of your lollipop: ");
		radius = inputDouble();
		l1.setRadius(radius);
		return radius;
	}

	public String customColour (Lollipops l1) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String colour;
		System.out.println("Please enter the colour of your lollipop: ");
		colour = br.readLine();
		l1.setColour(colour);
		return colour;
	}

	public void finalLollipops (Lollipops l1){
		lollipops [Lollipops.getNumLollipops()-1] = l1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(l1.toString());
		System.out.println();
	}

	public byte confirmGummies (Gummies g1) throws IOException{
		byte change;
		System.out.println(g1.toString());
		System.out.println ("Would you like to change your gummies order?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}

	public double customSide (Gummies g1) throws IOException{
		double side;
		System.out.println("Please enter the length of the side of one gummy: ");
		side = inputDouble();
		g1.setSide(side);
		return side;
	}

	public int customPackNum (Gummies g1) throws IOException {
		int packNum;
		System.out.println("Please enter the number of gummies in your order: ");
		packNum = input();
		g1.setPackNum(packNum);
		return packNum;
	}

	public void finalGummies (){
	//	gummies[Gummies.getNumGummies()-1]=g1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(gummies.toString());
		System.out.println();
	}

	public byte confirmWhiteChocolate () throws IOException{
		byte change;
		System.out.println(white.toString());
		System.out.println ("Would you like to change your chocolate bar?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}

	public byte confirmDarkChocolate (Dark d1) throws IOException{
		byte change;
		System.out.println(d1.toString());
		System.out.println ("Would you like to change your chocolate bar?");
		System.out.println ("1. Yes");
		System.out.println ("2. No");
		change = input();
		return change;
	}

	public double customLength () throws IOException{
		double length;
		System.out.println("Please enter the length of your chocolate bar: ");
		length = inputDouble();
		return length;
	}

	public double customWidth () throws IOException{
		double width;
		System.out.println("Please enter the width of your chocolate bar: ");
		width = inputDouble();
		return width;
	}

	public double customHeight () throws IOException{
		double height;
		System.out.println("Please enter the height of your chocolate bar: ");
		height = inputDouble();
		return height;
	}

	public int customSugarContent () throws IOException {
		int sugar;
		System.out.println("Please enter the sugar content of your chocolate bar: ");
		sugar = input();
		return sugar;
	}

	public int customCocoaContent (Dark d1) throws IOException{
		int cocoa;
		System.out.println("Please enter the cocoa content of your dark chocolate bar: ");
		cocoa = input();
		d1.setCocoaContent(cocoa);
		return cocoa;
	}

	public boolean customNuts (White w1) throws IOException{
		boolean nuts = false;
		System.out.println("Does your white chocolate bar contain nuts?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		if (input()==1)
			nuts = true;
		else if (input()==2)
			nuts = false;
		w1.setNuts(nuts);
		return nuts;
	}

	public void finalDarkChocolate (){
//		dark[Dark.getNumDark()-1]=d1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(dark.toString());
		System.out.println();
	}

	public void finalWhiteChocolate (){
//		white[White.getNumWhite()] = w1;
		System.out.println();
		System.out.println("You've successfully made: ");
		System.out.println(white.toString());
		System.out.println();
	}

}
