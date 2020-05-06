package game;

import java.util.Scanner;

public class ShootingGame extends TeenageGame {

	protected String ParentEmail;
	protected String ParentPassword;

	public ShootingGame(GameKind kind) {	//생성자를 만든다.
		super(kind);
	}

	public void getUserInput(Scanner input) {		
		setGameID(input);
		setGameName(input);
		setGameEmailwithYN(input);
		setGameEmailwithYN(input);
		setGamePassword(input);
	}

	public void setGameEmailwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') //y, n를 입력해 이메일 입력 유무를 선택할 수 있다
		{
			System.out.print("Do you have a parent's email address? (Y/N)"); 
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setGameEmail(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
	}

	public void printInfo() { //정보를 모두 출력하는 메소드를 만든다.
		String gkind = getKindString();
		System.out.print("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
		System.out.println(" parent's email:" +email+ " parent's password:" +password );
	}
}

