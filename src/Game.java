
public class Game{

	String name;
	int id;
	String email;
	String password;
	static int numGamesRegistered = 0;
	
	public Game() {	//�����ڸ� �����.
		numGamesRegistered++;
	}
	
	public Game(String name, int id) { //�����ڸ� �����.
		this.name = name;
		this.id = id;
		numGamesRegistered++;
	}
	
	
	public Game (String name, int id, String email, String password){ //�����ڸ� �����.
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		numGamesRegistered++;
	}
	
	public void printInfo() { //������ ��� ����ϴ� �޼ҵ带 �����.
		System.out.println("name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}
	
}
