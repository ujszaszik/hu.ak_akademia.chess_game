package game;

public enum SquareColor {
	LIGHT("Light"), DARK("Dark");

	private final String color;

	private SquareColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
