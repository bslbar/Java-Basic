package capitoloDue;

public class ClicliAnnidati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		
		for(int i=1; i<=5;i++){
			for(int j = 0; j<i; j++){
				n=n+j;
			}
		}
		System.out.println(n);
	}

}
