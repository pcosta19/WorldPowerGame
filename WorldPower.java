import java.util.*;

public class WorldPower {
	//all variables considered for world power
	private double GDP;
	private double NuclearCapability;
	private double PowerOfAllies;
	private double PowerOfShippingRoutes;
	private double CINCScore;
	private double HDIScore;
	private int NumberOfTopNaturalResources;
	private ArrayList<Country> Countries;
	
	//constructor just takes the countries owned
	public WorldPower(ArrayList<Country> countries)
	{
		Countries = countries;
	}
	
	
	public void setGDP()
	{
		GDP = 0;
		for (Country x: Countries)
			GDP += x.getGDP();
	}
	
	//number of natural resources of which the player has the majority of production
	public void setNatRec()
	{
		NumberOfTopNaturalResources = 0;
		for (Country x: Countries)
			NumberOfTopNaturalResources += x.getNatRec();
	}
	
	//just the number of nukes
	public void setNuclearCapability()
	{
		NuclearCapability = 0;
		for (Country x: Countries)
			NuclearCapability += x.getNukes();
	}
	
	
	//sum of all CINC scores
	public void setCINC()
	{
		CINCScore = 0;
		for (Country x: Countries)
			CINCScore += x.getCINC();
	}
	
	//average HDI of all countries
	public void setHDI()
	{
		HDIScore = 0;
		for (Country x: Countries)
			HDIScore += x.getHDI();
		HDIScore /= Countries.size();
	}
	
	//number of powerful shipping routes
	//there are 8 major shipping routes
	//num multiplied by 2 because control over shipping routes = important
	public void numberPowerShipping(int num)
	{
		PowerOfShippingRoutes = num;
	}
	
	//use this to view the list of countries a person has control over
	//I highly doubt this works as intended, will probably just print mem loc of each country
	public void listCountries()
	{
		for (Country x: Countries)
			System.out.println(x);
	}
	
	public double totalPower()
	{
		return 100*GDP/78280 + CINCScore*HDIScore*100 + NuclearCapability/5820 
				+ (NumberOfTopNaturalResources + PowerOfShippingRoutes)/100; 
	}
	
	public String toString()
	{
		return "CINC: " + CINCScore + "\nGDP: " + GDP + "\nNukes: " + NuclearCapability
				+ "\nPower of Allies: " + PowerOfAllies + "\nPower of Shipping Routes: " + PowerOfShippingRoutes
				+ "\nNumber of Controlled Natural Resources: " + NumberOfTopNaturalResources +
				"\nHDI Score: " + HDIScore;
	}
	
}
