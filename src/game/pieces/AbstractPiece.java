package game.pieces;

import game.GameState;
import game.Square;

public abstract class AbstractPiece implements Piece {

	protected Square current;
	protected boolean captured;
	protected PieceColor color;
	protected GameState gameState;

	public AbstractPiece(Square current, boolean captured, PieceColor color, GameState gameState) {
		this.current = current;
		this.captured = captured;
		this.color = color;
		this.gameState = gameState;
	}

	@Override
	public Square getCurrentSquare() {
		return current;
	}

	@Override
	public boolean isCaptured() {
		return captured;
	}

	@Override
	public PieceColor getColor() {
		return color;
	}

	@Override
	public void move(Square square) {
		if (!isValidMove(square)) {
			throw new IllegalStateException("Illegal move");
		}
	}

}
