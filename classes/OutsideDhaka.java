package classes;
import java.lang.*;

public class OutsideDhaka extends Finance
{
	private double phonenumb;

	public void setDrivePh(double phonenumb)
	{
		this.phonenumb = phonenumb;
	}
	public double getDrivePh()
	{
		return phonenumb;
	}

	public void showInfo()
	{
		System.out.println("Customer Name: "+name);
		System.out.println("Customer NID: "+nid);
		System.out.println("Ambulance ID: "+ambulanceNumP);
		System.out.println("Driver Name: "+drname);
		System.out.println("Driver Mobile Number: "+phonenumb);
	}
}