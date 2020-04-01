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
			int num = -1;	
			while(num != 5 ) { //num이 6이 아닌 동안 반복된다.
				System.out.println("** Steam Game Info Edit Menu **"); //메뉴를 소개한다.		
				System.out.println("1. Edit Id"); //게임을 추가한다.
				System.out.println("2. Edit Name"); //게임을 삭제한다.
				System.out.println("3. Edit Email"); //게임을 수정한다.
				System.out.println("4. Edit Phone"); //게임을 본다.
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
					System.out.print("Phone number:");
					game.phone = input.next();	
				}
				else { //5나 그 외의 숫자일 때 while로 menu 출력부터 다시 시작된다.
					continue;
				}
			}
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
