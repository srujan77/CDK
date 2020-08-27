package Day4;

import java.util.ArrayList;
import java.util.List;

public class PersonIO {

	public List<Person> getPerson()
	{
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1,"CDK"));
		persons.add(new Person(2,"HYD"));
		persons.add(new Person(3,"Pune"));
		persons.add(new Person(4,"Delhi"));
		return persons;
	}
	public Person findById(List<Person> persons,int id)
	{
		Person person = null;
		for(Person myperson : persons)
		{
			if(myperson.getId()==id)
			{
				person=myperson;
				break;
			}
		}
		return person;
	}
	public boolean removePerson(List<Person> persons,int id)
	{
		for(Person myperson : persons)
		{
			if(myperson.getId()==id)
			{
				persons.remove(myperson);
				return true;
			}
		}
		return false;
	}
	public Person updatePerson(List<Person> persons,int id,String name)
	{
		Person person = null;
		for(Person myperson : persons)
		{
			if(myperson.getId()==id)
			{
				myperson.setName(name);
				person=myperson;
				break;
			}
		}
		return person;
	}
	public void displayAll(List<Person> persons)
	{
		for(Person myperson : persons)
		{
			System.out.println(myperson.getId()+" : "+myperson.getName());
		}
	}
	public List<Person> addPerson(List<Person> persons,Person person)
	{
		persons.add(person);
		return persons;
	}
}
