
public class Student {
	private String name, standard;
	private int age,id,subject1,subject2,subject3;
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}


	public Student(String name, String standard, int age, int id, int subject1, int subject2, int subject3) {
		super();
		this.name = name;
		this.standard = standard;
		this.age = age;
		this.id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	public Student()
	{
		name="";
		age=0;
		standard="";
		id=0;
		subject1=subject2=subject3=0;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Id : "+id);
		System.out.println("Standard : "+standard);
		System.out.println("Subject1 : "+subject1);
		System.out.println("subject2 : "+subject2);
		System.out.println("subject3 : "+subject3);
	}
}
