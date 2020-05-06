package game;

import java.util.Scanner;

public class ShootingGame extends TeenageGame {

	protected String ParentEmail;
	protected String ParentPassword;

	public ShootingGame(GameKind kind) {	//�����ڸ� �����.
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
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') //y, n�� �Է��� �̸��� �Է� ������ ������ �� �ִ�
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

	public void printInfo() { //������ ��� ����ϴ� �޼ҵ带 �����.
		String gkind = getKindString();
		System.out.print("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
		System.out.println(" parent's email:" +email+ " parent's password:" +password );
	}
}

