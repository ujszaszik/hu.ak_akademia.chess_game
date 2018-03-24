package game.pieces;

import game.Square;

public interface Piece {

	Square getCurrentSquare();
	
	void setCurrentSquare(Square position);

	boolean isCaptured();
	
	void setCaptured(boolean captured);

	ChessColor getColor();

	void move(Square square);

	boolean isValidMove(Square square);

}
