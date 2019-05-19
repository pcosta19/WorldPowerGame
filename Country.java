
public class Country{
	private double GDP;
	private int NumberOfNukes;
	private double CINCScore;
	private double HDIScore;
	
	private String Owner;
	private String nameCountry;
	public int landArea;
	//gdp in billions of usd
	public Country(String n, double gdp, int nukes, double cinc, double hdi)
	{
		nameCountry = n;
		GDP = gdp;
		NumberOfNukes = nukes;
		CINCScore = cinc;
		HDIScore = hdi;
		Owner = "None";
	}
	
	//need these getters so we can calculate total GDP, average HDI, and total CINC of a user
	//these are very good values to have accessible because it allows users to get an idea of each user's power
	public double getGDP()
	{
		return GDP;
	}
	
	public double getHDI()
	{
		return HDIScore;
	}
	
	public double getCINC()
	{
		return CINCScore;
	}
	
	
	//need this so a user can add countries
	public String getName()
	{
		return nameCountry;
	}
	
	//when a country is claimed, need to set owner name to the user who claimed the country
	public void newOwner(String n)
	{
		Owner = n;
	}
	
	//summary of info associated with country
	public String toString()
	{
		return "Owner: " + Owner + "\nGDP: " + GDP + "\nNukes: " + NumberOfNukes + "\nCINC: " + CINCScore
				+ "\nHDI: " + HDIScore;
	}

	public void setGDP(int i) {
		GDP = i;
		
	}


	public void setHDI(int i) {
		HDIScore = i;
		
	}
	
	
}
