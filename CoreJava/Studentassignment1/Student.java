package Day2;

public class Student {
	private double rollno;
	private String name;

	public Student() {
		super();
		rollno = 0;
		name = "name";
	}

	public Student(double rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public double getRollno() {
		return rollno;
	}

	public void setRollno(double rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}
