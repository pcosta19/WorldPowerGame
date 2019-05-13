import java.util.ArrayList;


public class User {
	private String name;
	private ArrayList<Country> countries;
	
	public User(String n)
	{
		name = n;
		countries = new ArrayList<Country>();
	}
	
	//binary search
	//search for country method, call this in the add country method
	public Country searchCountry(String c, int low, int high)
	{
		int middle = (low + high)/2;
		if (c.equals(CountryList.allCountries.get(middle).getName()))
			return CountryList.allCountries.get(middle);
		else if (c.compareTo(CountryList.allCountries.get(middle).getName()) < 0)
		{
			return (searchCountry(c, low, middle - 1));
		}
		else
			return (searchCountry(c, middle+1, high));
	}
	
	//use binary search to find the country we are looking for*******
	public void addCountry(String c)
	{
		Country adding = searchCountry(c, 0, CountryList.allCountries.size());
		countries.add(adding);
	}
	
	//do we need this method of can searchCountry() return a State with reference type Country???
	//search for state method, call this in the add country method
//	public Country searchState(String c, int low, int high)
//	{
//		int middle = (low + high)/2;
//		if (c.equals(CountryList.allCountries.get(middle).getName()))
//			return CountryList.allCountries.get(middle);
//		else if (c.compareTo(CountryList.allCountries.get(middle).getName()) < 0)
//		{
//			return (searchCountry(c, low, middle - 1));
//		}
//		else
//			return (searchCountry(c, middle+1, high));
//	}
	
	
	
	//do we need this???
	//use binary search to find the state we are looking for********
//	public void addState(String s)
//	{
//		for (int i = 0; i < CountryList.allCountries.size(); i++)
//		{
//			if (CountryList.allCountries.get(i).getName().equals(s))
//				countries.add(CountryList.allCountries.get(i));
//		}
//	}
	
	
	public String listCountries()
	{
		String list = "";
		for (int i = 0; i < countries.size(); i++)
		{
			list = list + "\n" + countries.get(i).getName();
		}
		return list;
	}
	
	
	public String toString()
	{
		return name + listCountries();
	}
}
