package items;

public class Armatura extends Item {

	
	private int difesa;
	
	

	public Armatura(String nome, int valore, int rarita, int durata, String descrizione, int difesa) {
		super(nome, valore, rarita, durata, descrizione);
		this.difesa = difesa;
	}



	public int difendi(int attacco) {
		int dannoRicevuto=  attacco-difesa;
		return dannoRicevuto;
	}



	public int getDifesa() {
		return difesa;
	}



	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}
}
