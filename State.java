
public class State extends Country{
	private double LandArea;
	
	public State(String n, double gdp, int nukes, double cinc, double hdi, double area) {
		super(n, gdp, nukes, cinc, hdi);
		LandArea = area;
	}
	
	public double getArea()
	{
		return LandArea;
	}
	

}
