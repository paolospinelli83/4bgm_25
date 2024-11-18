package items;

public class Arma extends Item{

	private int dannoLeggero;
	private int dannoPesante;
		
	
	public Arma(String nome, int valore, int rarita, int durata, String descrizione, int dannoLeggero,
			int dannoPesante) {
		super(nome, valore, rarita, durata, descrizione);
	
		this.dannoLeggero = dannoLeggero;
		this.dannoPesante = dannoPesante;
	}

	public int getDannoLeggero() {
		return dannoLeggero;
	}

	public void setDannoLeggero(int dannoLeggero) {
		this.dannoLeggero = dannoLeggero;
	}

	public int getDannoPesante() {
		return dannoPesante;
	}

	public void setDannoPesante(int dannoPesante) {
		this.dannoPesante = dannoPesante;
	}


	
	public int provocaDanno(int tipoAttacco) {
		if(tipoAttacco==0) {
			cambiaDurata(dannoLeggero);
			return dannoLeggero;	
		}else {
			cambiaDurata(dannoPesante);
			return dannoPesante;
		}
		
	}
	
}
