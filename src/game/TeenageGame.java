package game;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class TeenageGame extends Game {

	public TeenageGame(GameKind kind) {	//생성자를 만든다.
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() { //정보를 모두 출력하는 메소드를 만든다.
		String gkind = getKindString();
		System.out.println("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}

	public void setGameEmailwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') //y, n를 입력해 이메일 입력 유무를 선택할 수 있다
		{
			System.out.print("Do you have an email address? (Y/N)"); 
			answer = input.next().charAt(0);
			try {
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
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}
}
