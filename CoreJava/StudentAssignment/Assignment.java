
public class Assignment {

	public static void main(String args[])
	{
		StudentManipulation sm= new StudentManipulation();
		Student studs[]=sm.createStudents();
		for(Student stu : studs){
			stu.display();
			System.out.println("--------------");
		}
		System.out.println("student with maximum marks is...");
		sm.findMax(studs).display();
	}
}
