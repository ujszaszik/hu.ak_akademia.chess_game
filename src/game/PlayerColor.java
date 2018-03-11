package game;

public enum PlayerColor {
	BLACK("Black"), WHITE("White");

	private final String color;

	private PlayerColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
