package tv;

public class TV {
	public int volume;
	public int channel;
	private boolean power;
	
	public TV(int i, int j, boolean b) {
		this.volume = i;
		this.channel = j;
		this.power = b;
	}

	public void status() {
		System.out.println("TV[power=" + power + ", " + "channel=" + channel + ", volume=" + volume);
	}

	public void power(boolean b) {
		this.power = b;
	}

	public void volume(int i) {
		if(i >= 1 && i <= 255) {
			this.volume = i;
		} else if(i < 0) {
			this.volume = 1;
		} else {
			this.volume = 255;
		}		
	}

	public void volume(boolean b) {
		if(b == false) {
			this.volume--;
		} else {
			this.volume++;
		}
		
		volume(this.volume);
	}

	public void channel(boolean b) {
		if(b == false) {
			this.channel--;
		} else {
			this.channel++;
		}
		channel(this.channel);
	}

	public void channel(int i) {
		if(i >= 0 && i <= 100) {
			this.channel = i;
		} else if(i < 0) {
			this.channel = 0;
		} else {
			this.channel = 100;
		}
	}

	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}

	public boolean isPower() {
		return power;
	}
	
	
}
