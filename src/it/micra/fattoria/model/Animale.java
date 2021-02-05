//Creare una superclasse Animal (abstract) nome, zampe, verso
//Creare delle sottoclassi di Animal dove si implementeranno i metodi
//Istanziare un oggetto per ogni sottoclasse ed aggiungerla ad una lista
//Istanziare un oggetto di una sottoclasse con input dell'utente
//Stampare in console l'elenco degli oggetti memorizzati nella Lista

package it.micra.fattoria.model;

public abstract class Animale {
	
	public String nome;
	public int zampe;
	public String verso;
	
	public Animale(String nome, int zampe, String verso) {
		this.nome = nome;
		this.zampe = zampe;
		this.verso = verso;
	}
	public abstract String getNome();
	public abstract int getZampe();
	public abstract String getVerso();
	public abstract void setNome(String nome);
	public abstract void setZampe(int zampe);
	public abstract void setVerso(String verso);
	
}
