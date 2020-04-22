package game;

import java.util.Scanner;

public class ShootingGame extends Game {
	
	protected String ParentEmail;
	protected String ParentPassword;
	
	public ShootingGame(GameKind kind) {	//생성자를 만든다.
		super(kind);
	}

	public void getUserInput(Scanner input) {		
		System.out.print("Game ID:");
		int id = input.nextInt();	
		this.setId(id);

		System.out.print("Game name:");
		String name = input.next();	
		this.setName(name);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') //y, n를 입력해 이메일 입력 유무를 선택할 수 있다
		{
			System.out.print("Do you have an email address? (Y/N)"); 
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Email address:");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') //y, n를 입력해 이메일 입력 유무를 선택할 수 있다
		{
			System.out.print("Do you have a parent's email address? (Y/N)"); 
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("parent's email address:");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}

		System.out.print("password:");
		String password = input.next();	
		this.setPassword(password);
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
			gkind = "Shooting";
			break;
		default:			
		}
		System.out.print("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
		System.out.println(" parent's email:" +email+ " parent's password:" +password );
	}
}

