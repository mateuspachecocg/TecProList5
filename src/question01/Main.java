package question01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Test 1 Passed = " + testContructorAndGets());
		System.out.println("Test 2 Passed = " + testChangeVolume());
		System.out.println("Test 3 Passed = " + testChangeChannel());

		
		
	}
	
	public static boolean testContructorAndGets() {
		RemoteControl rc = new RemoteControl(50, 99);
		
		boolean testResult = true;
		
		testResult = testResult && (rc.getVolume() == 50);
		testResult = testResult && (rc.getChannel() == 99);
		
		return testResult;
	}
	
	
	public static boolean testChangeVolume() {
		RemoteControl rc = new RemoteControl(50, 99);
		
		boolean testResult = true;
		
		rc.volumeUp();
		testResult = testResult && (rc.getVolume() == 51);
		rc.volumeDown();
		testResult = testResult && (rc.getVolume() == 50);
		
		return testResult;
	}
	
	public static boolean testChangeChannel() {
		RemoteControl rc = new RemoteControl(50, 99);
		
		boolean testResult = true;
		
		rc.channelBack();
		testResult = testResult && (rc.getChannel() == 98);
		rc.channelNext();
		testResult = testResult && (rc.getChannel() == 99);
		rc.setChannel(45);
		testResult = testResult && (rc.getChannel() == 45);
		
		return testResult;
	}
}
