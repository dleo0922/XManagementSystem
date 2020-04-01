import java.util.Scanner;

public class GameManager {
	Game game;
	Scanner input;
	
	GameManager(Scanner input){
		this.input = input;
	}
	
	public void addGame() { //Game ID, name, E address, Phone number을 입력받는다.
		game = new Game();
		System.out.print("Game ID:");
		game.id = input.nextInt();
		
		System.out.print("Game name:");
		game.name = input.next();
		
		System.out.print("Email address:");
		game.email = input.next();
		
		System.out.print("Phone number:");
		game.phone = input.next();	
	}
	
	public void deletGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		if(game == null) {
			System.out.println("the game has not been registered");
			return;
		}
		if(game.id == gameId) {
			game = null;
			System.out.println("the game is deleted");
		}
		
	}

	public void editGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		if(game.id == gameId) {
			System.out.println("the game to be edited is " + gameId);
		}
	}
	
	public void viewGame() { //Game Id를 입력받는다.
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		if(game.id == gameId) {
			game.printInfo();
		}
	}

}
