package game;

import java.util.Scanner;

public class HorrorGame extends TeenageGame {

	public HorrorGame(GameKind kind) {	//�����ڸ� �����.
		super(kind);
	}
	public void getUserInput(Scanner input) {		
		setGameID(input);
		setGameName(input);
		setGameEmailwithYN(input);
		setGamePassword(input);
	}
}
