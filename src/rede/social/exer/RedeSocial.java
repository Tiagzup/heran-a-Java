package rede.social.exer;

public abstract class RedeSocial {
    //Atributos
	private int numeroCurtidas;
	private int numeroCompartilhamentos;
	private String nomeUsario;
	
	
	public RedeSocial (int numeroCurtidas, int numeroCompartilhamentos, String nomeUsuario) {
		this.numeroCurtidas = numeroCurtidas;
		this.numeroCompartilhamentos = numeroCompartilhamentos;
		this.nomeUsario = nomeUsuario;	
	}
	//Getters and Setters

	public int getNumeroCurtidas() {
		return numeroCurtidas;
	}

	public void setNumeroCurtidas(int numeroCurtidas) {
		this.numeroCurtidas = numeroCurtidas;
	}

	public int getNumeroCompartilhamentos() {
		return numeroCompartilhamentos;
	}

	public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
		this.numeroCompartilhamentos = numeroCompartilhamentos;
	}

	public String getNomeUsario() {
		return nomeUsario;
	}

	public void setNomeUsario(String nomeUsario) {
		this.nomeUsario = nomeUsario;
	}
	//Métodos
	public String darLike() {
		String texto = "Curtiu...";
	    return texto;
	}
	public String darLike(String nomeUsuario ) {
		String texto = "Curtiu ..." + nomeUsuario;
				return texto;
	}
	public String compartilhar() {
		String share = "Compartilhado...";
		return "Compartilhado...";
	}
}

