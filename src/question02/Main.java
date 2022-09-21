package question02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Albert Einstein");
		Person p2 = new Person("Isaac Newton");
		
		p1.adjustBirthDay(14, 3, 1879);
		p2.adjustBirthDay( 4, 1, 1643);
		
		p1.calcAge(21, 9, 2022);
		p2.calcAge(21, 9, 2022);
		
		System.out.println("The age of " + p1.getName()+ " is " + p1.getAge() + " years old.");
		System.out.println("The age of " + p2.getName()+ " is " + p2.getAge() + " years old.");

	}

}
