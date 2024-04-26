package prob2;

public class SmartPhone extends MusicPhone {
	
	public void execute(String function) {
		if(function.equals("음악")) {
			downPlayMusic();
			return;
		} else if(function.equals("앱")) {
			playApp();
			return;
		}
		
		super.execute(function);
	}
	
	public void playApp() {
		System.out.println("앱실행");
		
	}

	public void downPlayMusic() {
		System.out.println("다운로드해서 음악재생");
	
	}
}
