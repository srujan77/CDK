package Day2;

public class SalaryEmployee extends Employee {
	private long salary;
	private double incentives, ta;

	public SalaryEmployee() {
		super();
		salary = 1000;
		incentives = 100;
		ta = 50;
	}

	public SalaryEmployee(int empId, String empName, long salary, double incentives, double ta) {
		super(empId, empName);
		this.salary = salary;
		this.incentives = incentives;
		this.ta = ta;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public long totalSalary() {
		return (long) (salary + incentives + ta);
	}

	public void display() {
		super.display();
		System.out.println("base salry : " + salary + " ta: " + ta + " incentives : " + incentives + " Total Salary : "
				+ totalSalary());
	}

}
