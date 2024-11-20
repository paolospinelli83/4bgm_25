package items;

import giocatori.Personaggio;

public abstract class Pozione extends Item{
	
	protected int potenza;
	
	public Pozione(String nome, int valore, int rarita, int durata, String descrizione, int potenza) {
		super(nome, valore, rarita, durata, descrizione);

		this.potenza=potenza;
	}

	
	protected abstract void usaPozione(Personaggio player);

}
