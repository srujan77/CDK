package Day2;

public class BscStudent extends Student {

	private String specialization,collegeName;
	
	public BscStudent() {
		super();
		specialization="specialization";
		collegeName="collegeName";
	}
	

	public BscStudent(String name,double rollno,String specialization, String collegeName) {
		super(rollno,name);
		this.specialization = specialization;
		this.collegeName = collegeName;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return super.toString()+"BscStudent [specialization=" + specialization + ", collegeName=" + collegeName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		BscStudent student= (BscStudent)obj;
		if (this.getName().equals(student.getName()) && this.getRollno()==student.getRollno() && this.getCollegeName().equals(student.getCollegeName()) && this.specialization.equals(student.getSpecialization()))
			return true;
		
		return false;
	}
	
}
