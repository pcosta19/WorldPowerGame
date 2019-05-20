import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVRead {
	private static ArrayList<String[]> GDPs = new ArrayList<String[]>();
	private static ArrayList<String[]> HDIs = new ArrayList<String[]>();
	private static ArrayList<String[]> Areas = new ArrayList<String[]>();
	private static ArrayList<String[]> Nukes = new ArrayList<String[]>();
	
	static String[] ga = {"georgia", "1364"};
	static String[] la = {"louisiana", "170"};
	static String[] nm = {"newmexico", "1914"};
	static String[] nv = {"nevada", "902"};
	static String[] mo = {"missouri", "136"};
	static String[] mt = {"montana", "535"};
	static String[] nd = {"northdakota", "194"};
	static String[] tx = {"texas", "100"};
	static String[] wa = {"washington", "2364"};
	static String[] wy = {"wyoming", "170"};
	
public static void update() {
		
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
			if (c instanceof State) {
				c.setGDP(Double.parseDouble(GDPs.get(i)[1]));
				((State) c).setArea(Integer.valueOf(Areas.get(i)[1]));
				c.setHDI(Double.parseDouble(HDIs.get(i)[1])/10);
				c.setCINC(0.142149/50);
				i++;
			}
			
			if (c.getName().equals(Nukes.get(j)[0])) {
				c.setNukes(Integer.valueOf(Nukes.get(j)[1]));
				j++;
			}
		}
	}

}

//cinc = allCountries.get(186).getCINC / 50;
