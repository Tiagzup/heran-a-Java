package rede.social.exer;

public class Instagram extends RedeSocial {
	
	private int numeroDeStories;
	

	public Instagram(int numeroCurtidas, int numeroCompartilhamentos, String nomeUsuario, int numeroDeStories) {
		super(numeroCurtidas, numeroCompartilhamentos, nomeUsuario);
		this.numeroDeStories = numeroDeStories;
	}


	public int getNumeroDeStories() {
		return numeroDeStories;
	}


	public void setNumeroDeStories(int numeroDeStories) {
		this.numeroDeStories = numeroDeStories;
	}
	
	@Override
	public String darLike() {
		String like = "Curtido no Instagram";
		return like;
	}
	@Override
	public String compartilhar() {
	    String compartilhado = "compartilhado no instagram";
	    return compartilhado;
	}
	
	public String Stories () {
		String Stories  = "Adicionou um stories";
		return Stories;
	}
	
	public String toString() {
		String modelo = "";
		modelo += "Número de curtidas -> " + super.getNumeroCurtidas() + "\n";
		modelo += "Número de compartilhamentos -> " + super.getNumeroCompartilhamentos() + "\n";
		modelo += "Nome do usuário -> " + super.getNomeUsario() + "\n";
		modelo += "Número de Stories  -> " + this.getNumeroDeStories() + "\n";
		
		return modelo;
	}
}
