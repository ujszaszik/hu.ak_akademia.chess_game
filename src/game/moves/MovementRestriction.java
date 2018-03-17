package game.moves;

import game.GameState;
import game.Move;

public interface MovementRestriction {
	
	boolean isValidMove(GameState state, Move move);

}
