import java.util.*;
public class Execution {

	public static ArrayList<Country> LiamCountries;
	public static ArrayList<Country> RyanCountries;
	public static ArrayList<Country> SamCountries;
	public static ArrayList<Country> AustinCountries;
	public static void main(String[] args)
	{
		//define/initialize lists of countries for each person
		LiamCountries = new ArrayList<Country>();
		RyanCountries = new ArrayList<Country>();
		SamCountries = new ArrayList<Country>();
		AustinCountries = new ArrayList<Country>();
		
		
		WorldPower Liam = new WorldPower(LiamCountries);
		WorldPower Ryan = new WorldPower(RyanCountries);
		WorldPower Sam = new WorldPower(SamCountries);
		WorldPower Austin = new WorldPower(AustinCountries);
		
	}

	private void setOwners(){
		for (int i = 0; i < CountryList.countryList.size(); i++){
			if (CountryList.countryList.get(i).getOwner().equals("Austin")){
				AustinCountries.add(CountryList.countryList.get(i));
			}
			else if (CountryList.countryList.get(i).getOwner().equals("Ryan")){
				RyanCountries.add(CountryList.countryList.get(i));
			}
			else if (CountryList.countryList.get(i).getOwner().equals("Liam")){
				LiamCountries.add(CountryList.countryList.get(i));
			}
			else if (CountryList.countryList.get(i).getOwner().equals("Sam")){
				SamCountries.add(CountryList.countryList.get(i));
			}
		}
	}
}
