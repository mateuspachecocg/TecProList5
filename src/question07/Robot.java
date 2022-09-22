package question07;

public class Robot {
	private int px, py;
	private int moveInN, moveInNE, moveInE, moveInSE, moveInS, moveInSW, moveInW, moveInNW;

	public Robot(int x0, int y0) {
		px = x0;
		py = y0;
		moveInN = 0;
		moveInNE = 0;
		moveInE = 0;
		moveInSE = 0;
		moveInS = 0;
		moveInSW = 0;
		moveInW = 0;
		moveInNW = 0;
	}

	public Robot() {
		px = 4;
		py = 4;
		moveInN = 0;
		moveInNE = 0;
		moveInE = 0;
		moveInSE = 0;
		moveInS = 0;
		moveInSW = 0;
		moveInW = 0;
		moveInNW = 0;
		
	}

	public void moveToNorth() {
		py++;
		moveInN++;
	}

	public void moveToNorthEast() {
		px++;
		py++;
		moveInNE++;
	}

	public void moveToEast() {
		px++;
		moveInE++;
	}

	public void moveToSouthEast() {
		px++;
		py--;
		moveInSE++;
	}

	public void moveToSouth() {
		py--;
		moveInS++;
	}

	public void moveToSouthWest() {
		px--;
		py--;
		moveInSW++;
	}

	public void moveToWest() {
		px--;
		moveInW++;		
	}

	public void moveToNorthWest() {
		px--;
		py++;
		moveInNW++;
	}
	
	public int getPositionX() {
		return this.px;
	}
	
	public int getPositionY() {
		return this.py;
	}
}
