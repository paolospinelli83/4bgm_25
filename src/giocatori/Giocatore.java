package giocatori;

import items.Armatura;
import items.Pozione;
import items.Arma;
import items.Item;
import utility.Equipaggiamento;

public class Giocatore extends Personaggio {


	String coloreCapelli;
	int puntiEsperienza;
	public Giocatore(String nome, int livello, Equipaggiamento equip, int vita, int velocita, String statura) {
		super(nome, livello, equip, vita, velocita, statura);
		
	}
	
	public void raccogliOggetto(Item obj){
		
		if(obj instanceof Arma) {
			Arma arma = (Arma) obj;
			equip.cambiaArma(arma);
		} else if (obj instanceof Armatura) {
			Armatura armatura = (Armatura) obj;
            equip.cambiaArmatura(armatura);
        } else if (obj instanceof Pozione) {
            Pozione pozione = (Pozione) obj;
            equip.cambiaPozione(pozione);
        }	 
	}
	int cambiaLivello(int puntiEsperienza) {
		
		this.puntiEsperienza= this.puntiEsperienza + puntiEsperienza;
		
		if (this.puntiEsperienza>=5) {
			this.livello=this.livello+1;
			this.puntiEsperienza=this.puntiEsperienza-5;
		}
		
		return this.livello;
		
	}
	
}
