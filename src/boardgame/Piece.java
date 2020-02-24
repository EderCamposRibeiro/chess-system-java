package boardgame;

public class Piece {
	
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

	
	
}
