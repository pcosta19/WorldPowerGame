import java.util.ArrayList;
import java.util.*;

public class User {
	private String name;
	private ArrayList<Country> countries;
	
	public User(String n)
	{
		name = n;
		countries = new ArrayList<Country>();
	}
	
	Scanner keyboard = new Scanner(System.in);
	public void UserTurn()
	{
		System.out.println(name + ", enter the country/state you wish to claim: ");
		String claim = keyboard.nextLine();
		Country found = searchCountry(claim, 0, CountryList.allCountries.size());
		
		//check if what they have claimed is a State, if it is, subtract the area of that state
		//from the total area able to be claimed per turn
		//MUST IMPLEMENT LINE(S) TO GIVE OPTION TO USER TO END THEIR TURN
		if (found instanceof State)
		{
			double availableArea = 350000;
			while (availableArea > 0)
			{
				if (((State) found).getArea() < availableArea) 
				{
					availableArea -= ((State) found).getArea();
					countries.add(found);
				}
				else
					System.out.println("Sorry, this state's land area goes over your maximum turn claim size.");
				System.out.println("You have " + availableArea + "square miles left to claim, "
						+ "which state would you like to claim?");
				claim = keyboard.nextLine();
				found = searchCountry(claim, 0, CountryList.allCountries.size());
			}
			
		}
		
		
	}
	
	//binary search
	//search for country method, call this in the add country method
	public Country searchCountry(String c, int low, int high)
	{
		//will return null if the name typed is not associated with any Country/State
		
		int middle = (low + high)/2;
		if (c.equals(CountryList.allCountries.get(middle).getName()))
			return CountryList.allCountries.get(middle);
		else if (c.compareTo(CountryList.allCountries.get(middle).getName()) < 0)
		{
			return (searchCountry(c, low, middle - 1));
		}
		else if (c.compareTo(CountryList.allCountries.get(middle).getName()) > 0)
			return (searchCountry(c, middle+1, high));
		else
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
