
public class StudentManipulation {
	public Student[] createStudents(){
		Student students[]=new Student[3];
		students[0]=new Student("Srikar","Tenth",16,85,90,92,94);
		students[1]=new Student("Srujan","Tenth",16,86,80,91,92);
		students[2]=new Student("Vikram","Tenth",17,97,99,82,84);
		return students;
	}
	
	public int total(Student student)
	{
		return (student.getSubject1()+student.getSubject2()+student.getSubject3());
	}
	public Student findMax(Student students[])
	{
		int max=0;
		Student  maxStudent = null ;
		for(Student student:students)
		{
			int temp=total(student);
			if (temp>max)
			{
				max=temp;
				maxStudent=student;
			}
						
		}
		 return maxStudent;
	}
}
