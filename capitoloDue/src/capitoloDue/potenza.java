package capitoloDue;

public class potenza {

private int p;//attributo 
	
	potenza(int base)
	{//costruttore 
	     p=base; 
	}//fine costruttore 
	
	public void pow()
	{//metodo 
	    System.out.println(p*p); 
	}//fine metodo pow 
	
	public void cambiobase(int nuovo)
	{//metodo 
	    p=nuovo; 
	}//fine metodo cambiobase 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		potenza x = new potenza(2);
		potenza y = new potenza(3);
		x.pow(); 
		y.pow(); 
		x.cambiobase(7); 
		x.pow(); 

	}

}
