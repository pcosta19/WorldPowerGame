import java.util.ArrayList;
import java.util.*;

public class User {
	private String name;
	ArrayList<Country> countries;
	
	public User()
	{
		countries = new ArrayList<Country>();
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public static User getUser(String n, User[] u)
	{
		int i = 0;
		for (User r: u)
		{
			if (r.getName().equals(n))
				return u[i];
			i++;
		}
		
		return null;
	}

	String getName() {
		
		return name;
	}

	Scanner keyboard = new Scanner(System.in);
	
	//this is how a user's turn will go during phase 1 of the game
	public void UserTurnPhaseOne()
	{
		System.out.println(name + ", enter the country/state you wish to claim: ");
		
		//we immediately add the country to the user's list of countries
		//we can then access this addition by assigning it to the variable newAddition
		//which allows us to access it and its values in subsequent lines
		addCountry(keyboard.nextLine());
		Country newAddition = countries.get(countries.size()-1);
		CountryList.allCountries.remove(newAddition);
		
		//check if what they have claimed is a State, if it is, subtract the area of that state
		//from the total area able to be claimed per turn
		if (newAddition instanceof State)
		{
			//area of alaska if about 650000, so we need maximum to be a little more than that
			//availableArea takes into account what has just been claimed
			double availableArea = 700000 - ((State) newAddition).getArea();
			
			/*The user now continues to claim states until the maximum land area is reached.
			 * If the user would like to end their turn early (i.e. if they only have 5 miles remaining),
			 * they may type 'end' to end their turn. Furthermore, if they try to claim a country,
			 * they will enter a while loop and receive a message saying they must claim a state.
			 */
			while (availableArea > 0)
			{
				
				System.out.println("You have " + availableArea + " square miles left to claim, "
						+ "which state would you like to claim? If you would like to finish claiming this turn, type 'end'");
				if (keyboard.nextLine().equals("end"))
					break;
				
				//newAddition is given a new value
				else{
					addCountry(keyboard.nextLine());
					newAddition = countries.get(countries.size()-1);
					
				}
				
				//makes the user type the name of a state if they typed in the name of a country
				//newAddition is assigned a new value accordingly
				while (newAddition instanceof Country)
				{
					countries.remove(newAddition);
					System.out.println("Sorry, you must enter a state. Try again: ");
					addCountry(keyboard.nextLine());
					newAddition = countries.get(countries.size()-1);
				}
				
				//if the state they have attempted to add a state with too much area,
				//we remove the state from their list and the loop begins again, reminding them of their available area
				if (((State) newAddition).getArea() > availableArea) {
					System.out.println("Sorry, this state's land area goes over your maximum turn claim size.");
					countries.remove(newAddition);
				}
				
				else
				{
					availableArea -= ((State) newAddition).getArea();
					CountryList.allCountries.remove(newAddition);
				}
			}
		}
		
//		//gives the user the option to trade countries with other players
//		//it is assumed that the players have reached a verbal agreement on the trade
//		//the other user will not have to confirm the trade, we are basing this off of honesty
//		System.out.println("If you would like to trade countries with another user, type 'trade', "
//				+ "otherwise, please type 'end' to complete your turn: ");
//		while (!keyboard.nextLine().equals("end"))
//		{
//			System.out.println("With whom are you trading?");
//			String recipient = keyboard.nextLine();
//			System.out.println("Which of your own countries are you trading away?");
//			//jk lol i give up idk how to write this and its 1 am
//			System.out.println("If you would like to trade countries with another user, type 'trade', "
//					+ "otherwise, please type 'end' to complete your turn: ");
//		}
	}
	
	//binary search
	//search for country method, call this in the add country method
	public Country searchCountry(String c, int low, int high)
	{
		//will return null if the name typed is not associated with any Country/State
		if(low > CountryList.allCountries.size() - 1 || low== high && !c.equals(CountryList.allCountries.get(low).getName()))
			return null;
		
		int middle = (low + high)/2;
		
		if (c.equals(CountryList.allCountries.get(middle).getName()))
			return CountryList.allCountries.get(middle);
		else if (c.compareTo(CountryList.allCountries.get(middle).getName()) < 0)
		{
			return (searchCountry(c, low, middle - 1));
		}
		else if (c.compareTo(CountryList.allCountries.get(middle).getName()) > 0)
			return (searchCountry(c, middle+1, high));
		
		return null;
		
	}
	
	
	//add the country the user types in to their list
	public void addCountry(String c)
	{
		//if the user has misspelled their country, searchCountry returns null
		//prompt user to type their claim again until their country is found
		while (searchCountry(c, 0, CountryList.allCountries.size()) == null)
		{
			System.out.println("Sorry, check your spelling and type your claim again: ");
			c = keyboard.nextLine();
		}
		countries.add(searchCountry(c, 0, CountryList.allCountries.size()));
		
	}
	
	public void removeCountry(String c) 
	{
		countries.remove(searchCountry(c, 0, CountryList.allCountries.size()));
	}
	
	//trades countries
	
//	public void tradeCforC(String uone, String utwo, String cone, String ctwo) 
//	{
//		User one = getUser(uone);
//		User two = getUser(utwo);
//		one.removeCountry(cone);
//		two.removeCountry(ctwo);
//		one.addCountry(ctwo);
//		two.addCountry(cone);
//	}
		

	
	public double getPower() 
	{		
		double power = 0;	
		for (Country c: countries) 
		{
				
		//this equation determines the percent of the world power this user controls		
		power += (c.getCINC() * 100) + ((c.getGDP() / 5000000)/1000000) + 
				(c.getHDI() * 3) + Math.log(c.getNukes() * 10);
		}	
		return power;
	}
		

	//list all the countries a user has
	public String listCountries()
	{
		String list = "";
		for (int i = 0; i < countries.size(); i++)
		{
			list = list + "\n" + countries.get(i).getName();
		}
		return list;
	}
	
	//returns the name of the user and the list of their countries
	public String toString()
	{
		return name + ": " + listCountries();
	}

	
}
