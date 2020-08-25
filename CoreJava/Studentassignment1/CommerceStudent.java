package Day2;

public class CommerceStudent extends Student {
	
	private String majorSubject,collegeName;

	public CommerceStudent() {
		super();
		majorSubject="majorSubject";
		collegeName="collegeName";
	}

	public CommerceStudent(String name,double rollno,String majorSubject, String collegeName) {
		super(rollno,name);
		this.majorSubject = majorSubject;
		this.collegeName = collegeName;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return super.toString()+"CommerceStudent [majorSubject=" + majorSubject + ", collegeName=" + collegeName + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		CommerceStudent student= (CommerceStudent)obj;
		if (this.getName().equals(student.getName()) && this.getRollno()==student.getRollno() && this.getCollegeName().equals(student.getCollegeName()) && this.getMajorSubject().equals(student.getMajorSubject()))
			return true;
		
		return false;
	}
}
