package Day2;

public class EnggStudent extends Student {
	private String stream, collegeName;

	public EnggStudent() {
		super();
		stream="stream";
		collegeName="collegeName";
	}

	public EnggStudent(String Name, double rollno, String stream, String collegeName) {
		super(rollno, Name);
		this.stream = stream;
		this.collegeName = collegeName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return super.toString()+"EnggStudent [stream=" + stream + ", collegeName=" + collegeName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		EnggStudent student= (EnggStudent)obj;
		if (this.getName().equals(student.getName()) && this.getRollno()==student.getRollno() && this.getCollegeName().equals(student.getCollegeName()) && this.getStream().equals(student.getStream()))
			return true;
		
		return false;
	}

}
