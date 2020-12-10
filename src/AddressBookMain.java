import java.util.*;
public class AddressBookMain {
	Scanner sc=new Scanner (System.in);
	static final String string_Constant=null;
	static final int integer_Constant=0;
	static final long long_Constant=0;
	static String firstName, lastName, address, city, state;
	int zip;
	long phoneNumber;
	AddressBookMain()
	{
		firstName=string_Constant;
		lastName =string_Constant;
		address=string_Constant;
		city=string_Constant;
		state=string_Constant;
		zip=integer_Constant;
		phoneNumber=long_Constant;
	}
	public void createContact()
	{	
		System.out.println("Enter your first name:");
		firstName=sc.next();
		System.out.println("Enter your last name:");
		lastName=sc.next();
		System.out.println("Enter your email address:");
		address=sc.next();
		System.out.println("Enter your city name:");
		city=sc.next();
		System.out.println("Enter your state name:");
		state=sc.next();
		System.out.println("Enter your zip code:");
		zip=sc.nextInt();
		System.out.println("Enter your phone number:");
		phoneNumber=sc.nextLong();
	}
	public void displayContact()
	{
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Email address: "+address);
		System.out.println("City name: "+city);
		System.out.println("State name: "+state);
		System.out.println("Zip code: "+zip);
		System.out.println("Phone Number: "+phoneNumber);
	}
	public void editPerson()
	{
		System.out.println("Enter first name and last name of person to be edited:");
		String firstNameCheck=sc.next();
		String lastNameCheck=sc.next();
		int flag=0;
		if(firstName.equalsIgnoreCase(firstNameCheck) && lastName.equalsIgnoreCase(lastNameCheck))
			{
					System.out.println("1.Edit address\n2.Edit city\n3.Edit state\n4.Edit zip\n5.Edit phone number");
					System.out.println("Enter option:");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter new address:");
						String addressNew=sc.next();
						address=addressNew;
						break;
					case 2:
						System.out.println("Enter new city:");
						String cityNew=sc.next();
						city=cityNew;
						break;
					case 3:
						System.out.println("Enter new state:");
						String stateNew=sc.next();
						state=stateNew;
						break;
					case 4:
						System.out.println("Enter new zip:");
						int zipNew=sc.nextInt();
						zip=zipNew;
						break;
					case 5:
						System.out.println("Enter new phone number:");
						long phoneNumberNew=sc.nextLong();
						phoneNumber=phoneNumberNew;
						break;
					default:
						System.out.println("Enter valid option");
						break;
					}
					System.out.println("Edit successful");
					flag=1;
			}
		if(flag==0)
			System.out.println("No record found!");

	}
	public static void main(String[] args) {
		System.out.println("--------------Welcome to Address Book Program--------------\n");
		AddressBookMain obj=new AddressBookMain();
		obj.createContact();
		obj.displayContact();
		obj.editPerson();
	}
}
