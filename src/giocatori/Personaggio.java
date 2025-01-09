package giocatori;

import items.Arma;
import utility.Equipaggiamento;

public class Personaggio {
	protected String nome;
	protected int livello;
	protected int puntiEsperienza;
	protected Equipaggiamento equip;
	protected int vita;
	protected int velocita;
	protected String statura;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getLivello() {
		return livello;
	}
	public void setLivello(int livello) {
		this.livello = livello;
	}
	public Equipaggiamento getEquip() {
		return equip;
	}
	public void setEquip(Equipaggiamento equip) {
		this.equip = equip;
	}
	public int getVita() {
		return vita;
	}
	public void setVita(int vita) {
		this.vita = vita;
	}
	public int getVelocita() {
		return velocita;
	}
	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}
	public String getStatura() {
		return statura;
	}
	public void setStatura(String statura) {
		this.statura = statura;
	}
	public Personaggio(String nome, int livello, Equipaggiamento equip, int vita, int velocita, String statura) {
		super();
		this.nome = nome;
		this.livello = livello;
		this.equip = equip;
		this.vita = vita;
		this.velocita = velocita;
		this.statura = statura;
	}
	
	
	public int difendi(int danno) {
		int dannoRicevuto = this.getEquip().getArmatura().difendi(danno);
		this.setVita(vita - dannoRicevuto);
		return dannoRicevuto;
		
	}
	
	public int attaccoLeggero(Personaggio avversario) {
		Arma miaArma;
		miaArma = this.equip.getArma();
		int danno;
		danno=miaArma.getDannoLeggero();
		int dannoProvocato = avversario.difendi(danno);
		
		return dannoProvocato;		
	}
	
	public int attaccoPesante(Personaggio avversario) {
		Arma miaArma;
		miaArma = this.equip.getArma();
		int danno;
		danno=miaArma.getDannoPesante();
		int dannoProvocato = avversario.difendi(danno);
		
		return dannoProvocato;		
	}
}
