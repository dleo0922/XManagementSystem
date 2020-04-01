
public class Game{

	String name;
	int id;
	String email;
	String phone;
	
	public Game() {	
	}
	
	public Game(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
	public Game (String name, int id, String email, String phone){
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("name: " + name + " id: " +id+ " email: " +email+ " phone :" +phone );
	}
	
}
