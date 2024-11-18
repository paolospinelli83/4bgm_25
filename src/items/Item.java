package items;

public class Item {
	protected String nome;
	protected int valore;
	protected int rarita;
	protected int durata;
	protected String descrizione;
	
		
	public Item(String nome, int valore, int rarita, int durata, String descrizione) {
		super();
		this.nome = nome;
		this.valore = valore;
		this.rarita = rarita;
		this.durata = durata;
		this.descrizione = descrizione;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public int getRarita() {
		return rarita;
	}

	public void setRarita(int rarita) {
		this.rarita = rarita;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	protected void cambiaDurata(int valore) {
		durata= durata-valore;
	}
	
	
}
