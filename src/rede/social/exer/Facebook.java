package rede.social.exer;

public class Facebook extends RedeSocial{
      //Atributos 
	 private int numeroCutucadas;
      
	 //Construtor
	 public Facebook(int numeroCurtidas, int numeroCompartilhamentos, String nomeUsuario, int numeroCutucadas) {
		super(numeroCurtidas, numeroCompartilhamentos, nomeUsuario);
		this.numeroCutucadas = numeroCutucadas;
	}
	  //Gets e Sets

	public int getNumeroCutucadas() {
		return numeroCutucadas;
	}

	public void setNumeroCutucadas(int numeroCutucadas) {
		this.numeroCutucadas = numeroCutucadas;
	}
	 
	//Métodos
	@Override
	public String darLike() {
		String like = "Curtido no Facebook";
		return like;
	}
	@Override
	public String compartilhar () {
		String share = "Compartilhado no Facebook";
		return share;
	}
		 

	public String cutucar () {
		
		String cutucada = "Cutucado...";
		return cutucada;
	}
	
	
	public String toString() {
		
		String modelo = "";
		
		modelo += "Número de Curtidas -> " + super.getNumeroCurtidas() + "\n";
		modelo += "Número de Compartilhamentos -> "  + super.getNumeroCompartilhamentos() + "\n";
		modelo += "Cutucadas -> " + this.getNumeroCutucadas() + "\n";
		
		return modelo;
	}
}
	 
	
	 


