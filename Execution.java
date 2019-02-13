import java.util.*;
public class Execution {
	public static void main(String[] args)
	{
		//define/initialize lists of countries for each person
		ArrayList<Country> LiamCountries = new ArrayList<Country>();
		ArrayList<Country> RyanCountries = new ArrayList<Country>();
		ArrayList<Country> SamCountries = new ArrayList<Country>();
		ArrayList<Country> AustinCountries = new ArrayList<Country>();
		
		
		WorldPower Liam = new WorldPower(LiamCountries);
		WorldPower Ryan = new WorldPower(RyanCountries);
		WorldPower Sam = new WorldPower(SamCountries);
		WorldPower Austin = new WorldPower(AustinCountries);
		
	}
}
