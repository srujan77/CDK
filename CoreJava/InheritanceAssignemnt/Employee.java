package Day2;

public class Employee {

	private	int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Employee() {

		System.out.println("emp");
		empId=0;
		empName="name";
	}
	public void display()
	{
		System.out.println("Name : "+empName+" Id : "+empId);
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}
