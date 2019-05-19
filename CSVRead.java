import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVRead {
	public static void main(String[] args) {
		ArrayList<String[]> GDPs = new ArrayList<String[]>();
		ArrayList<String[]> HDIs = new ArrayList<String[]>();
		ArrayList<String[]> Areas = new ArrayList<String[]>();
		
		String csvFile = "./Sorted_GDPs.csv/";
		String line = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			
			while ((line = br.readLine()) != null) {
				
				GDPs.add(line.split(","));

			}
			
			for (int i = 0; i < GDPs.size(); i++) {
				System.out.println(GDPs.get(i)[0] + ": " + GDPs.get(i)[1]);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		csvFile = "./Sorted_HDIs.csv/";
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			
			while ((line = br.readLine()) != null) {
				
				HDIs.add(line.split(","));

			}
			
			for (int i = 0; i < HDIs.size(); i++) {
				System.out.println(HDIs.get(i)[0] + ": " + HDIs.get(i)[1]);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		csvFile = "./Sorted_Areas.csv/";
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			
			while ((line = br.readLine()) != null) {
				
				Areas.add(line.split(","));

			}
			
			for (int i = 0; i < Areas.size(); i++) {
				System.out.println(Areas.get(i)[0] + ": " + Areas.get(i)[1]);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
