package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int withPartTimeWage = 2;
		int wagePerHour = 20;
		int numberOfHours = 8;
		int partTimeHours = 4;
		int workingDays = 20;
		int isPresent = (int) Math.floor(Math.random() * 10) % 3;
		switch (isPresent) {
		case 1:
			System.out.println("Employee is Prsent");
			System.out.println("Employee earn = " + numberOfHours * wagePerHour);
			System.out.println("Employee Monthly Earn = " + (numberOfHours * wagePerHour) * workingDays);
			break;
		case 2:
			System.out.println("Employee is Present");
			System.out.println("Employee earn = " + numberOfHours * wagePerHour);
			System.out.println("Employee earn with PartTime= " + partTimeHours * wagePerHour);
			System.out.println("Employee earn Whole day = " + (numberOfHours + partTimeHours) * wagePerHour);
			System.out.println(
					"Employee Monthly Earn = " + ((numberOfHours + partTimeHours) * wagePerHour) * workingDays);
			break;
		case 0:
			System.out.println("Employee is not Present");
			System.out.println("Employee earn = 0");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
