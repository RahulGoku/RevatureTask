package eg1;

public class Player {

	private int id;
	private String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printPlayer() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}
