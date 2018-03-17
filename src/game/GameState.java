package game;

import java.util.HashMap;
import java.util.Map;

import game.pieces.Piece;

public class GameState {

	private Map<Square, Piece> chessBoard;

	public GameState() {
		chessBoard = new HashMap<>();
	}

	public GameState(Map<Square, Piece> chessBoard) {
		this.chessBoard = chessBoard;
	}
	
	public Map<Square, Piece> getChessBoard() {
		return chessBoard;
	}
	
	public Piece getByPosition(Position position) {
		Square fromSquare = Square.of(position);
		return chessBoard.get(fromSquare);
	}

	@Override
	public String toString() {
		return null;
	}

}
