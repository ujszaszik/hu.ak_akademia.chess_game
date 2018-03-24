package game.moves;

import game.GameState;
import game.Move;

public class DiagonalRestricted implements MovementRestriction {

	@Override
	public boolean isValidMove(GameState state, Move move) {
		return false;
	}

}