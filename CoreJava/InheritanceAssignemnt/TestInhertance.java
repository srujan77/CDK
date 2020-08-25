package Day2;

public class TestInhertance {

	public static void main(String[] args) {

		// WageEmployee w = new WageEmployee();
		// w.display();

		WageEmployee w1 = new WageEmployee(104, "CDK", 201, 9);
		w1.display();

		SalaryEmployee se = new SalaryEmployee(107, "sa", 1000, 200, 100);
		se.display();

	}

}
