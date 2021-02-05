package it.micra.fattoria.model;

public class Cane extends Animale {
	
	public String razza;
	
	//constructor
	public Cane(String nome, int zampe, String verso, String razza) {
		super(nome, zampe, verso);
		this.razza = razza;
	}

	//getters
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getZampe() {
		return zampe;
	}

	@Override
	public String getVerso() {
		return nome;
		
	}
	
	public String getRazza() {
		return razza;
	}

	//setters
	@Override
	public void setNome(String nome) {
		super.nome = nome;
	}

	@Override
	public void setZampe(int zampe) {
		super.zampe = zampe;
	}

	@Override
	public void setVerso(String verso) {
		this.verso = verso;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	@Override
	public String toString() {
		return "Cane [razza=" + razza + ", nome=" + nome + ", zampe=" + zampe + ", verso=" + verso + "]";
	}
	
}
