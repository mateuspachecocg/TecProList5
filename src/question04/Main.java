package question04;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		System.out.println("ENTER WITH THE FOLLOWING INFORMATIONS");
		System.out.print("NAME: ");
		String name  = input.nextLine();
		System.out.print("\nCOST PRICE: ");
		double cp  = input.nextDouble();
		System.out.print("\nSELLING PRICE: ");
		double sp  = input.nextDouble();
		System.out.print("\nEXPENSES: ");
		double be  = input.nextDouble();
		
		Product product = new Product(name, cp, sp, be);
		product.calcProfitMargin();
		
		System.out.printf("The profit margin of %s is %.2f%%.", product.getName(),product.getProfitMargin());
		// TODO: CALCULATE AND PROFIT MARGIN
		input.close();
	}

}
