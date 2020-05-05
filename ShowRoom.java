package command;

public class ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen screen = new Screen();
		Command turnOn = new OpenScreenCommand(screen);
		Command turnOff = new CloseScreenCommand(screen);
		Button ArrowDownButton = new Button(turnOn);
		Button ArrowUpButton = new Button(turnOff);
		
		ArrowDownButton.push();
		System.out.println("\n");
		
		ArrowUpButton.push();
	}

}
