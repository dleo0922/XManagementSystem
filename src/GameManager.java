import java.util.Scanner;

public class GameManager {
	Game game;
	Scanner input;
	
	GameManager(Scanner input){
		this.input = input;
	}
	
	public void addGame() { //Game ID, name, E address, Phone number�� �Է¹޴´�.
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
	
	public void deletGame() { //Game Id�� �Է¹޴´�.		
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

	public void editGame() { //Game Id�� �Է¹޴´�.		
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		if(game.id == gameId) {
			int num = -1;	
			while(num != 5 ) { //num�� 6�� �ƴ� ���� �ݺ��ȴ�.
				System.out.println("** Steam Game Info Edit Menu **"); //�޴��� �Ұ��Ѵ�.		
				System.out.println("1. Edit Id"); //������ �߰��Ѵ�.
				System.out.println("2. Edit Name"); //������ �����Ѵ�.
				System.out.println("3. Edit Email"); //������ �����Ѵ�.
				System.out.println("4. Edit Phone"); //������ ����.
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
					System.out.print("Phone number:");
					game.phone = input.next();	
				}
				else { //5�� �� ���� ������ �� while�� menu ��º��� �ٽ� ���۵ȴ�.
					continue;
				}
			}
		}
	}
	
	public void viewGame() { //Game Id�� �Է¹޴´�.
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		if(game.id == gameId) {
			game.printInfo();
		}
	}

}
