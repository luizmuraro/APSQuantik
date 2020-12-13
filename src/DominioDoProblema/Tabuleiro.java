package DominioDoProblema;

public class Tabuleiro {
	
	protected Jogador jogadorLocal;
	protected Jogador jogadorRemoto;
	protected boolean partidaEmAndamaneto;
	protected boolean jogadaEmAndamaneto;
	protected EstadoQuantik estado;
	
	public Tabuleiro(Jogador jogadorLocal, Jogador jogadorRemoto, boolean partidaEmAndamaneto,
			boolean jogadaEmAndamaneto, EstadoQuantik estado) {
		super();
		this.jogadorLocal = jogadorLocal;
		this.jogadorRemoto = jogadorRemoto;
		this.partidaEmAndamaneto = partidaEmAndamaneto;
		this.jogadaEmAndamaneto = jogadaEmAndamaneto;
		this.estado = estado;
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
	
	
	public void efetuarColocaoPeca(int linha, int coluna, Peca peca ) {
		
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
		
	}
	public void assumirEstado(EstadoQuantik estado) {
		
	}
	public void receberJogada(Lance lance) {
		
	}
	public boolean encerrarPartida() {
		return jogadaEmAndamaneto;
		
	}
	public void iniciarNovaPartida(int ordem, String adversario) {
		
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
	

}
