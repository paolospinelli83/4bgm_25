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

	public int getNumeroStanza() {
		return numeroStanza;
	}

	public void setNumeroStanza(int numeroStanza) {
		this.numeroStanza = numeroStanza;
	}

	public Mostro getMostro() {
		return mostro;
	}

	public void setMostro(Mostro mostro) {
		this.mostro = mostro;
	}

	public Giocatore getGiocatore() {
		return giocatore;
	}

	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}

	public Item getTesoro() {
		return tesoro;
	}

	public void setTesoro(Item tesoro) {
		this.tesoro = tesoro;
	}

	public Pozione getTrappola() {
		return trappola;
	}

	public void setTrappola(Pozione trappola) {
		this.trappola = trappola;
	}

	public ArrayList<Stanza> getPorte() {
		return porte;
	}

	public void setPorte(ArrayList<Stanza> porte) {
		this.porte = porte;
	}
	
	
	
	
	
	
	
	
	
}
