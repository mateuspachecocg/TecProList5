package question01;

public class RemoteControl {
	private int volume;
	private int channel;
	
	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}
	
	public void channelNext() {
		channel++;
	}
	
	public void channelBack() {
		channel--;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int n) {
		channel = n;
	}
	
	public RemoteControl (int vol, int ch) {
		volume  = vol;
		channel = ch;
	}
}
