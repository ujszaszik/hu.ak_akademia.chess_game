package game.pieces;

public enum ChessColor {
	BLACK("Black"), WHITE("White");

	private final String color;

	private ChessColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
