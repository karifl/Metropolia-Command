package command;

public class CloseScreenCommand implements Command {
	private Screen screen;
	
	public CloseScreenCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.screenClose();
	}
}
