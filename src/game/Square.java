package game;

import java.util.HashMap;
import java.util.Map;

public final class Square {

	private static final Map<Square, Square> squares = new HashMap<>();

	private final Position current;
	private final SquareColor color;

	private Square(Position current, SquareColor color) {
		this.current = current;
		this.color = color;
	}

	public static Square of(char file, byte rank) {
		Square square = new Square(Position.of(file, rank), determineColor(file, rank));
		if (squares.containsKey(square)) {
			return squares.get(square);
		} else {
			squares.put(square, square);
			return square;
		}
	}

	public static Square of(String position) {
		return of(position.charAt(0), Byte.parseByte(position.substring(1, 2)));
	}
	
	public static Square of(Position position) {
		return of(position.getFile(), position.getRank());
	}

	public Position getPosition() {
		return current;
	}

	private static SquareColor determineColor(char file, byte rank) {
		SquareColor result;

		// using fall through logic

		switch (file) {
		case 'a':
		case 'c':
		case 'e':
		case 'g':
			result = isEven(rank) ? SquareColor.LIGHT : SquareColor.DARK;
			break;
		case 'b':
		case 'd':
		case 'f':
		case 'h':
			result = isEven(rank) ? SquareColor.DARK : SquareColor.LIGHT;
			break;
		default:
			throw new IllegalArgumentException("Illegal square position!");
		}
		return result;
	}

	private static boolean isEven(byte rank) {
		return rank % 2 == 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (color == null ? 0 : color.hashCode());
		result = prime * result + (current == null ? 0 : current.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Square other = (Square) obj;
		if (color != other.color) {
			return false;
		}
		if (current == null) {
			if (other.current != null) {
				return false;
			}
		} else if (!current.equals(other.current)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return current.toString();
	}

}
