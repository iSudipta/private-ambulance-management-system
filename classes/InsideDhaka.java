package classes;
import java.lang.*;

public class InsideDhaka extends Finance
{
	private double phonenum;

	public void setDriveP(double phonenum)
	{
		this.phonenum = phonenum;
	}
	public double getDriveP()
	{
		return phonenum;
	}

	public void showInfo()
	{
		System.out.println("Customer Name: "+name);
		System.out.println("Customer NID: "+nid);
		System.out.println("Ambulance Number Plate: "+ambulanceNumP);
		System.out.println("Driver Name: "+drname);
		System.out.println("Driver Mobile Number: "+phonenum);
	}
}