package game.pieces;

import game.Square;

public interface Piece {

	Square getCurrentSquare();

	boolean isCaptured();

	PieceColor getColor();

	void move(Square square);

	boolean isValidMove(Square square);

}
