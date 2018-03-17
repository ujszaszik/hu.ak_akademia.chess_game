package game;

import java.util.HashMap;
import java.util.Map;

public final class Position {

	private static final Map<Position, Position> positions = new HashMap<>();

	private final char file;
	private final byte rank;

	private Position(char file, byte rank) {
		this.file = file;
		this.rank = rank;
	}

	/*
	 * Caching all 64 positions in a hash map
	 */

	public static Position of(char file, byte rank) {
		Position position = new Position(file, rank);
		if (positions.containsKey(position)) {
			return positions.get(position);
		} else {
			positions.put(position, position);
			return position;
		}
	}

	public static Position of(String position) {
		return of(position.charAt(0), Byte.parseByte(position.substring(1, 2)));
	}

	public char getFile() {
		return file;
	}

	public byte getRank() {
		return rank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + file;
		result = prime * result + rank;
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
		Position other = (Position) obj;
		if (file != other.file) {
			return false;
		}
		if (rank != other.rank) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(file).append(rank).toString();
	}

}
