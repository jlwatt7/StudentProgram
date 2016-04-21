package studentprogram;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class StudentInformation {
		static Scanner s = new Scanner(System.in);
		static boolean userSay = true;
		private static String userAnswer1;

		public static void main(String[] args) {
			//enter names
			String [ ] names = { "","Jamilah", "Jaya", "Zakiya", "Shirley", "Jonathan", "Tanjanique", 
					"Elizabeth", "Ava", "Hunter", "DeVante"};
			
			String [ ] town = { "", "Detroit", "Miami", "Grosse Pointe", "Atlanta", "Lansing", "New York", "Chicago",
					"Royal Oak", "Cleveland", "Las Vegas"};
			
			String [ ] food = { "", "Pizza", "Fries", "Hamburgers", "Chicken", "Catfish", "Waffles", "Cheese Sticks",
					"Hot Wings", "Lasagna", "Mac & Cheese"};
			
		while (userSay){	
			//Welcome user to the app and ask for them to search for a person
			System.out.println("Welcome to our Java class. Which student would you like to learn more about? (Enter a number 1-10)");	
			int userInput = getValidNumberInRange(1,names.length-1);
			
			//prints who student is
			System.out.println(names[userInput] + " " + "is student" + " " + userInput + "!");
			System.out.println();

			System.out.println("What would you like to know about " + names[userInput] + "?" +
			" (Enter 'hometown' or 'favorite food'):");
			String userPick = s.nextLine();
			
				if (userPick.equalsIgnoreCase("hometown"))
				{System.out.println(names[userInput] + " is from " + town[userInput] + "!" );	
				}
				
				if (userPick.equalsIgnoreCase("favorite food"))
				{System.out.println(names[userInput]+"'s" + " favorite food is " + food[userInput] + "!" );
				}
				
				System.out.println("Would you like to know more? (Y/N):");
					String userAnswer1 = s.nextLine();
			
						if (userAnswer1.equalsIgnoreCase("Y"))
						{userSay = true;}
		
						if (userAnswer1.equalsIgnoreCase("N"))
						{userSay = false;
						System.out.println("Thanks! See you next time!");}
				}
}
	public static int readValidIntegerNoExp()
			{ while (!s.hasNextInt()) {
					s.nextLine();}

					int x = s.nextInt();
					s.nextLine();

					return x;
					
			}//makes users enter valid number in range
			public static int getValidNumberInRange(int min, int max) {
				int input = readValidIntegerNoExp();
				while ((input < min) || (input > max)) {
					System.out.println("Please put a number within range!");

					input = readValidIntegerNoExp();
				}
				return input;
	}
	}

