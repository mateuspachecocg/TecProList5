package question02;

public class Person {

	private int age;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	private String name;

	public void calcAge(int day, int month, int year) {
		// TODO METHOD TO CALCULATE AGE
		int factor;
		if (day - this.dayOfBirth < 0) {
			if (month - this.monthOfBirth <  0) {
				factor = - 1;
			} else {
				factor = 0;
			}
		} else {
			if(month - this.monthOfBirth < 0) {
				factor = - 1;
			} else {
				factor = 0;
			}
		}
		
		this.age = year - this.yearOfBirth + factor;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void adjustBirthDay(int day, int month, int year) {
		this.dayOfBirth = day;
		this.monthOfBirth = month;
		this.yearOfBirth = year;
	}
	
	public Person (String name) {
		this.name = name;
	}

}
