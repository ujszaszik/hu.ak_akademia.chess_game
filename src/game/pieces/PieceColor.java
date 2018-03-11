package game.pieces;

public enum PieceColor {
	BLACK("Black"), WHITE("White");

	private final String color;

	private PieceColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
