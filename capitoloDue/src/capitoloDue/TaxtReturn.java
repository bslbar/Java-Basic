package capitoloDue;

import java.util.logging.Logger;

public class TaxtReturn {
	 private static final Logger LOGGER = Logger.getLogger(TaxtReturn.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int SINGLE = 1;
		final int MARRIED = 2;
		
		final double RATE1 = 0.1;
		final double RATE2 = 0.25;
		
		int status = 2;
		int income = 50000;
		double totalTax;
		
		if(status == SINGLE){
			if(income <= 6400){
				totalTax = income * RATE1;
			}
			else{
				totalTax = income * RATE2;
			}
		}else{
			if(income<=32000){
				totalTax = income * RATE1;
			}else{
				totalTax = income * RATE2;
				Logger.getGlobal().info("Siamo qui");
			}
		}
		System.out.println(totalTax);
		
	}

}
