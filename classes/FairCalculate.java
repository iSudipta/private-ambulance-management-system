package classes;
import java.lang.*;

public class FairCalculate{

	private double Kilometer;
	
	public void getDistance(double Kilometer)
	{
		this.Kilometer=Kilometer;
	}
	public double retDistance()
	{
		return Kilometer;
	}
	public void FairCalculation()
	{
		double Perkilo=8;
		double calculation=Kilometer*Perkilo;
		System.out.println("Fair is: "+calculation+" taka\n");
	}

}