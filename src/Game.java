
public class Game{

	String name;
	int id;
	String email;
	String password;
	static int numGamesRegistered = 0;
	
	public Game() {	//생성자를 만든다.
		numGamesRegistered++;
	}
	
	public Game(String name, int id) { //생성자를 만든다.
		this.name = name;
		this.id = id;
		numGamesRegistered++;
	}
	
	
	public Game (String name, int id, String email, String password){ //생성자를 만든다.
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		numGamesRegistered++;
	}
	
	public void printInfo() { //정보를 모두 출력하는 메소드를 만든다.
		System.out.println("name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}
	
}
