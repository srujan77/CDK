package Day4;

import java.util.List;
import java.util.Scanner;


public class Assignment {

	public static void main(String[] args) {
		System.out.println("1.Add  2.Find  3.update  4.delete  5.Display 6.exit");
		Scanner sc =new Scanner(System.in);
		PersonIO io = new PersonIO(); 
		List<Person> persons = io.getPerson();
		while(true)
		{
			System.out.println("enter your option : ");
			int option= sc.nextInt();
			if(option==1)
			{
				System.out.println("enter the id of person to add : ");
				int id =  sc.nextInt();
				System.out.println("enter the name of person to add : ");
				String name =  sc.next();
				Person person = new Person(id, name);
				persons=io.addPerson(persons, person);
				System.out.println("person added....");
			}
			else if(option==2)
			{
				System.out.println("enter the id of person to be found : ");
				int id =  sc.nextInt();
				Person person;
				person=io.findById(persons, id);
				if(person==null)
				{
					try {
						throw new PersonNotFoundException("Person  Not Found ");
					} catch (PersonNotFoundException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println(person);
				}
			}
			else if(option==3)
			{
				System.out.println("enter the id of person to be updated : ");
				int id =  sc.nextInt();
				System.out.println("enter the new name : ");
				String name =  sc.next();
				Person person;
				person=io.updatePerson(persons, id, name);
				if(person==null)
				{
					try {
						throw new PersonNotFoundException("Person  Not Found ");
					} catch (PersonNotFoundException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println(person);
				}
				
			}
			else if(option==4)
			{
				System.out.println("enter the id of person to be deleted : ");
				int id=sc.nextInt();
				if(io.removePerson(persons, id))
				{
					System.out.println("Person is removed...");
				}
				else
				{
					try {
						throw new PersonNotFoundException("Person  Not Found ");
					} catch (PersonNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
			else if(option==5)
			{
				io.displayAll(persons);
			}
			else if(option==6)
			{
				System.out.println("exiting....");
				break;
			}
			else
			{
				System.out.println("enter a valid option..");
			}
		}

	}

}
