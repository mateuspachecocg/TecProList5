package question05;

public class Employee {
	private int id;
	private String firstName;
	private String secondName;
	private double monthSalary;
	private boolean workDay[];
	private final double baseSalary = 1256.70;
	
	public Employee(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public Employee(int id,String firstName, String secondName) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public double getMonthSalary() {
		return this.monthSalary;
	}
	
	public void calcMonthSalary() {
		
		int workedDays = 0;
		for (boolean boo : this.workDay) { // O (n)
			if (boo) 
				workedDays++;
		}
		double multFactor;
		if(workedDays == 30) {
			multFactor = 1.01;
		} else if (workedDays >= 28 && workedDays < 30) {
			multFactor = 1.00;
		} else if (workedDays >= 25 && workedDays <= 27) {
			multFactor = 1 - 0.02*(workedDays - this.workDay.length);
		} else if (workedDays >= 20 && workedDays <= 24) {
			multFactor = 1 - 0.03*(workedDays - this.workDay.length);
		} else {
			multFactor = 0.20; 
		}
		
		this.monthSalary = this.baseSalary*multFactor;
	}
}
