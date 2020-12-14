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

	public void definirOcupante(Peca jogador) {
		
	}
	
	public boolean informarOcupada() {
		return false;
	}
	public Peca informarOcupante() {
		return null;
		
	}
	public boolean ocupadoPor(Peca jogador) {
		return false;
		
	}
	
}
