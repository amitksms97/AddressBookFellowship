import java.util.*;

class Person
{
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	String phoneNumber;

	Person(String firstName,String lastName,String address,String city,String state,int zip,String phoneNumber)
	{
		this.firstName=firstName;
		this.lastName=lastName;	
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
	}

	public String getPersonFirstName()
	{
		return this.firstName;
	}

	public String getPersonLastName() 
	{
		return this.lastName;
	}

	public String getCity()
	{
		return this.city;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public int getZIP()
	{
		return this.zip;
	}

	public static Comparator<Person> personFirstNameComparator = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {
		   String personLastName1 = p1.getPersonFirstName().toUpperCase();
		   String personLastName2 = p2.getPersonFirstName().toUpperCase();  
		   int result=personLastName1.compareTo(personLastName2);
		   if(result!=0)
		   {
			   return result;
		   }
		   else
		   {
			   String personFirstName1 = p1.getPersonLastName().toUpperCase();
			   String personFirstName2 = p2.getPersonLastName().toUpperCase();
			   return personFirstName1.compareTo(personFirstName2);
		   }
	}};
	
	public static Comparator<Person> personZIPComparator = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {

		   int zip1 = p1.getZIP();
		   int zip2 = p2.getZIP();
		   int result=zip1-zip2;
		   if(result!=0)
			   return result;
		   else
		   {
			   String personFirstName1 = p1.getPersonFirstName().toUpperCase();
			   String personFirstName2 = p2.getPersonFirstName().toUpperCase();
			   return personFirstName1.compareTo(personFirstName2);
		   }
	}};
	
	public static Comparator<Person> personCityComparator = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {

			   String personCity1 = p1.getCity().toUpperCase();
			   String personCity2 = p2.getCity().toUpperCase();  
			   int result=personCity1.compareTo(personCity2);
			   if(result!=0)
			   {
				   return result;
			   }
			   else
			   {
				   String personFirstName1 = p1.getPersonFirstName().toUpperCase();
				   String personFirstName2 = p2.getPersonFirstName().toUpperCase();
				   return personFirstName1.compareTo(personFirstName2);
			   }
	}};
	
	public static Comparator<Person> personStateComparator = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {

			   String personState1 = p1.getState().toUpperCase();
			   String personState2 = p2.getState().toUpperCase();  
			   int result=personState1.compareTo(personState2);
			   if(result!=0)
			   {
				   return result;
			   }
			   else
			   {
				   String personFirstName1 = p1.getPersonFirstName().toUpperCase();
				   String personFirstName2 = p2.getPersonFirstName().toUpperCase();
				   return personFirstName1.compareTo(personFirstName2);
			   }
	}};
}

public class AddressBookMain {
	static ArrayList<Person> addressBook=new ArrayList<Person>();
	static Scanner sc=new Scanner (System.in);
	static int choice=0;
	
	public static void addPerson() {
		addressBook.add(new Person("Amit","Kumar","amit.kumar@gmail.com","Jamshedpur","Jharkhand",831003,"9430354429"));
		addressBook.add(new Person("steven","king","steven.king@gmail.com","california","USA",90201,"5151234560"));
		addressBook.add(new Person("Neena","kochhar","neena.kochhar@gmail.com","kerala","india",682001,"8675654380"));
		addressBook.add(new Person("Khuboo","Singh","khusboo.singh@gmail.com","maharashtra","india",421301,"9768334455"));
		addressBook.add(new Person("Taukir","kazi","taukir.kazi@gmail.com","Ahmadi","kuwait",36361,"965987579"));
		addressBook.add(new Person("Mayesha","Dolare","mayesha.dolare@yahoo.com","Abudabi","UAE",307501,"48767656"));
		
	}
	
	public static void createContact()
	{	
		boolean duplicate=false;
		System.out.println("Enter your first name:");
		String firstName=sc.next();
		System.out.println("Enter your last name:");
		String lastName=sc.next();
		System.out.println("Enter your email address:");
		String address=sc.next();
		for(int i=0;i<addressBook.size();i++) {
			Person person=addressBook.get(i);
			if(firstName.equalsIgnoreCase(person.firstName) && lastName.equalsIgnoreCase(person.lastName) && address.equalsIgnoreCase(person.address))
			{
				duplicate=true;
			}
		}
		
		if(duplicate==false) {
		System.out.println("Enter your city name:");
		String city=sc.next();
		System.out.println("Enter your state name:");
		String state=sc.next();
		System.out.println("Enter your zip code:");
		int zip=sc.nextInt();
		System.out.println("Enter your phone number:");
		String phoneNumber=sc.next();
		Person p=new Person(firstName,lastName,address,city,state,zip,phoneNumber);
		addressBook.add(p);
		}
		else
			System.out.println("Contact cannot be addeed. This contact is already present");
	}
	
