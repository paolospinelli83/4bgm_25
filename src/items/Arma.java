package items;

public class Arma {

	private int dannoLeggero;
	private int dannoPesante;
	private int durata;
	
	private void cambiaDurata(int danno) {
		durata= durata-danno;
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
