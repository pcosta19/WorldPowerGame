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
	
	//calculate GDP elsewhere, just type it in for the parameter
	//in trillions
	public void setGDP()
	{
		GDP = 0;
		for (Countries x: Countries)
			GDP += 
	}
	
	//number of natural resources of which the player has the majority of production
	public void setNatRec(int i)
	{
		NumberOfTopNaturalResources = i;
	}
	
	//just the number of nukes
	public void setNuclearCapability(int i)
	{
		NuclearCapability = i;
	}
	
	//the calculated power of ally excluding this variable
	public void setPowerOfAllies(double i)
	{
		PowerOfAllies = i;
	}
	
	//average CINC score of all territory * 100
	public void setCINC(double i)
	{
		CINCScore = i;
	}
	
	//average HDI of all countries/states * 10
	public void setHDI(double i)
	{
		HDIScore = i;
	}
	
	//number of powerful shipping routes
	//there are 8 major shipping routes
	//num multiplied by 2 because control over shipping routes = important
	public void numberPowerShipping(int num)
	{
		PowerOfShippingRoutes = num;
	}
	
	//use this to view the list of countries a person has control over
	public void listCountries()
	{
		for (String x: Countries)
			System.out.println(x);
	}
	
	public double totalPower()
	{
		return GDP/2; 
	}
	
	public String toString()
	{
		return "CINC: " + CINCScore + "\nGDP: " + GDP + "\nNukes: " + NuclearCapability
				+ "\nPower of Allies: " + PowerOfAllies + "\nPower of Shipping Routes: " + PowerOfShippingRoutes
				+ "\nNumber of Controlled Natural Resources: " + NumberOfTopNaturalResources +
				"\nHDI Score: " + HDIScore;
	}
	
	
	
	
	
	
}
