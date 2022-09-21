package question03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter with the radius: ");
		double r = input.nextDouble();
		
		Circle circle = new Circle(r);
		
		System.out.printf("The area of the circle is %.2f square meter and circunference length is %.2f meters.",  circle.getArea(), circle.getCircunference());
		
		System.out.print("\nEnter with the increase percentage (%): ");
		double i = input.nextDouble();
		circle.increaseCircle(i);
		
		System.out.printf("The area of the new circle is %.2f square meter and circunference length is %.2f meters.",  circle.getArea(), circle.getCircunference());
		
		input.close();
	}

}
