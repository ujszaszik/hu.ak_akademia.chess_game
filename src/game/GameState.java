package game;

import java.util.HashMap;
import java.util.Map;

import game.pieces.ChessColor;
import game.pieces.King;
import game.pieces.Piece;

public class GameState {

	private Map<Square, Piece> chessBoard;

	public GameState() {
		chessBoard = new HashMap<>();
	}

	public GameState(Map<Square, Piece> chessBoard) {
		this.chessBoard = chessBoard;
	}

	/*
	 * we make a copy from the chessboard, but we will NOT copy the pieces!
	 */

	public GameState(GameState state) {
		this(new HashMap<>(state.getChessBoard()));
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

	public boolean isInCheck(ChessColor color) {
		for (Map.Entry<Square, Piece> entry : chessBoard.entrySet()) {
			Piece piece = entry.getValue();
			if (piece.getColor() != color) {
				Position to = getKing(color);
				if (piece.isValidMove(Square.of(to))) {
					return true;
				}
			}
		}
		return false;
	}

	private Position getKing(ChessColor color) {
		for (Map.Entry<Square, Piece> entry : chessBoard.entrySet()) {
			Piece piece = entry.getValue();
			if (piece instanceof King && piece.getColor().equals(color)) {
				return entry.getKey().getPosition();
			}
		}
		throw new IllegalStateException("King for player " + color + " could not be found.");
	}

	public void executeMove(Move move) {
		Square fromSquare = Square.of(move.getFrom());
		Piece fromPiece = chessBoard.get(fromSquare);
		Square toSquare = Square.of(move.getTo());
		Piece toPiece = chessBoard.get(toSquare);
		if (toPiece != null) {
			toPiece.setCaptured(true);
		}
		fromPiece.setCurrentSquare(toSquare);
	}

}