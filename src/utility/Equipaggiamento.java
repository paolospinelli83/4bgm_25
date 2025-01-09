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

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Armatura getArmatura() {
		return armatura;
	}

	public void setArmatura(Armatura armatura) {
		this.armatura = armatura;
	}

	public Pozione getPozione() {
		return pozione;
	}

	public void setPozione(Pozione pozione) {
		this.pozione = pozione;
	}
	    
	
	  
}



