package DominioDoProblema;

public class Jogador {
	protected String nome;
	protected int cor;
	protected boolean seuTurno;
	protected boolean vencedor;
	
	public Jogador(String nome, int cor, boolean seuTurno, boolean vencedor) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.seuTurno = seuTurno;
		this.vencedor = vencedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public boolean isSeuTurno() {
		return seuTurno;
	}

	public void setSeuTurno(boolean seuTurno) {
		this.seuTurno = seuTurno;
	}

	public boolean isVencedor() {
		return vencedor;
	}

	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}
	
	public boolean informarTurno() {
		return seuTurno;
	}
	
	public void inverterTurno() {
		
	}
	
	public boolean informarVencedor() {
		return seuTurno;
		
	}
	public int informarCor() {
		return cor;
		
	}
	public void iniciar() {
		
	}
	public void definirComoPrimeiro() {
		
	}
	public void definirVencedor(boolean vencedor) {
		
	}

}
