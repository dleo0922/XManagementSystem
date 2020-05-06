package game;

import java.util.Scanner;

public class HorrorGame extends TeenageGame {

	public HorrorGame(GameKind kind) {	//생성자를 만든다.
		super(kind);
	}
	public void getUserInput(Scanner input) {		
		setGameID(input);
		setGameName(input);
		setGameEmailwithYN(input);
		setGamePassword(input);
	}
}
