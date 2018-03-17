package game.moves;

import game.GameState;
import game.Move;
import game.Position;
import game.pieces.Piece;

public class RankAndFileRestricted implements MovementRestriction {

	@Override
	public boolean isValidMove(GameState state, Move move) {
		final Position from = move.getFrom();
		final Position to = move.getTo();
		Piece piece = state.getByPosition(from);
		if ((!isInSameFile(move) && !isInSameRank(move)) || move.isIdentical()) {
			return false;
		}
		if (isInSameFile(move)) {
			if (from.getRank() < to.getRank()) {
				for (int rank = from.getRank(); rank != to.getRank(); rank++) {
					
				}
			} else if (from.getRank() > to.getRank()) {
				for (int rank = from.getRank(); rank != to.getRank(); rank--) {

				}
			}
		}
	}

	private boolean isInSameRank(Move move) {
		return move.getFrom().getRank() == move.getTo().getRank();
	}

	private boolean isInSameFile(Move move) {
		return move.getFrom().getFile() == move.getTo().getFile();
	}

}
