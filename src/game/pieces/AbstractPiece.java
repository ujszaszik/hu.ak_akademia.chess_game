package game.pieces;

import game.GameState;
import game.Square;

public abstract class AbstractPiece implements Piece {

	protected Square current;
	protected boolean captured;
	protected final ChessColor color;
	protected GameState gameState;

	public AbstractPiece(Square current, boolean captured, ChessColor color, GameState gameState) {
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
	public void setCurrentSquare(Square current) {
		this.current = current;
	}

	@Override
	public boolean isCaptured() {
		return captured;
	}
	
	@Override 
	public void setCaptured(boolean captured) {
		this.captured = captured;
	}

	@Override
	public ChessColor getColor() {
		return color;
	}

	@Override
	public void move(Square square) {
		if (!isValidMove(square)) {
			throw new IllegalStateException("Illegal move");
		}
	}

}
