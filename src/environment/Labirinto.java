package environment;

import java.util.ArrayList;

public class Labirinto {
	
	private Stanza inizio;
	private Stanza fine;
	
	public Labirinto(Stanza inizio, Stanza fine) {
		super();
		this.inizio = inizio;
		this.fine = fine;
	}

	public Stanza getInizio() {
		return inizio;
	}

	public void setInizio(Stanza inizio) {
		this.inizio = inizio;
	}

	public Stanza getFine() {
		return fine;
	}

	public void setFine(Stanza fine) {
		this.fine = fine;
	}
	
	public void addStanza(Stanza nuovaStanza, ArrayList<Stanza> precedenti) {
		for(int i=0; i<precedenti.size(); i++) {
			precedenti.get(i).getPorte().add(nuovaStanza);
		}
	}

}
