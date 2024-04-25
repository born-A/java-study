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
		this.volume = i;		
	}

	public void volume(boolean b) {
		if(b == false) {
			this.volume--;
		} else {
			this.volume++;
		}
		
	}

	public void channel(boolean b) {
		if(b == false) {
			this.channel--;
		} else {
			this.channel++;
		}
		
	}

	public void channel(int i) {
		this.channel = i;
		
	}
}
