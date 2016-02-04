package capitoloDue;

import java.io.*;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// creo un oggetto per leggere dati dalla finestra di console
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		// Leggo l'intero dato dall'utente.
		// Prima di tutto scrivo un messaggio che chiede all'utente 
		// di inserire un numero intero:
		System.out.println("Dammi un numero di tipo intero");
		
		//ora leggo l'intero dato dall'utente sotto forma di stringa
		String inputA = console.readLine();
		// infine converto la stringa in intero:
		int interoDato = Integer.parseInt(inputA);
		// a questo punto nella variabile interoDato ho a disposizione
		// il numero intero dato dall'utente. Se l'utente sbaglia e 
		// scrive una riga che NON contiene un intero, il programma 
		// si interrompe brutalmente.
		
		// Ripeto l'operazione di lettura per un dato di tipo double:
		// leggo ora un dato di tipo double:
		System.out.println("dammi un numero di tipo double:");
		// leggo il numero dato dall'utente sotto forma di stringa:
		String inputB = console.readLine();
		// converto la stringa in double:
		Double d = new Double(inputB);
		double doubleDato = d.doubleValue();
		
		// Ripeto la procedura per un dato di tipo String:
		// leggo un dato di tipo String:
		System.out.println("Dammi una stringa: ");
		// leggo la stringa:
		String inputC = console.readLine();
		
		// stampo i dati letti:
		System.out.println("Il numero intero dato e': " + interoDato +
		"\nIl numero double dato e': " + doubleDato +
		"\nLa stringa data e' " + inputC);
	}

}
