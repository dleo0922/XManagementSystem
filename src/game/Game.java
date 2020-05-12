package game;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Game implements GameInput{
	protected GameKind kind = GameKind.RolePlaying;
	protected String name;
	protected int id;
	protected String email;
	protected String password;

	public Game() {	//�����ڸ� �����.

	}

	public Game(GameKind kind) {	//�����ڸ� �����.
		this.kind = kind;
	}

	public Game(String name, int id) { //�����ڸ� �����.
		this.name = name;
		this.id = id;		
	}

	public Game (String name, int id, String email, String password){ //�����ڸ� �����.
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public Game (GameKind kind, String name, int id, String email, String password){ //�����ڸ� �����.
		this.kind =kind;
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public GameKind getKind() { //setter�� getter ���
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

	public void setEmail(String email) throws EmailFormatException { //���� �߻��� EmailFormatException Ŭ������ ������ ���� ó���� �Ѵ�
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public abstract void printInfo();

	public void setGameID(Scanner input) {
		System.out.print("Game ID:");
		int id = input.nextInt();
		this.setId(id);	
	}

	public void setGameName(Scanner input) {
		System.out.print("Game name:");
		String name = input.next();
		this.setName(name);
	}

	public void setGameEmail (Scanner input) {
		String email = "";
		while (!email.contains("@")) {
			System.out.print("Email address:");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public void setGamePassword(Scanner input) {
		System.out.print("password:");
		String password = input.next();
		this.setPassword(password);
	}

	public String getKindString() {
		String gkind = "none";
		switch(this.kind) {
		case RolePlaying:
			gkind = "RPG";
			break;
		case Horror:
			gkind = "Horror";
			break;
		case Action:
			gkind = "Action";
			break;
		case Shooting:
			gkind = "Shooting";
			break;
		default:			
		}
		return gkind;
	}
}
