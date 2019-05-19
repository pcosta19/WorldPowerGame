import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVRead {
	private ArrayList<String[]> GDPs = new ArrayList<String[]>();
	private ArrayList<String[]> HDIs = new ArrayList<String[]>();
	private ArrayList<String[]> Areas = new ArrayList<String[]>();
	private ArrayList<String[]> Nukes = new ArrayList<String[]>();
	
	//Nukes.add(String[] ["wyoming", "170"]);
	
	public void update() {
		/*
		GDPs = new ArrayList<String[]>();
		HDIs = new ArrayList<String[]>();
		Areas = new ArrayList<String[]>();
		*/
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
	private 
	public void set() {
		int i = 0;
		int j = 0;
		for (Country c: CountryList.allCountries) {
			if (c.getGDP() == 0) {
				c.setGDP(Integer.valueOf(GDPs.get(i)[1]));
				c.setArea(Integer.valueOf(Areas.get(i)[1]));
				c.setHDI(Integer.valueOf(HDIs.get(i)[1]));
			}
			/*
			if (c.getName().equals(Nukes.get(j)[0])) {
				c.setNukes(Integer.valueOf(Nukes.get(j)[1]));
			}
			*/
		}
	}

}

//cinc = allCountries.get(186).getCINC / 50;
