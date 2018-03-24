package game.moves;

import game.GameState;
import game.Move;
import game.Position;
import game.pieces.ChessColor;
import game.pieces.Piece;

public abstract class AbstractMovesRestriction implements MovementRestriction {

	@Override
	public boolean isValidMove(GameState state, Move move) {
		GameState virtual = new GameState(state);
		virtual.executeMove(move);
		Position from = move.getFrom();
		Piece fromPiece = state.getByPosition(from);
		ChessColor color = fromPiece.getColor();
		if (virtual.isInCheck(color)) {
			return false;
		}
		return true;
	}

}