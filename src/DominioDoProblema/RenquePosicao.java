package DominioDoProblema;

public class RenquePosicao {
	protected Posicao posicoes[];

	public RenquePosicao(Posicao[] posicoes) {
		super();
		this.posicoes = posicoes;
	}

	public Posicao[] getPosicoes() {
		return posicoes;
	}

	public void setPosicoes(Posicao[] posicoes) {
		this.posicoes = posicoes;
	}
	
	public boolean avaliarCondicaoVitoria(Jogador jogador) {
		return false;
	}
	
}
