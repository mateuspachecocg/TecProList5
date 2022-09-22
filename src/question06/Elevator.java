package question06;

public class Elevator {

	private int currentfloor;
	private int numberOfFloors;
	private int maximumCapacity;
	private int passengersOnBoard;

	public Elevator(int maximumCapacity, int numberOfFloors) {
		this.maximumCapacity = maximumCapacity;
		this.numberOfFloors = numberOfFloors;
		this.currentfloor = 0;
		this.passengersOnBoard = 0;
	}

	public boolean newPassenger() {
		if (this.passengersOnBoard == this.maximumCapacity) {
			System.err.println("Capacity exceeded!");
			return false;
		} else {
			this.passengersOnBoard++;
			return true;
		}
	}

	public void exitPassenger() {
		this.passengersOnBoard--;
	}
	
	public void nextFloorUp() {
		if (this.currentfloor == this.numberOfFloors) {
			System.err.println("Number of Floors exceeded!");
		} else {
			this.currentfloor++;
		}
	}
	
	public void nextFloorDown() {
		if (this.currentfloor == 0) {
			System.err.println("You are in the ground!");
		} else {
			this.currentfloor--;
		}
	}

	public int getCurrentfloor() {
		return currentfloor;
	}

	public void setCurrentfloor(int currentfloor) {
		this.currentfloor = currentfloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getMaximumCapacity() {
		return maximumCapacity;
	}

	public void setMaximumCapacity(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	public int getPassengersOnBoard() {
		return passengersOnBoard;
	}

	public void setPassengersOnBoard(int passengersOnBoard) {
		this.passengersOnBoard = passengersOnBoard;
	}
	
	
	
}
