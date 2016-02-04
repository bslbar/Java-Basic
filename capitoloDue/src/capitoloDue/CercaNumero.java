package capitoloDue;
import java.util.Random;

public class CercaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generatorRandom = new Random();
		int count = 0;
		int target = 5;
		int randomNumber;
		
		do{
			randomNumber = (int) generatorRandom.nextInt(100)+1;
			count++;
		}while(randomNumber != target);
		
		System.out.println("Il numero selezionto è stato raggiunto in "+count);
		
	}

}
