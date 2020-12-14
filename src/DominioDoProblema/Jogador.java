package DominioDoProblema;

public class Jogador {
	protected String nome;
	protected int cor;
	protected boolean seuTurno = false;
	protected boolean vencedor = false;
	
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
		if (seuTurno) {
			seuTurno = false;
		} else {
			seuTurno = true;
		}
	}
	
	public boolean informarVencedor() {
		return vencedor;
		
	}
	public int informarCor() {
		return cor;
		
	}
	public void iniciar() {
		cor = 2;
		seuTurno = false;
		vencedor = false;
	}
	public void definirComoPrimeiro() {
		cor = 1;
		seuTurno = true;
	}
	public void definirVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}

}
