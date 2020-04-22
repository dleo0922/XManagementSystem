import java.util.ArrayList;
import java.util.Scanner;

import game.Game;
import game.GameKind;
import game.HorrorGame;
import game.ShootingGame;

public class GameManager {
	ArrayList<Game> games = new ArrayList<Game>(); //ArrayList�� games �迭 ����
	Scanner input;	
	GameManager(Scanner input){
		this.input = input;
	}

	public void addGame() { //Game ID, name, E address, password�� �Է¹޴´�.		
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

	public void deletGame() { //Game Id�� �Է¹޴´�.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		int index = -1;
		for (int i = 0; i<games.size(); i++) {
			if(games.get(i).getId() == gameId) {
				index = i;
				break;
			}			//i�� �ε����� ã���� ��ġ�ϴ� ���� �ִٸ� �ε��� ������ i�� �ִ´�.
		}

		if (index>=0) { //�ε����� 0���� ũ�� ��ġ�ϴ� �� �ִٴ� ���̹Ƿ� �ε��� ��ȣ�� game ������ �����ȴ�.
			games.remove(index);
			System.out.println("the game"+ gameId +" is deleted");
		}
		else {
			System.out.println("the game has not been registered");
			return;			
		}	
	}

	public void editGame() { //Game Id�� �Է¹޴´�.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		for (int i = 0; i<games.size(); i++) {
			Game game = games.get(i);
			if(game.getId() == gameId) {
				int num = -1;	
				while(num != 5 ) { //num�� 5�� �ƴ� ���� �ݺ��ȴ�.
					System.out.println("** Steam Game Info Edit Menu **"); //�޴��� �Ұ��Ѵ�.		
					System.out.println("1. Edit Id"); //Id�� �����Ѵ�.
					System.out.println("2. Edit Name"); //�̸��� �����Ѵ�.
					System.out.println("3. Edit Email"); //�̸����� �����Ѵ�.
					System.out.println("4. Edit password"); //�޴����� �����Ѵ�.
					System.out.println("5. Exit"); //���α׷��� ����.
					System.out.println("Select one number between 1 - 5:"); //��ȣ 5�� �� �ϳ��� ���� �Ѵ�.
					num = input.nextInt(); //���� num�� �Է¹޴´�.
					if (num == 1) { //num�� 1,2,3,4 ������ �� �� �Լ��� �����Ѵ�.
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
					else { //5�� �� ���� ������ �� while�� menu ��º��� �ٽ� ���۵ȴ�.
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}

	public void viewGames() { //Game Id�� �Է¹޴´�.
		//System.out.print("Game ID:");
		//int gameId = input.nextInt();
		System.out.println("# of registered games:" + games.size());
		for (int i = 0; i<games.size(); i++) {
			games.get(i).printInfo(); //�ش� Id�� ��� ������ ����Ѵ�.
		}
	}

}
