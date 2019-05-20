import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVRead {
	private static ArrayList<String[]> GDPs;
	private static ArrayList<String[]> HDIs;
	private static ArrayList<String[]> Areas;
	private static ArrayList<String[]> Nukes;
	
	String[] ga = {"georgia", "1364"};
	String[] la = {"louisiana", "170"};
	String[] nm = {"newmexico", "1914"};
	String[] nv = {"nevada", "902"};
	String[] mo = {"missouri", "136"};
	String[] mt = {"montana", "535"};
	String[] nd = {"northdakota", "194"};
	String[] tx = {"texas", "100"};
	String[] wa = {"washington", "2364"};
	String[] wy = {"wyoming", "170"};
	
	public void update() {
		
		GDPs = new ArrayList<String[]>();
		HDIs = new ArrayList<String[]>();
		Areas = new ArrayList<String[]>();
		Nukes = new ArrayList<String[]>();
		
		Nukes.add(ga);
		Nukes.add(la);
		Nukes.add(mo);
		Nukes.add(mt);
		Nukes.add(nd);
		Nukes.add(nm);
		Nukes.add(nv);
		Nukes.add(tx);
		Nukes.add(wa);
		Nukes.add(wy);
		
		String csvFile = "./Sorted_GDPs.csv/";
		String line = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			
			while ((line = br.readLine()) != null) {
				
				GDPs.add(line.split(","));

			}
			/*
			for (int i = 0; i < GDPs.size(); i++) {
				System.out.println(GDPs.get(i)[0] + ": " + GDPs.get(i)[1]);
			}
			*/
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		csvFile = "./Sorted_HDIs.csv/";
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			
			while ((line = br.readLine()) != null) {
				
				HDIs.add(line.split(","));

			}
			/*
			for (int i = 0; i < HDIs.size(); i++) {
				System.out.println(HDIs.get(i)[0] + ": " + HDIs.get(i)[1]);
			}
			*/
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		csvFile = "./Sorted_Areas.csv/";
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			
			while ((line = br.readLine()) != null) {
				
				Areas.add(line.split(","));

			}
			/*
			for (int i = 0; i < Areas.size(); i++) {
				System.out.println(Areas.get(i)[0] + ": " + Areas.get(i)[1]);
			}
			*/
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void set() {
		int i = 0;
		int j = 0;
		for (Country c: CountryList.allCountries) {
			if (c.getGDP() == 0) {
				c.setGDP(Integer.valueOf(GDPs.get(i)[1]));
				c.setArea(Integer.valueOf(Areas.get(i)[1]));
				c.setHDI(Double.parseDouble(HDIs.get(i)[1])/10);
				c.setCINC(CountryList.allCountries.get(186).getCINC / 50);
				i++;
			}
			
			if (c.getName().equals(Nukes.get(j)[0])) {
				c.setNukes(Integer.valueOf(Nukes.get(j)[1]));
			}
			
		}
	}

}
