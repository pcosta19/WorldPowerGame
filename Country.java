public class Country{
	private String Name;
	private double GDP;
	private int NumberOfNukes;
	private double CINCScore;
	private double HDIScore;
	private int NumberOfTopNaturalResources;
	private String Owner;
	
	//gdp in billions of usd
	public Country(String name, double gdp, int nukes, double cinc, double hdi, int natrec, String owner)
	{
		Name = name;
		GDP = gdp;
		NumberOfNukes = nukes;
		CINCScore = cinc;
		HDIScore = hdi;
		NumberOfTopNaturalResources = natrec;
		Owner = owner;
	}
	
	public double getGDP()
	{
		return GDP;
	}

	public String getOwner(){
		return Owner;
	}
	
	public String toString()
	{
		return "Owner: " + Owner + "\nGDP: " + GDP + "\nNukes: " + NumberOfNukes + "\nCINC: " + CINCScore
				+ "\nHDI: " + HDIScore + "\nNumber of Natural Resources: "
				+ NumberOfTopNaturalResources;
	}
	
	
}
