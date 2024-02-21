import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Welcome to Private Ambulance Management Service");
		System.out.println("-----------------------------------------------\n");

		Scanner sc = new Scanner(System.in);
		Management m = new Management();
		FairCalculate fcl = new FairCalculate();
		AboutUs about = new AboutUs();

		String user, pass;
		System.out.println("Enter Username:");
		user = sc.nextLine();
		System.out.println("Enter Password");
		pass =sc.nextLine();
		if(user.equals("Turjo") && pass.equals("1234"))
		{System.out.println("Login Successfull!!");}
		else if(user.equals("Sudipta") && pass.equals("1212"))
		{System.out.println("Login Successfull!!");}
		else if(user.equals("Arnab") && pass.equals("4321"))
		{System.out.println("Login Successfull!!");}
		else if(user.equals("Mehedi") && pass.equals("2000"))
		{System.out.println("Login Successfull!!");}
		else {System.out.println("Incorrect Password or Username");}

		boolean choice = true;

		while(choice)
		{
			System.out.println("\nPlease Select an option from below: \n");
			System.out.println("\t1. Ambulance Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Booked Ambulance Management");
			System.out.println("\t4. Estimated Fair Calculator");
			System.out.println("\t5. About Us");
			System.out.println("\t6. Exit the Application");
			System.out.println("-----------------------------------\n");

			System.out.print("\tEnter Your Choice: ");

			int first = sc.nextInt();

			switch(first)
			{
				case 1:

					System.out.println("-----------------------------------------");
					System.out.println("***You selected Ambulance Management***");
					System.out.println("-----------------------------------------");

					System.out.println("\tPlease Select An Option: \n");
					System.out.println("\t1. Add New Ambulance");
					System.out.println("\t2. Remove Existing Ambulance");
					System.out.println("\t3. See All Ambulace");
					System.out.println("\t4. Search An Ambulance");
					System.out.println("\t5. Go Back");

					System.out.print("\tEnter Your Choice: ");

					int option1 = sc.nextInt();

					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You Selected to Add new Ambulance");
							System.out.println("---------------------------------");


							System.out.print("\tEnter Ambulance Number Plate: ");
							String emnP1 = sc.next();
							System.out.print("\tEnter Driver Name: ");
							String name1 = sc.next();
							System.out.print("\tEnter Ambulance Type: ");
							String fair1 = sc.next();

							Ambulance a1 = new Ambulance();
							a1.setEmnPl(emnP1);
							a1.setName(name1);
							a1.setType(fair1);

							if(m.addAmbulance(a1))
							{
								System.out.println("\n\tNew Ambulance Added with Plate No "+a1.getEmnPl());
							}
							else
							{
								System.out.println("\tCan Not Add Ambulance");
							}

							break;

						case 2:

							System.out.println("-----------------------------------------");
							System.out.println("You selected Remove An Existing Ambulance");
							System.out.println("-----------------------------------------");

							System.out.println("Enter Ambulance Number Plate to Remove: ");

							String emnP2 = sc.next();

							Ambulance a2 = m.searchAmbulance(emnP2);

							if(a2 != null)
							{
								if(m.removeAmbulance(a2))
								{
									System.out.println("--Ambulance Removed--");
								}
								else
								{
									System.out.println("--Can Not Remove Ambulance--");
								}
							}
							else
							{
								System.out.println("Ambulance Do Not Exist");
							}

							break;

						case 3:
							System.out.println("----------------------------------------");
							System.out.println("You have selected to see all Ambulance");
							System.out.println("----------------------------------------");

							m.showAllAmbulance();

							break;

						case 4:
							System.out.println("--------------------------------");
							System.out.println("You selected Search an Ambulance");
							System.out.println("--------------------------------");

							System.out.println("Enter Ambulance Number Plate to Search: ");
							String emnP3 = sc.next();

							Ambulance a3 = m.searchAmbulance(emnP3);
							
							if(a3 != null)
							{
								System.out.println("\t--Ambulance Found--");

								System.out.println("\tAmbulance NumberPlate No: "+a3.getEmnPl());
								System.out.println("\tDriver Name: "+a3.getName());
								System.out.println("\tAmbulance Type: "+a3.getType());
							}
							else
							{
								System.out.println("--Ambulance Not Found--");
							}
							break;							
							
						case 5:

							System.out.println("Going Back........");
							break;

						default:

							System.out.println("Input Invalid");
							break;

					}
					break;

				case 2:
					System.out.println("-------------------------------------------");
					System.out.println("***You have selected Customer Management***");
					System.out.println("-------------------------------------------");

					System.out.println("Please Select An Option:: \n");
					System.out.println("\t1. Add New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. See All Customers");
					System.out.println("\t4. Search A Customer");
					System.out.println("\t5. Go Back\n");

					System.out.print("\tEnter Your Choice: ");

					int option2 = sc.nextInt();

					switch(option2)
					{
						case 1:

							System.out.println("--------------------------------");
							System.out.println("You Selected Insert New Customer");
							System.out.println("--------------------------------");

							System.out.print("\tEnter Customer Phone Number: ");
							String phone1 = sc.next();
							System.out.print("\tEnter Customer Name: ");
							String name1 = sc.next();
							
							Customer c1 = new Customer();

							c1.setPhone(phone1);
							c1.setName(name1);
							
							if(m.insertCustomer(c1))
							{
								System.out.println("\n\tCustomer Inserted With PhoneNumber"+c1.getPhone());
							}
							else
							{
								System.out.println("Can Not Insert Customer");
							}

							break;
							
						case 2:

							System.out.println("------------------------------");
							System.out.println("You Selected Remove A Customer");
							System.out.println("------------------------------");

							System.out.print("Enter Customer Phone Number: ");
							String phone2 = sc.next();
							
							Customer c2 = m.searchCustomer(phone2);

							if(c2 != null)
							{
								if(m.removeCustomer(c2))
								{
									System.out.println("\tCustomer Removed With PhoneNumber : "+c2.getPhone());
								}
								else
								{
									System.out.println("Can Not Remove");
								}
							}
							else
							{
								System.out.println("Customer Do Not Exist");
							}

							break;
						
						case 3:

							System.out.println("-----------------------------");
							System.out.println("You Selected See All Customer");
							System.out.println("-----------------------------");

							m.showAllCustomers();

							break;

						case 4:

							System.out.println("------------------------------");
							System.out.println("You Selected Search A Customer");
							System.out.println("------------------------------");

							System.out.print("Enter Customer Phone Number: ");
							String phone3 = sc.next();

							Customer c3 = m.searchCustomer(phone3);

							if(c3 != null)
							{
								System.out.println("Customer Found");

								System.out.println("Customer Phone: "+ c3.getPhone());
								System.out.println("Customer Name: "+ c3.getName());
							}
							else
							{
								System.out.println("Customer Do Not Exist");
							}
							break;
						
						case 5:
						
							System.out.println("Going Back........");
							break;
							
						default:
						
							System.out.println("Input Invalid");
							break;
					}
					break;

				case 3:
					System.out.println("---------------------------------------------");
					System.out.println("You have selected Booked Ambulance Management");
					System.out.println("---------------------------------------------");

					System.out.println("Choose from the following options: \n");
					System.out.println("\t1. Add New Booked Ambulance");
					System.out.println("\t2. Remove Existing Booked Ambulance");
					System.out.println("\t3. See All Booked Ambulance");
					System.out.println("\t4. Go Back\n");

					System.out.print("\tEnter Your Choice: ");

					int option3 = sc.nextInt();

					switch(option3)
					{
						case 1:
							System.out.println("------------------------");
							System.out.println("Add New Booked Ambulance");
							System.out.println("------------------------");

							System.out.println("Enter Customer Phone Number: ");
							String phone1 = sc.next();

							if(m.searchCustomer(phone1) !=null)
							{		
								System.out.println("Choose Location");
								System.out.println("\t1. Inside Dhaka");
								System.out.println("\t2. Outside Dhaka");
								System.out.println("\t3. Go Back\n");
								System.out.println("\tEnter Your Choice");

								int type =sc.nextInt();

								if(type == 1)
								{
									System.out.println("Enter Customer Name: ");
									String cus1 = sc.next();
									System.out.println("Enter Customer NID: ");
									String nid1 = sc.next();
									System.out.println("Enter Ambulance Numer Plate: ");
									String emnP2 = sc.next();
									System.out.println("Enter Driver Name: ");
									String dbn1 = sc.next();
									System.out.println("Enter Driver Phone Number: ");
									double phonenum = sc.nextDouble();

									InsideDhaka idk = new InsideDhaka();

									idk.setName(cus1);
									idk.setNid(nid1);
									idk.setAmbulanceNum(emnP2);
									idk.setDriverName(dbn1);
									idk.setDriveP(phonenum);

									if(m.searchCustomer(phone1).addBooking(idk))
									{
										System.out.println("Ambulance Booked for "+phone1+" Name: "+cus1);
									}
									else
									{
										System.out.println("Can Not Book");
									}
								}
								else if(type == 2)
								{
									System.out.println("Enter Customer Name: ");
									String cus1 = sc.next();
									System.out.println("Enter Customer NID: ");
									String nid1 = sc.next();
									System.out.println("Enter Ambulance Number Plate: ");
									String emnP2 = sc.next();
									System.out.println("Enter Driver Name: ");
									String dbn1 = sc.next();
									System.out.println("Enter Driver Phone Number: ");
									double phonenumb = sc.nextDouble();

									OutsideDhaka odk = new OutsideDhaka();

									odk.setName(cus1);
									odk.setNid(nid1);
									odk.setAmbulanceNum(emnP2);
									odk.setDriverName(dbn1);
									odk.setDrivePh(phonenumb);

									if(m.searchCustomer(phone1).addBooking(odk))
									{
										System.out.println("Ambulance Booked for "+phone1+" Name: "+cus1);
									}
									else
									{
										System.out.println("--Can Not Book--");
									}
								}
								else if(type == 3)
								{
									System.out.print("Going Back........");
								}
								else
								{
									System.out.println("Input Invalid");
								}
							}
							else
							{
								System.out.println("Phone No Mismatch");
							}

							break;

						case 2:

							{
								System.out.println("------------------------------------");
								System.out.println("You selected Remove Booked Ambulance");
								System.out.println("------------------------------------");

								System.out.println("Enter Customer Phone Number: ");
								String phone2 = sc.next();

								System.out.println("Enter Customer Nid to Remove: ");
								String nid2 = sc.next();

								m.searchCustomer(phone2).removeBooking(m.searchCustomer(phone2).searchBookedAmbulance(nid2));

								break;

							}

						case 3:

							{
								System.out.println("--------------------------------------");
								System.out.println("You Selected Show All Booked Ambulance");
								System.out.println("--------------------------------------");

								System.out.println("Enter Customer Phone Number: ");

								String phone3 = sc.next();

								m.searchCustomer(phone3).showAllBookedAmbulance();

								break;
							}

						case 4:
						{
							System.out.println("Going Back........");
							break;
						}

						default:

							System.out.println("Input Invalid");
							break;
					}

				case 4:

					System.out.println("------------------------------");
					System.out.println("You Selected Fair Calculator: ");
					System.out.println("------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1.Calculate Estimated Fair");
					System.out.println("\t2.Go Back");
					
					System.out.println("\tYour Option: ");
					
					int option4 = sc.nextInt();

					  
					switch(option4)	
					{
						case 1:
						
							System.out.println("---------------------------");
							System.out.println("Per Kilometer Fair is 8 taka");
							System.out.println("Enter Your Distance in Kilometer: \n");
							double inputDistance = sc.nextDouble();
							fcl.getDistance(inputDistance);
							fcl.FairCalculation();
							
							
							
							break;
							
						case 2:
						
							System.out.println("Going Back........");
							break;
							
						default:
						
							System.out.println("Input Invalid");
							break;							
							
						
					}
                    break;

                case 5:

                	about.aboutUs();
                	break;
                case 6:
					
					System.out.println("---------------");
					System.out.println("You Choose Exit");
					System.out.println("---------------");
					choice = false;
					break;
					
				default:
				
					System.out.println("-------------------");
					System.out.println("Invalid Choice.....");
					break;

			}
		}
	}
}