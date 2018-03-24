package game.pieces;

import game.GameState;
import game.Square;

public class Knight extends AbstractPiece {

	public Knight(Square current, boolean captured, ChessColor color, GameState gameState) {
		super(current, captured, color, gameState);
	}

	@Override
	public boolean isValidMove(Square square) {
		return false;
	}
}
