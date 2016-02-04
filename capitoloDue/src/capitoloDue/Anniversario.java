package capitoloDue;
import java.util.Random;

public class Anniversario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomGenerator = 100;
		int value;
		
		Random random = new Random();
		value = random.nextInt(randomGenerator);
		System.out.println(value);
		
		if((value%2) == 0)
		{
			System.out.println("Andiamo al giapponese!");
		}else
		{
			System.out.println("Andiamo in pizzeria!");
		}
		
	}

}
