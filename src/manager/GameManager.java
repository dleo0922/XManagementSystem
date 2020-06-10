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
	private static final long serialVersionUID = -5063511788303843413L; //����ȭ �� �����Ͽ� ������ȭ�� �������� üũ
	ArrayList<GameInput> games = new ArrayList<GameInput>(); //ArrayList�� games �迭 ����
	transient Scanner input;	
	GameManager(Scanner input){
		this.input = input;
	}

	public void addGame() { //Game ID, name, E address, password�� �Է¹޴´�.		
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
			catch(InputMismatchException e) { //try�� catch�� ����� exception �ڵ�
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}

	public void deletGame() { //Game Id�� �Է¹޴´�.		
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
			}			//i�� �ε����� ã���� ��ġ�ϴ� ���� �ִٸ� �ε��� ������ i�� �ִ´�.
		}
		return index;
	}

	public int removefromGame(int index, int gameId) {
		if (index>=0) { //�ε����� 0���� ũ�� ��ġ�ϴ� �� �ִٴ� ���̹Ƿ� �ε��� ��ȣ�� game ������ �����ȴ�.
			games.remove(index);
			System.out.println("the game"+ gameId +" is deleted");
			return 1;
		}
		else {
			System.out.println("the game has not been registered");
			return -1;			
		}	
	}

	public void editGame() { //Game Id�� �Է¹޴´�.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		for (int i = 0; i<games.size(); i++) {
			GameInput game = games.get(i);
			if(game.getId() == gameId) {
				int num = -1;	
				while(num != 5 ) { //num�� 5�� �ƴ� ���� �ݺ��ȴ�.
					showEditMenu();
					num = input.nextInt(); //���� num�� �Է¹޴´�.
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

	public void viewGames() { //Game Id�� �Է¹޴´�.
		System.out.println("# of registered games:" + games.size());
		for (int i = 0; i<games.size(); i++) {
			games.get(i).printInfo(); //�ش� Id�� ��� ������ ����Ѵ�.
		}
	}

	public int size() {
		return games.size();
	}

	public GameInput get(int index) {
		return (Game) games.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Steam Game Info Edit Menu **"); //�޴��� �Ұ��Ѵ�.		
		System.out.println("1. Edit Id"); //Id�� �����Ѵ�.
		System.out.println("2. Edit Name"); //�̸��� �����Ѵ�.
		System.out.println("3. Edit Email"); //�̸����� �����Ѵ�.
		System.out.println("4. Edit password"); //�޴����� �����Ѵ�.
		System.out.println("5. Exit"); //���α׷��� ����.
		System.out.println("Select one number between 1 - 5:"); //��ȣ 5�� �� �ϳ��� ���� �Ѵ�.
	}

	public void setScanner(Scanner input) { //Scanner �޼ҵ� �߰�
		this.input = input;
	}

}
