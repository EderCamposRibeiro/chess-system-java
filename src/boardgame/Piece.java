package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//Não gero o construtor com a posição pois a posição tem que iniciar nula!
	public Piece(Board board) {
		this.board = board;
		//Está aqui só paraa enfatizar que é nulo porém não precisa inicializar "position"
		position = null;
	}

	//Tira o set para não permitir que o tabuleiroo seja alterado!
	protected Board getBoard() {
		return board;
	}

	
	
}
