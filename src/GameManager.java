import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
	ArrayList<Game> games = new ArrayList<Game>();
	Scanner input;
	
	GameManager(Scanner input){
		this.input = input;
	}
	
	public void addGame() { //Game ID, name, E address, password를 입력받는다.
		Game game = new Game();
		System.out.print("Game ID:");
		game.id = input.nextInt();
		
		System.out.print("Game name:");
		game.name = input.next();
		
		System.out.print("Email address:");
		game.email = input.next();
		
		System.out.print("password:");
		game.password = input.next();	
		games.add(game);
	}
	
	public void deletGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		int index = -1;
		for (int i = 0; i<games.size(); i++) {
			if(games.get(i).id == gameId) {
				index = i;
				break;
			}			
		}
		
		if (index>=0) {
			games.remove(index);
			Game.numGamesRegistered--;
			System.out.println("the game"+ gameId +" is deleted");
		}
		else {
			System.out.println("the game has not been registered");
			return;			
		}	
	}

	public void editGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		for (int i = 0; i<games.size(); i++) {
			Game game = games.get(i);
			if(game.id == gameId) {
				int num = -1;	
				while(num != 5 ) { //num이 5이 아닌 동안 반복된다.
					System.out.println("** Steam Game Info Edit Menu **"); //메뉴를 소개한다.		
					System.out.println("1. Edit Id"); //Id를 수정한다.
					System.out.println("2. Edit Name"); //이름을 수정한다.
					System.out.println("3. Edit Email"); //이메일을 수정한다.
					System.out.println("4. Edit password"); //휴대폰을 수정한다.
					System.out.println("5. Exit"); //프로그램을 끈다.
					System.out.println("Select one number between 1 - 5:"); //번호 5개 중 하나를 고르게 한다.
					num = input.nextInt(); //숫자 num을 입력받는다.
					if (num == 1) { //num이 1,2,3,4 정수일 때 각 함수를 실행한다.
						System.out.print("Game ID:");
						game.id = input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Game name:");
						game.name = input.next();
					}			
					else if (num == 3) {
						System.out.print("Email address:");
						game.email = input.next();
					}
					else if (num == 4) {
						System.out.print("password:");
						game.password = input.next();	
					}
					else { //5나 그 외의 숫자일 때 while로 menu 출력부터 다시 시작된다.
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}
	
	public void viewGames() { //Game Id를 입력받는다.
//		System.out.print("Game ID:");
//		int gameId = input.nextInt();
		System.out.println("# of registered games:" + Game.numGamesRegistered);
		for (int i = 0; i<games.size(); i++) {
			games.get(i).printInfo(); //해당 Id의 모든 정보를 출력한다.
		}
	}

}
