package avvio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import environment.Labirinto;
import environment.Stanza;

public class Avvio {

	public static void main(String[] args) throws IOException {
		Stanza stanze[] = new Stanza[20];
		
		stanze[0]= new Stanza(1, null, null, null, null, new ArrayList<Stanza>());
				
		Labirinto lab = new Labirinto(stanze[0], null);
		
		for(int i=1; i<20; i++) {
			stanze[i]= new Stanza(i+1, null, null, null, null, new ArrayList<Stanza>());					
		}
		
		for(int i=0; i<19; i++) {
			Random rand = new Random();
			stanze[i].getPorte().add(stanze[Math.abs(rand.nextInt()%20)]);
			stanze[i].getPorte().add(stanze[Math.abs(rand.nextInt()%20)]);
			stanze[i].getPorte().add(stanze[Math.abs(rand.nextInt()%20)]);					
		}		
		lab.setFine(stanze[19]);
		
		Stanza stanzaCurr=lab.getInizio();
		while(stanzaCurr.getNumeroStanza()!=lab.getFine().getNumeroStanza()) {
			System.out.println(stanzaCurr.toString());
			
			System.out.println("INSERIRE IL NUMERO DELLA PORTA DA APRIRE (1, 2, 3)");
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader bReader = new BufferedReader(reader);
			int numStanza=Integer.valueOf(bReader.readLine())-1;
			stanzaCurr=stanzaCurr.getPorte().get(numStanza);
		}
		System.out.println(stanzaCurr.toString());
	}

}
