package menu;

public class ExitGame implements MenuOption {

	@Override
	public boolean execute() {
		System.out.println("Thanks for playing! Good bye!");
		return true;
	}

}
