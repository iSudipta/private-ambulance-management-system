package classes;
import java.lang.*;
import interfaces.*;

public class Ambulance
{
	private String name;
	private String emnP;
	private String type;

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setEmnPl(String emnP)
	{
		this.emnP = emnP;
	}
	public String getEmnPl()
	{
		return emnP;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return type;
	}
}