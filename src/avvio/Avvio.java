package avvio;

import java.util.ArrayList;

import environment.Labirinto;
import environment.Stanza;

public class Avvio {

	public static void main(String[] args) {
		Stanza s1= new Stanza(1, null, null, null, null, new ArrayList<Stanza>());
		
		Stanza s2= new Stanza(2, null, null, null, null, new ArrayList<Stanza>());
		
		Stanza s3= new Stanza(3, null, null, null, null, new ArrayList<Stanza>());
		
		Stanza s4= new Stanza(4, null, null, null, null, new ArrayList<Stanza>());
		
		Labirinto lab = new Labirinto(s1, null);
		 
		ArrayList<Stanza> precedentiS2=new ArrayList<Stanza>();
		precedentiS2.add(s1);
		lab.addStanza(s2, precedentiS2);
		
		ArrayList<Stanza> precedentiS3=new ArrayList<Stanza>();
		precedentiS3.add(s2);
		//precedentiS3.add(s3);
		lab.addStanza(s3, precedentiS3);
		
		ArrayList<Stanza> precedentiS4=new ArrayList<Stanza>();
		precedentiS3.add(s1);
		precedentiS3.add(s3);
		lab.addStanza(s4, precedentiS4);
		
		lab.setFine(s4);
		
		Stanza stanzaCurr=lab.getInizio();
		while(stanzaCurr.getNumeroStanza()!=lab.getFine().getNumeroStanza()) {
			System.out.println(stanzaCurr.toString());
			stanzaCurr=stanzaCurr.getPorte().get(0);
		}
	}

}
