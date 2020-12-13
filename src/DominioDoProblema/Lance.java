package DominioDoProblema;

public class Lance {
	protected int linha;
	protected int coluna;
	protected Peca peca;

	public Lance(int linha, int coluna, Peca peca) {
		super();
		this.linha = linha;
		this.coluna = coluna;
		this.peca = peca;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public void definirPosicao(int linha, int coluna, Peca peca) {

	}

	public int informarLinha() {
		return linha;
	}

	public int informarColuna() {
		return coluna;
	}

	public Peca informarPeca() {
		return peca;
	}
}
