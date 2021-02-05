package it.micra.fattoria.model;

public class Gatto extends Animale {
	
	public String owner;

	public Gatto(String nome, int zampe, String verso, String owner) {
		super(nome, zampe, verso);
		this.owner = owner;
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
	
	public String getOwner() {
		return owner;
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

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Gatto [owner=" + owner + ", nome=" + nome + ", zampe=" + zampe + ", verso=" + verso + "]";
	}
	
	

}
