package environment;

import java.util.ArrayList;

import giocatori.Giocatore;
import giocatori.Mostro;
import items.Item;
import items.Pozione;

public class Stanza {

	private int numeroStanza;
	private Mostro mostro;
	private Giocatore giocatore;
	private Item tesoro;
	private Pozione trappola;
	private ArrayList<Stanza> porte;
	
	public Stanza(int numeroStanza, Mostro mostro, Giocatore giocatore, Item tesoro, Pozione trappola, ArrayList<Stanza> porte) {
		super();
		this.numeroStanza = numeroStanza;
		this.mostro = mostro;
		this.giocatore = giocatore;
		this.tesoro = tesoro;
		this.trappola = trappola;
		this.porte = porte;
	}
	
	public void attivaTrappola() {
		
		this.trappola.usaPozione(giocatore);
		
	}

	@Override
	public String toString() {
		String out= "SIAMO NELLA STANZA: " + this.numeroStanza;
				
		return out;
	}
	
	
	
	
	
	
	
}
