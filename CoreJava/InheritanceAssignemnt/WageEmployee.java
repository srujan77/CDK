package Day2;

public class WageEmployee extends Employee {

	private int wages;
	private int no_of_hours;

	public WageEmployee() {
		super();
		System.out.println("wage emp");
		wages = 200;
		no_of_hours = 8;
	}

	public WageEmployee(int empId, String empName, int wages, int no_of_hours) {
		super(empId, empName);
		this.wages = wages;
		this.no_of_hours = no_of_hours;
	}

	public void display() {
		super.display();
		System.out.println("Wages : " + wages + " hours worked : " + no_of_hours);
	}

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}

	public int getNo_of_hours() {
		return no_of_hours;
	}

	public void setNo_of_hours(int no_of_hours) {
		this.no_of_hours = no_of_hours;
	}

}