	public static void displayContact()
	{
		if(addressBook.size()==0)
		{
			System.out.println("No records in address book!");
			System.out.println("-----------------------");
		}
		else
		{
			System.out.println("Printing address book....");
			System.out.println(" First Name        Last Name        Address        State        City         ZIP Code         Phone Number");
			System.out.println("---------------------------------------------------------------------------------------");
			for(int i=0;i<addressBook.size();i++)
			{
				Person person=addressBook.get(i);
				System.out.println(" "+person.firstName+"       "+person.lastName+"       "+person.address+"       "+person.state+"       "+person.city+"       "+person.zip+"       "+person.phoneNumber);
				System.out.println(" ");
			}
			System.out.println("--------------------------------------------------------------------------------------------");
	}
	}
	
	public static void editContact()
	{
		System.out.println("Enter first name and last name of person to be edited:");
		String firstName=sc.next();
		String lastName=sc.next();
		int flag=0;
		for(int i=0;i<addressBook.size();i++) {
			Person person=addressBook.get(i);
		if(firstName.equalsIgnoreCase(person.firstName) && lastName.equalsIgnoreCase(person.lastName))
			{
					System.out.println("1.Edit address\n2.Edit city\n3.Edit state\n4.Edit zip\n5.Edit phone number");
					System.out.println("Enter option:");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter new address:");
						String address=sc.next();
						person.address=address;
						break;
					case 2:
						System.out.println("Enter new city:");
						String city=sc.next();
						person.city=city;
						break;
					case 3:
						System.out.println("Enter new state:");
						String state=sc.next();
						person.state=state;
						break;
					case 4:
						System.out.println("Enter new zip:");
						int zip=sc.nextInt();
						person.zip=zip;
						break;
					case 5:
						System.out.println("Enter new phone number:");
						String phoneNumber=sc.next();
						person.phoneNumber=phoneNumber;
						break;
					default:
						System.out.println("Enter valid option");
						break;
					}
					System.out.println("Edit successful");
					flag=1;
					break;
			}
		}
		if(flag==0)
			System.out.println("No record found!");
	}
	public static void deleteContact()
	{
		System.out.println("Enter details of person to be deleted");
		System.out.println("Enter first name:");
		String firstName=sc.next();
		System.out.println("Enter last name:");
		String lastName=sc.next();
		int flag=0;
		for(int i=0;i<addressBook.size();i++)
		{
			Person person=addressBook.get(i);
			if(firstName.equals(person.firstName) && lastName.equals(person.lastName)) {
				flag=1;
				addressBook.remove(person);
				break;
			}
		}
		if(flag==0)
			System.out.println("No record found!");
		else
			System.out.println("Deletion successful!");
	}
	
	public static void sortByFirstName()
	{
		Collections.sort(addressBook,Person.personFirstNameComparator);
		System.out.println("Sorting by last name successful!");
	}
	
	public static void sortByCity()
	{
		Collections.sort(addressBook,Person.personCityComparator);
		System.out.println("Sorting by last name successful!");
	}
	
	public static void sortByState()
	{
		Collections.sort(addressBook,Person.personStateComparator);
		System.out.println("Sorting by last name successful!");
	}
	
	public static void sortByZip()
	{
		Collections.sort(addressBook,Person.personZIPComparator);
		System.out.println("Sorting by last name successful!");
	}
	
	public static void main(String[] args) {
		System.out.println("--------------Welcome to Address Book Program--------------\n");
		addPerson();
		do
		{
		System.out.println("1.Add a person\n2.Edit a person\n3.Delete a person\n4.Search a person\n5.Print Address book\n6.Sort Address book by first name\n7.Sort Address book by ZIP\n8.Sort Address book by City\n9.Sort Address book by State\n10.Exit address book");
		System.out.println("Select an option from above options:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			createContact();
			break;
		case 2:
			editContact();
			break;
		case 3:
			deleteContact();
			break;
		case 4:
			/*searchPerson();*/
			break;
		case 5:
			displayContact();
			break;
		case 6:
			sortByFirstName();
			break;
		case 7:
			sortByZip();
			break;
		case 8:
			sortByCity();
			break;
		case 9:
			sortByState();
			break;
		case 10:
			System.out.println("Exiting address book....");
			break;
		default:
			System.out.println("Enter correct option:");
			break;
		}
		System.out.println("-------------------");
		}while(choice!=10);
	}
}
