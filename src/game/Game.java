package game;

import java.util.Scanner;

public class Game{
	protected GameKind kind = GameKind.RolePlaying;
	protected String name;
	protected int id;
	protected String email;
	protected String password;
	
	public Game() {	//생성자를 만든다.
		
	}
	
	public Game(GameKind kind) {	//생성자를 만든다.
		this.kind = kind;
	}
	
	public Game(String name, int id) { //생성자를 만든다.
		this.name = name;
		this.id = id;		
	}
	
	
	public Game (String name, int id, String email, String password){ //생성자를 만든다.
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public Game (GameKind kind, String name, int id, String email, String password){ //생성자를 만든다.
		this.kind =kind;
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public GameKind getKind() { //setter과 getter 사용
		return kind;
	}

	public void setKind(GameKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void printInfo() { //정보를 모두 출력하는 메소드를 만든다.
		String gkind = "none";
		switch(this.kind) {
		case RolePlaying:
			gkind = "RPG";
			break;
		case Horror:
			gkind = "Horror";
			break;
		case Action:
			gkind = "Middle";
			break;
		case Shooting:
			gkind = "Elementary";
			break;
		default:			
		}
		System.out.println("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Game ID:");
		int id = input.nextInt();	
		this.setId(id);
		
		System.out.print("Game name:");
		String name = input.next();	
		this.setName(name);
		
		System.out.print("Email address:");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("password:");
		String password = input.next();	
		this.setPassword(password);
	}
}
