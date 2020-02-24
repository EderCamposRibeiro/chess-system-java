package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8. ");
		}
		
		this.column = column;
		this.row = row;
	}

	public char getColum() {
		return column;
	}

	public int getRow() {
		return row;
	}
	//matrix_row = 8 - chess_row
	//matrix_column = chess_column - 'a'
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPositionn(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
