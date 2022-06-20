package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int isPresent =(int) Math.floor(Math.random()*10) % 2;
		if ( isPresent == employeePresent)
			System.out.println("Employee is Prsent");
		else
			System.out.println("Employee is not Present");

	}

}
