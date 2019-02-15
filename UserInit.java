import java.util.*;
public class UserInit extends CountryList{
	
	
		public static void main(String[] args)
		{
			
			CountryList.main(args);
			
			//define/initialize lists of countries for each person
			ArrayList<Country> LiamCountries = new ArrayList<Country>();
			ArrayList<Country> RyanCountries = new ArrayList<Country>();
			ArrayList<Country> SamCountries = new ArrayList<Country>();
			ArrayList<Country> AustinCountries = new ArrayList<Country>();
			for (int i = 0; i < countryList.size(); i++)
			{
				if (countryList.get(i).getOwner().equals("Liam"))
					LiamCountries.add(countryList.get(i));
				
				else if (countryList.get(i).getOwner().equals("Ryan"))
					RyanCountries.add(countryList.get(i));
				else if (countryList.get(i).getOwner().equals("Sam"))
					SamCountries.add(countryList.get(i));
				else if (countryList.get(i).getOwner().equals("Austin"))
					AustinCountries.add(countryList.get(i));
			}
			
			//each user is defined and parameter is a list of countries
			WorldPower Liam = new WorldPower(LiamCountries);
			WorldPower Ryan = new WorldPower(RyanCountries);
			WorldPower Sam = new WorldPower(SamCountries);
			WorldPower Austin = new WorldPower(AustinCountries);
			
			//set all variables for each user
			System.out.println("Liam: ");
			Liam.setGDP();
			Liam.setNuclearCapability();
			Liam.setNatRec();
			Liam.setCINC();
			Liam.setHDI();
			System.out.println(Liam);
			
			System.out.println();
			
			System.out.println("Ryan: ");
			Ryan.setGDP();
			Ryan.setNuclearCapability();
			Ryan.setNatRec();
			Ryan.setCINC();
			Ryan.setHDI();
			System.out.println(Ryan);
			
			System.out.println();
			
			System.out.println("Sam: ");
			Sam.setGDP();
			Sam.setNuclearCapability();
			Sam.setNatRec();
			Sam.setCINC();
			Sam.setHDI();
			System.out.println(Sam);
			
			System.out.println();
			
			System.out.println("Austin: ");
			Austin.setGDP();
			Austin.setNuclearCapability();
			Austin.setNatRec();
			Austin.setCINC();
			Austin.setHDI();
			System.out.println(Austin);
			
			
	}
}
