package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int withPartTimeWage = 2;
		int wagePerHour = 20;
		int numberOfHours = 8;
		int partTimeWage = 4;
		int isPresent = (int) Math.floor(Math.random() * 10) % 3;
		switch (isPresent) {
		case 0:
			System.out.println("Employee is Prsent");
			System.out.println("Employee earn = " + numberOfHours * wagePerHour);
			break;
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Employee earn with PartTime = " +numberOfHours * (withPartTimeWage+wagePerHour));
			break;
		case 2:
			System.out.println("Employee is not Present");
			System.out.println("Employee earn = 0");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
