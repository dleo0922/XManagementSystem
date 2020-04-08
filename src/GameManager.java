import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
	ArrayList<Game> games = new ArrayList<Game>();
	Scanner input;
	
	GameManager(Scanner input){
		this.input = input;
	}
	
	public void addGame() { //Game ID, name, E address, password�� �Է¹޴´�.
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
	
	public void deletGame() { //Game Id�� �Է¹޴´�.		
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

	public void editGame() { //Game Id�� �Է¹޴´�.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		for (int i = 0; i<games.size(); i++) {
			Game game = games.get(i);
			if(game.id == gameId) {
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
					else { //5�� �� ���� ������ �� while�� menu ��º��� �ٽ� ���۵ȴ�.
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}
	
	public void viewGames() { //Game Id�� �Է¹޴´�.
//		System.out.print("Game ID:");
//		int gameId = input.nextInt();
		System.out.println("# of registered games:" + Game.numGamesRegistered);
		for (int i = 0; i<games.size(); i++) {
			games.get(i).printInfo(); //�ش� Id�� ��� ������ ����Ѵ�.
		}
	}

}
