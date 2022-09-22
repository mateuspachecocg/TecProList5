package question07;

import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot();
		
		// TODO Generate random positions to the coin
		int randomPositionX = 0;
		int randomPositionY = 0;
		while (randomPositionX == 0 || randomPositionY == 0) {
			randomPositionX = (int)(Math.random()*10);
			randomPositionY = (int)(Math.random()*10);
		}
		
		Coin coin = new Coin(randomPositionX, randomPositionY);
		
		char space[][] = new char[10][10];
		fillSpace('*', space);
		space[robot.getPositionX()][robot.getPositionY()] = '@';
		space[coin.getPx()][coin.getPy()] = '$';

		
	}
	
	public static void showSpace(char space[][]) {
		
		for(int i = 0;i < space.length;i++) {
			for (int j = 0;i < space[i].length;j++) {
				
			}
		}
	}
	
	public static char[][] fillSpace(char ch,char space[][]) {
		for(int i = 0;i < space.length;i++) {
			for (int j = 0;j < space[i].length;j++) {
				space[i][j] = ch;
			}
		}
		
		return space;
	}

}
