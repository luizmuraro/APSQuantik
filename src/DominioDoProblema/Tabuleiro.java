package DominioDoProblema;

public class Tabuleiro {

	protected Jogador jogadorLocal;
	protected Jogador jogadorRemoto;
	protected boolean partidaEmAndamaneto = false;
	protected boolean jogadaEmAndamaneto = false;
	protected EstadoQuantik estado;
	protected Posicao posicoes[][];

	public Tabuleiro(Jogador jogadorLocal, Jogador jogadorRemoto, boolean partidaEmAndamaneto,
			boolean jogadaEmAndamaneto, EstadoQuantik estado) {
		super();
		this.jogadorLocal = jogadorLocal;
		this.jogadorRemoto = jogadorRemoto;
		this.partidaEmAndamaneto = partidaEmAndamaneto;
		this.jogadaEmAndamaneto = jogadaEmAndamaneto;
		this.estado = estado;
		this.posicoes = new Posicao[4][4];
	}

	public Jogador getJogadorLocal() {
		return jogadorLocal;
	}

	public void setJogadorLocal(Jogador jogadorLocal) {
		this.jogadorLocal = jogadorLocal;
	}

	public Jogador getJogadorRemoto() {
		return jogadorRemoto;
	}

	public void setJogadorRemoto(Jogador jogadorRemoto) {
		this.jogadorRemoto = jogadorRemoto;
	}

	public boolean isPartidaEmAndamaneto() {
		return partidaEmAndamaneto;
	}

	public void setPartidaEmAndamaneto(boolean partidaEmAndamaneto) {
		this.partidaEmAndamaneto = partidaEmAndamaneto;
	}

	public boolean isJogadaEmAndamaneto() {
		return jogadaEmAndamaneto;
	}

	public void setJogadaEmAndamaneto(boolean jogadaEmAndamaneto) {
		this.jogadaEmAndamaneto = jogadaEmAndamaneto;
	}

	public EstadoQuantik getEstado() {
		return estado;
	}

	public void setEstado(EstadoQuantik estado) {
		this.estado = estado;
	}

	public void efetuarColocaoPeca(int linha, int coluna, Peca peca) {

	}

	public void definirJogadaAndamento(boolean valor) {

	}

	public EstadoQuantik informarEstado(Lance lance) {
		return estado;
	}

	public String colocarPeça() {
		return null;

	}

	public EstadoQuantik informarEstado() {
		return estado;

	}

	public void atualizarEstado(Lance lance) {
		EstadoQuantik novoEstadoQuantik = new EstadoQuantik(lance);
		String mensagem;
		if (partidaEmAndamaneto) {
			if (!jogadaEmAndamaneto) {
				jogadorLocal.inverterTurno();
				jogadorRemoto.inverterTurno();
			}
			boolean turno = jogadorLocal.informarTurno();
			int cor = jogadorRemoto.informarCor();
			if (turno)
				cor = jogadorLocal.informarCor();
			mensagem = "Turno de " + cor;
		} else {
			boolean localVencedor = jogadorLocal.informarVencedor();
			int cor = jogadorRemoto.informarCor();
			if (localVencedor)
				cor = jogadorLocal.informarCor();
			else
				cor = jogadorRemoto.informarCor();
			mensagem = "Parabéns jogador " + cor + " você ganhou!";
		}
		novoEstadoQuantik.setMensagem(mensagem);
		for (int linha = 0; linha < 6; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				Peca peca = informarPeca(linha, coluna);
				novoEstadoQuantik.assumirValorTabuleiro(linha, coluna, peca);
			}
		}
		
	}

	public void assumirEstado(EstadoQuantik estado) {
	}

	public void receberJogada(Lance lance) {

	}

	public boolean encerrarPartida() {
		return jogadaEmAndamaneto;

	}

	public void iniciarNovaPartida(int ordem, String adversario) {
		partidaEmAndamaneto = false;
		jogadaEmAndamaneto = false;
	}

	public void esvaziar() {

	}

	public void encerrarPartidaLocalmente() {

	}

	public void avaliarEncerramentoPartida() {

	}

	public void definirPartidaEmAndamento(boolean valor) {

	}

	public void registrarJogadorLocal(String jogador) {

	}

	public void definirEstadoInicial() {

	}

	public Peca informarPeca(int linha, int coluna) {
		Peca peca;
		Posicao posicao = this.informarPosicao(linha, coluna);
		boolean ocupada = posicao.informarOcupada();
		if (ocupada)
			peca= posicao.informarOcupante();
		else
			peca = null;
	
		return peca;
	}
	public Posicao informarPosicao(int linha, int coluna) {
		return posicoes[linha][coluna];
	}
}
