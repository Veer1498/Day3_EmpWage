package empwage;

public class EmpWage {
	public static final int employeePresent = 1;
	public static final int withPartTimeWage = 2;
	public static final int wagePerHour = 20;
	public static final int totalWorkingHours =100;
	public static final int totalWorkingDays = 20;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int numberOfHours = 0 ;
		int empWagePerday;
		int totalWorkDays = 0 , totalWorkHours = 0;
		int totalEmployeeWage =0;
		while (totalWorkHours<= totalWorkingHours && totalWorkDays < totalWorkingDays) {
		totalWorkDays++;
		int isPresent = (int) Math.floor(Math.random()*10) %3;
		switch (isPresent) {
			case employeePresent :
				numberOfHours =8;
				totalWorkHours += wagePerHour; 
				empWagePerday = (numberOfHours * wagePerHour);
				System.out.println("Employee is Present, Daily Wage = " + empWagePerday);
				break;
			case withPartTimeWage :
				numberOfHours =4;
				totalWorkHours += wagePerHour; 
				empWagePerday = (numberOfHours * wagePerHour);
				System.out.println("Employee is Part Time Present, Daily Wage = " + empWagePerday);
				break;
			default :
				numberOfHours = 0;
				totalWorkHours += wagePerHour; 
				empWagePerday = (numberOfHours * wagePerHour);
				System.out.println("Employee is Absent , Daily Wage = " + empWagePerday);
		}
		totalWorkHours += numberOfHours;
		System.out.println("day  = " + totalWorkDays + " No. of Hours = " +numberOfHours);
		}
		totalEmployeeWage= totalWorkHours * wagePerHour;
		System.out.println("Total Employee Wage is "+ totalEmployeeWage);
	}
}
