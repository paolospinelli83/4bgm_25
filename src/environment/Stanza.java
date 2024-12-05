package environment;

import giocatori.Giocatore;
import giocatori.Mostro;
import items.Item;
import items.Pozione;

public class Stanza {

	private Mostro mostro;
	private Giocatore giocatore;
	private Item tesoro;
	private Pozione trappola;
	private Stanza porte[];
	
	public Stanza(Mostro mostro, Giocatore giocatore, Item tesoro, Pozione trappola, Stanza[] porte) {
		super();
		this.mostro = mostro;
		this.giocatore = giocatore;
		this.tesoro = tesoro;
		this.trappola = trappola;
		this.porte = porte;
	}
	
	public void attivaTrappola() {
		
		this.trappola.usaPozione(giocatore);
		
	}
	
	
	
	
	
	
	
	
	
}
