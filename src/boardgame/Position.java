package boardgame;

public class Position {
	
	//Encapsulamento
	private int row;
	private int column;
	
	//Construtores recebendo os argumentos
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	//Classe Object � uma superclasse de todas as classes:
	//Conceito de sobreposi��o(Override) quando fazemos o toString
	//estamos sobrescrevendo o m�todo toString da classe Object 
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	

}
