package DominioDoProblema;

public class Peca {
	protected String naipe;
	protected boolean pecaAzul;
	
	public Peca(String naipe, boolean pecaAzul) {
		super();
		this.naipe = naipe;
		this.pecaAzul = pecaAzul;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public boolean isPecaAzul() {
		return pecaAzul;
	}

	public void setPecaAzul(boolean pecaAzul) {
		this.pecaAzul = pecaAzul;
	}
	
}
