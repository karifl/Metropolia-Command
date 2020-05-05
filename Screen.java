package command;

public class Screen {
	public void screenOpen() {
		int i =0;
		for(i=5; i>=0;i--) {
			System.out.println("Screen opening in: "+i);
		}
		System.out.println("The screen is open.");
	}
	public void screenClose() {
		int i =0;
		for(i=5; i>=0;i--) {
			System.out.println("Screen closing in: "+i);
		}
		System.out.println("The screen is closed.");
	}
	
	
}
