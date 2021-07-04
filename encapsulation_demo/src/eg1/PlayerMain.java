package eg1;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1=new Player();
//		p1.id=100;
//		p1.name="Sachin R Tendulkar";
		p1.setId(100);
		p1.setName("Sachin R Tendulkar");
		
		System.out.println("Printing p1");
		p1.printPlayer();
		
		
		
		Player p2=new Player(900, "Sourav Ganguly");
		System.out.println("\nPrinting p2");
		p2.printPlayer();

	}

}
