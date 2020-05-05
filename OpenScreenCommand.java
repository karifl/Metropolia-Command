package command;

public class OpenScreenCommand implements Command{
	private Screen screen;
	
	public OpenScreenCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.screenOpen();
	}
}
