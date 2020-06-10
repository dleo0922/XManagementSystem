package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import game.Game;
import game.GameInput;
import game.GameKind;
import game.HorrorGame;
import game.RolePlayingGame;
import game.ShootingGame;

public class GameManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5063511788303843413L; //직렬화 때 저장하여 역직렬화시 동일한지 체크
	ArrayList<GameInput> games = new ArrayList<GameInput>(); //ArrayList로 games 배열 선언
	transient Scanner input;	
	GameManager(Scanner input){
		this.input = input;
	}

	public void addGame() { //Game ID, name, E address, password를 입력받는다.		
		int kind = 0;
		GameInput gameInput;
		while (kind < 1 || kind >3) {
			try {
				System.out.println("1 for Role-Playing game");
				System.out.println("2 for Horror game");
				System.out.println("3 for Shooting game");
				System.out.print("Select num 1, 2 or 3 for Game Kind:");
				kind = input.nextInt();	
				if (kind == 1) {
					gameInput = new RolePlayingGame(GameKind.RolePlaying);			
					gameInput.getUserInput(input);
					games.add(gameInput);
					break;
				}
				else if (kind == 2) {
					gameInput = new HorrorGame(GameKind.Horror);
					gameInput.getUserInput(input);
					games.add(gameInput);
					break;
				}
				else if (kind == 3) {
					gameInput = new ShootingGame(GameKind.Shooting);
					gameInput.getUserInput(input);
					games.add(gameInput);
					break;
				}
				else {
					System.out.print("Select num for Game Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) { //try와 catch를 사용한 exception 코드
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}

	public void deletGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		int index = findIndex(gameId);
		removefromGame(index, gameId);
	}

	public int findIndex(int gameId) {
		int index = -1;
		for (int i = 0; i<games.size(); i++) {
			if(games.get(i).getId() == gameId) {
				index = i;
				break;
			}			//i로 인덱스를 찾으며 일치하는 것이 있다면 인덱스 변수에 i를 넣는다.
		}
		return index;
	}

	public int removefromGame(int index, int gameId) {
		if (index>=0) { //인덱스가 0보다 크면 일치하는 게 있다는 말이므로 인덱스 번호의 game 정보가 삭제된다.
			games.remove(index);
			System.out.println("the game"+ gameId +" is deleted");
			return 1;
		}
		else {
			System.out.println("the game has not been registered");
			return -1;			
		}	
	}

	public void editGame() { //Game Id를 입력받는다.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		for (int i = 0; i<games.size(); i++) {
			GameInput game = games.get(i);
			if(game.getId() == gameId) {
				int num = -1;	
				while(num != 5 ) { //num이 5이 아닌 동안 반복된다.
					showEditMenu();
					num = input.nextInt(); //숫자 num을 입력받는다.
					switch(num) {
					case 1:
						game.setGameID(input);
						break;
					case 2:
						game.setGameName(input);
						break;
					case 3:
						game.setGameEmail(input);
						break;
					case 4:
						game.setGamePassword(input);
						break;
					default:
						continue;
					}
				}//while
				break;
			}//if
		}//for
	}

	public void viewGames() { //Game Id를 입력받는다.
		System.out.println("# of registered games:" + games.size());
		for (int i = 0; i<games.size(); i++) {
			games.get(i).printInfo(); //해당 Id의 모든 정보를 출력한다.
		}
	}

	public int size() {
		return games.size();
	}

	public GameInput get(int index) {
		return (Game) games.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Steam Game Info Edit Menu **"); //메뉴를 소개한다.		
		System.out.println("1. Edit Id"); //Id를 수정한다.
		System.out.println("2. Edit Name"); //이름을 수정한다.
		System.out.println("3. Edit Email"); //이메일을 수정한다.
		System.out.println("4. Edit password"); //휴대폰을 수정한다.
		System.out.println("5. Exit"); //프로그램을 끈다.
		System.out.println("Select one number between 1 - 5:"); //번호 5개 중 하나를 고르게 한다.
	}

	public void setScanner(Scanner input) { //Scanner 메소드 추가
		this.input = input;
	}

}
