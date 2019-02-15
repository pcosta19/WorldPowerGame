public class Country{
	private double GDP;
	private int NumberOfNukes;
	private double CINCScore;
	private double HDIScore;
	private int NumberOfTopNaturalResources;
	private String Owner;
	private String CountryName;
	
	//gdp in billions of usd
	public Country(String name, double gdp, int nukes, double cinc, double hdi, int natrec, String owner)
	{
		GDP = gdp;
		NumberOfNukes = nukes;
		CINCScore = cinc;
		HDIScore = hdi;
		NumberOfTopNaturalResources = natrec;
		Owner = owner;
		CountryName = name;
	}
	
	public String getCountry()
	{
		return CountryName;
	}
	public double getGDP()
	{
		return GDP;
	}
	
	public int getNatRec()
	{
		return NumberOfTopNaturalResources;
	}
	
	public int getNukes()
	{
		return NumberOfNukes;
	}
	
	public double getCINC()
	{
		return CINCScore;
	}
	
	public double getHDI()
	{
		return HDIScore;
	}
	
	public String getOwner()
	{
		return Owner;
	}
	
	public String toString()
	{
		return "Owner: " + Owner + "\nGDP: " + GDP + "\nNukes: " + NumberOfNukes + "\nCINC: " + CINCScore
				+ "\nHDI: " + HDIScore + "\nNumber of Natural Resources: "
				+ NumberOfTopNaturalResources;
	}
	
	
}
