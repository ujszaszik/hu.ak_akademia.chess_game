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

	@Override
	public String toString() {
		return null;
	}

}
