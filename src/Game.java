
public class Game{

	String name;
	int id;
	String email;
	String password;
	
	public Game() {	//�����ڸ� �����.
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
	
	public void printInfo() { //������ ��� ����ϴ� �޼ҵ带 �����.
		System.out.println("name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}
	
}
