package classes;
import java.lang.*;
import interfaces.*;

public class Management implements AmbulanceOperations, CustomerOperations
{
	private Customer customers[] = new Customer[1500];
	private Ambulance ambulance[] = new Ambulance[1500];

	public boolean insertCustomer(Customer c)
	{
		boolean flag = false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeCustomer(Customer c)
	{
		boolean flag = false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Customer searchCustomer(String phone)
	{
		Customer c = null;
		
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getPhone().equals(phone))
				{
					c = customers[i];
					break;
				}
			}
		}
		return c;
	}

	public void showAllCustomers()
	{
		for(Customer c : customers)
		{
			if(c != null)
			{
				System.out.println("Customer Name: "+ c.getName());
				System.out.println("Customer Phone: "+ c.getPhone());
				System.out.println();
				c.showAllBookedAmbulance();
				
			}
		}
	}

	public boolean addAmbulance(Ambulance a)
	{
		boolean flag = false;
		for(int i=0; i<ambulance.length; i++)
		{
			if(ambulance[i] == null)
			{
				ambulance[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeAmbulance(Ambulance a)
	{
		boolean flag = false;
		for(int i=0; i<ambulance.length; i++)
		{
			if(ambulance[i] == a)
			{
				ambulance[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Ambulance searchAmbulance(String emnP)
	{
		Ambulance a = null;
		
		for(int i=0; i<ambulance.length; i++)
		{
			if(ambulance[i] != null)
			{
				if(ambulance[i].getEmnPl().equals(emnP))
				{
					a = ambulance[i];
					break;
				}
			}
		}
		return a;
	}

	public void showAllAmbulance()
	{
		System.out.println("\t++++++++++++++++++++++++++++++++++");
		for(Ambulance a : ambulance)
		{
			if(a != null)
			{
				System.out.println("\tDriver Name: "+ a.getName());
				System.out.println("\tAmbulance Number Plate No: "+ a.getEmnPl());
				System.out.println("\tAmbulance Type: "+ a.getType());
				System.out.println();
			}
		}
		System.out.println("\t+++++++++++++++++++++++++++++++++");
	}
}