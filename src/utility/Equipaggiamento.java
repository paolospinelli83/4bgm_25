package utility;

import items.Arma;
import items.Armatura;
import items.Pozione;

public class Equipaggiamento {
	
	Arma arma;
	Armatura armatura;
	Pozione pozione;
	
	 public void cambiaArma(Arma newArma) {
	        this.arma = newArma;
	    }

	    public void cambiaArmatura(Armatura newArmatura) {
	        this.armatura = newArmatura;
	    }

	    public void cambiaPozione(Pozione newPozione) {
	        this.pozione = newPozione;
	    }
	}

