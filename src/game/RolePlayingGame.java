package game;

import java.util.Scanner;

public class RolePlayingGame extends Game{

	public RolePlayingGame(GameKind kind) {	//생성자를 만든다.
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setGameID(input);
		setGameName(input);
		setGameEmail(input);
		setGamePassword(input);
	}

	public void printInfo() { //정보를 모두 출력하는 메소드를 만든다.
		String gkind = getKindString();
		System.out.println("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}

}
