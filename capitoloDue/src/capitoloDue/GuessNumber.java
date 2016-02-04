package capitoloDue;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		int randomNumber = randomGenerator.nextInt(11);
		int numberInserted;
		int counterTried = 0;
		int counterResult = 0;
		int MAX_TRIED = 3;
		String[] showResult = new String[MAX_TRIED];
		
		do{
		System.out.println("Inserisci un valore:");
			
			while (!sc.hasNextInt()) {
				System.out.println("Questo non è un numero, riprova!");
				sc.next();
				}
		numberInserted = sc.nextInt();
			
			if (numberInserted >= 0 )
			{	if(randomNumber == numberInserted)
				{
					counterResult ++;
				}
				counterTried++;
				showResult[counterTried-1] = String.valueOf(numberInserted);
			}
			
		}while(counterTried!= MAX_TRIED);
		
		System.out.println("Il gioco è stato concluso con "+counterResult+" vittorie e "+(counterTried-counterResult)+" sconfitte");
		
		if(counterResult/counterTried < 0.5){
			System.out.println("Mi dispiace dovrai riprovare!"+"Il numero casuale è "+ randomNumber +"\nVisualizza i tuoi errori:");
			//Stampa l'array con risultati
			for(int i = 0; i < showResult.length; i++){
				System.out.println("Tentativo:"+(i+1)+", avete inserito il valore "+ showResult[i]);
			}
				
		}else{
			System.out.println("Sei un esperto di questo gioco! Complimenti!");
		}
		
		}

}
