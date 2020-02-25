package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	//N�o gero o construtor com a posi��o pois a posi��o tem que iniciar nula!
	public Piece(Board board) {
		this.board = board;
		//Est� aqui s� paraa enfatizar que � nulo por�m n�o precisa inicializar "position"
		position = null;
	}

	//Tira o set para n�o permitir que o tabuleiroo seja alterado!
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
