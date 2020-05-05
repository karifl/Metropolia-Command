package command;

public class Button {

	Command com;
	
	public Button(Command cmd) {
		this.com = cmd;
	}
	
	public void push() {
		com.execute();
	}
}
