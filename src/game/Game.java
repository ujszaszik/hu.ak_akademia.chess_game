package game;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private final GameState initial;
	private final GameState current;
	private final List<Move> moveHistory;

	public Game() {
		initial = new GameState();
		current = new GameState();
		moveHistory = new ArrayList<>();
	}

	public Game(GameState initial, GameState current, List<Move> moveHistory) {
		this.initial = initial;
		this.current = current;
		this.moveHistory = moveHistory;
	}

	public GameState getInitial() {
		return initial;
	}

	public GameState getCurrent() {
		return current;
	}

	public List<Move> getMoveHistory() {
		return moveHistory;
	}

}
