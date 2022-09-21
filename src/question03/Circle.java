package question03;

public class Circle {

	private double radius;
	private final double pi = 3.14;
	
	public double getArea() {
		return pi*radius*radius;
	}
	
	public double getCircunference() {
		return 2*pi*radius;
	}

	public void increaseCircle (double percentage) {
		this.radius = this.radius*(1 + percentage/100.0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
 
}
