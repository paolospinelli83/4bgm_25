package items;

import giocatori.Personaggio;

public class PozioneVita extends Pozione {

	public PozioneVita(String nome, int valore, int rarita, int durata, String descrizione, int potenza) {
		super(nome, valore, rarita, durata, descrizione, potenza);
		
	}
	
	@Override
	protected void usaPozione(Personaggio player) {
		player.setVita(player.getVita()+potenza);
	}


	
}
