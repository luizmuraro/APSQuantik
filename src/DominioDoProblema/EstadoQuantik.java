package DominioDoProblema;

public class EstadoQuantik {
	protected String mensagem;
	protected Lance lance;
	protected int[][] valoresTabuleiro;
	
	public EstadoQuantik(String mensagem, Lance lance, int[][] valoresTabuleiro) {
		super();
		this.mensagem = mensagem;
		this.lance = lance;
		this.valoresTabuleiro = valoresTabuleiro;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Lance getLance() {
		return lance;
	}

	public void setLance(Lance lance) {
		this.lance = lance;
	}

	public int[][] getValoresTabuleiro() {
		return valoresTabuleiro;
	}

	public void setValoresTabuleiro(int[][] valoresTabuleiro) {
		this.valoresTabuleiro = valoresTabuleiro;
	}
	
	public String informarMensagem() {
		return mensagem;
		}
	public Lance informarLance() {
		return lance;
		}
	public void assumirValorTabuleiro(int linha, int coluna, int valor) {
		
	}
	
}
