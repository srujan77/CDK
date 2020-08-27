import java.util.Scanner;

import com.io.EmpIOImpl;
import com.io.MyEmpOperations;
import com.pojo.Employee;

public class Assignment {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		MyEmpOperations obj = new MyEmpOperations();
		EmpIOImpl obj1 = new EmpIOImpl();
		Employee employee;
		System.out.println("1.Add employee");
		System.out.println("2.update employee");
		System.out.println("3.delete employee");
		System.out.println("4.findById");
		System.out.println("5.findAll");
		System.out.println("6.exit");
		while(true)
		{
			System.out.println("ënter an option :  ");
			int option= sc.nextInt();
			if(option==1)
			{
				employee=obj1.readFromUser();
				if(obj.addEmployee(employee))
				{
					System.out.println("employee added.....");
				}
				else
				{
					System.out.println("ëmployee not added..");
				}
				
			}
			else if(option==2)
			{
				System.out.println("ënter the id of employee to update : " );
				int id = sc.nextInt();
				System.out.println("ënter the name of employee to update : " );
				String name=sc.next().trim();
				employee=obj.updateEmployee(id, name);
				if(employee==null)
					System.out.println("employee not found");
				else
				{
					System.out.println(employee);
					System.out.println("employee updated....");
				}
			}
			else if(option==3)
			{
				System.out.println("ënter the id of employee to delete : " );
				int id = sc.nextInt();
				employee=obj.deleteEmployee(id);
				if(employee==null)
					System.out.println("employee not found");
				else
				{
					System.out.println(employee);
					System.out.println("employee deleted...");
				}
			}
			else if(option==4)
			{
				System.out.println("ënter the id of employee to find : " );
				int id = sc.nextInt();
				employee=obj.findEmployeeById(id);
				if(employee==null)
					System.out.println("employee not found");
				else
					System.out.println(employee);
			}
			else if(option==5)
			{
				obj.findAllEmployees();
			}
			else if(option==6)
			{
				System.out.println("exiting....");
				break;
			}
			else{
				System.out.println("ënter a valid option......");
			}
		}
		sc.close();
	}

}
