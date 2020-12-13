package DominioDoProblema;

public class Posicao {
	protected Peca ocupante;
	
	public Posicao(Peca ocupante) {
		super();
		this.ocupante = ocupante;
	}
	

	public Peca getOcupante() {
		return ocupante;
	}

	public void setOcupante(Peca ocupante) {
		this.ocupante = ocupante;
	}

	public void definirOcupante(Jogador jogador) {
		
	}
	
	public boolean informarOcupado() {
		return false;
	}
	public Jogador informarOcupante() {
		return null;
		
	}
	public boolean ocupadoPor(Jogador jogador) {
		return false;
		
	}
	
}
