package InterfaceGrafica;

import DominioDoProblema.ElementoDominioProblema;
import DominioDoProblema.Lance;
import DominioDoProblema.Tabuleiro;
import Rede.AtorNetgames;
import br.ufsc.inf.leobr.cliente.Jogada;

public class AtorJogador {
	
	protected AtorNetgames ngServer;
	protected ElementoDominioProblema domProblema;
	protected Tabuleiro tabuleiro;
	protected InterfaceJogo gui;

	public AtorJogador() {
		ngServer = new AtorNetgames();
		domProblema = new ElementoDominioProblema();
	}

	public String conectar(String string, String string2) {
		String mensagem = "Condicao para conexao nao atendida (defina qual)";
		boolean permitido = domProblema.permitidoConectar();
		if (permitido) {
			mensagem = ngServer.conectar(string, string2);
			if (mensagem.equals("Sucesso: conectado a Netgames Server")) {
				domProblema.definirConectado(true);
			}
		}
		return mensagem;
	}
	
	public String desconectar() {
		String mensagem = "Condicao para desconexao nao atendida (defina qual)";
		boolean permitido = domProblema.permitidoDesconectar();
		if (permitido) {
			mensagem = ngServer.desconectar();
			if (mensagem.equals("Sucesso: desconectado de Netgames Server")) {
				domProblema.definirConectado(false);
			}
		}
		return mensagem;
	}
	
	public String iniciarPartida() {
		String mensagem = "Condicao para iniciar partida nao atendida (defina qual)";
		boolean permitido = domProblema.permitidoIniciarPartida();
		if (permitido) {
			mensagem = ngServer.iniciarPartida();
		}
		return mensagem;
	}

	public void receberJogada(Lance lance) {
		tabuleiro.receberJogada(lance);
		System.out.println("ronaldo");
		System.out.println(lance.getLinha());
		System.out.println("ronaldo");

	}

	
}
