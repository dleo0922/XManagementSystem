import java.util.ArrayList;
import java.util.Scanner;

import game.Game;
import game.GameKind;
import game.HorrorGame;
import game.ShootingGame;

public class GameManager {
	ArrayList<Game> games = new ArrayList<Game>(); //ArrayList로 games 배열 선언
	Scanner input;	
	GameManager(Scanner input){
		this.input = input;
	}

	public void addGame() { //Game ID, name, E address, password를 입력받는다.		
		int kind = 0;
		Game game;
		while (kind != 1 && kind !=2) {
			System.out.println("1 for Role-Playing game");
			System.out.println("2 for Horror game");
			System.out.println("3 for Shooting game");
			System.out.print("Select num 1, 2 or 3 for Game Kind:");
			kind = input.nextInt();	
			if (kind == 1) {
				game = new Game(GameKind.RolePlaying);			
				game.getUserInput(input);
				games.add(game);
				break;
			}
			else if (kind == 2) {
				game = new HorrorGame(GameKind.Horror);
				game.getUserInput(input);
				games.add(game);
				break;
			}
			else if (kind == 3) {
				game = new ShootingGame(GameKind.Shooting);
				game.getUserInput(input);
				games.add(game);
				break;
			}
			else {
				System.out.print("Select num for Game Kind between 1 and 2:");
			}
		}


	}

	public void deletGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		int index = -1;
		for (int i = 0; i<games.size(); i++) {
			if(games.get(i).getId() == gameId) {
				index = i;
				break;
			}			//i로 인덱스를 찾으며 일치하는 것이 있다면 인덱스 변수에 i를 넣는다.
		}

		if (index>=0) { //인덱스가 0보다 크면 일치하는 게 있다는 말이므로 인덱스 번호의 game 정보가 삭제된다.
			games.remove(index);
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
			if(game.getId() == gameId) {
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
						int id = input.nextInt();
						game.setId(id);
					}
					else if (num == 2) {
						System.out.print("Game name:");
						String name = input.next();
						game.setName(name);
					}			
					else if (num == 3) {
						System.out.print("Email address:");
						String email = input.next();
						game.setEmail(email);
					}
					else if (num == 4) {
						System.out.print("password:");
						String password = input.next();
						game.setPassword(password);
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
		//System.out.print("Game ID:");
		//int gameId = input.nextInt();
		System.out.println("# of registered games:" + games.size());
		for (int i = 0; i<games.size(); i++) {
			games.get(i).printInfo(); //해당 Id의 모든 정보를 출력한다.
		}
	}

}
