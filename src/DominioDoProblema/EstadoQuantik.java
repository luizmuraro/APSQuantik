package DominioDoProblema;

public class EstadoQuantik {
	protected String mensagem = "Jogo Pentago - aguardando iniciar partida";
	protected Lance lance;
	protected int[][] valoresTabuleiro = new int[6][6];

	public EstadoQuantik(Lance lance) {
		super();
		this.lance = lance;
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

	public void assumirValorTabuleiro(int linha, int coluna, Peca peca) {

	}

}
