package Day2;

public class TestStudent {
	
	public static boolean search(Student students[],Student student)
	{
		for(Student mystudent:students)
		{
			if (mystudent.getClass()==student.getClass())
			{
				if(mystudent.equals(student))
					return true;
			}
		}
		
		return false;	
	}

	public static void main(String[] args) {
		Student students[]=new Student[7];
		students[0]=new EnggStudent("Srujan",1286,"IT","SVIT");
		students[1]=new EnggStudent("Srikar",1285,"IT","SVIT");
		students[2]=new EnggStudent("Vikram",1097,"cse","SVIT");
		students[3]=new BscStudent("Srujan",3216,"science","MGR");
		students[4]=new BscStudent("Srikar",3252,"Arts","MGR");
		students[5]=new CommerceStudent("vikram",4123,"Science","KBR");
		students[6]=new CommerceStudent("Srikar",4512,"Maths","KBR");
		
		CommerceStudent newstudent = new CommerceStudent("vikram",4123,"Science","KBR");
		if(search(students,newstudent))
			System.out.println("Student found");
		else
			System.out.println("student not found");
		EnggStudent newstudent1 = new EnggStudent("Srikar",1280,"IT","SVIT");
		if(search(students,newstudent1))
			System.out.println("Student found");
		else
			System.out.println("student not found");
		

	}

}
