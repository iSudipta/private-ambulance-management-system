package classes;
import java.lang.*;
import interfaces.*;

public class Customer implements FinanceOperation
{
	public String name;
	private String phone;
	private Finance finance[] = new Finance [10];

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return phone;
	}

	public boolean addBooking(Finance f)
	{
		boolean flag = false;
		for(int i=0; i<finance.length; i++)
		{
			if(finance[i] == null)
			{
				finance[i] = f;
				flag = true;
				break;
			}
	    }
		return flag;
	}

	public boolean removeBooking(Finance f)
	{
		boolean flag = false;
		for(int i=0; i<finance.length; i++)
		{
			if(finance[i] == f)
			{
				finance[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void showAllBookedAmbulance()
	{
		for(Finance f : finance)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
	}

	public Finance searchBookedAmbulance(String nid)
	{
		Finance f = null;
		
		for(int i=0; i<finance.length; i++)
		{
			if(finance[i] != null)
			{
				if(finance[i].getNid() == nid)
				{
					f = finance[i];
					break;
				}
			}
		}		
		return f;
	}

}