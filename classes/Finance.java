package classes;
import java.lang.*;
import interfaces.*;

public abstract class Finance
{
	protected String nid;
	protected String name;
	protected String drname;
	protected String ambulanceNumP;

	public void setNid(String nid)
	{
		this.nid = nid;
	}
	public String getNid()
	{
		return nid;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setDriverName(String drname)
	{
		this.drname = drname;
	}
	public String getDriverName()
	{
		return drname;
	}

	public void setAmbulanceNum(String ambulanceNumP)
	{
		this.ambulanceNumP = ambulanceNumP;
	}
	public String getAmbulanceNum()
	{
		return ambulanceNumP;
	}

	public abstract void showInfo();
}