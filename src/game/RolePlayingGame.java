package game;

import java.util.Scanner;

public class RolePlayingGame extends Game{

	public RolePlayingGame(GameKind kind) {	//�����ڸ� �����.
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setGameID(input);
		setGameName(input);
		setGameEmail(input);
		setGamePassword(input);
	}

	public void printInfo() { //������ ��� ����ϴ� �޼ҵ带 �����.
		String gkind = getKindString();
		System.out.println("kind:"+ gkind + " name:" + name + " id:" +id+ " email:" +email+ " password:" +password );
	}

}
