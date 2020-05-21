import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager { 
	static EventLogger logger = new EventLogger("log.txt"); //EventLogger클래스로 코드가 실행된 시간을 기록한다
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GameManager gameManager = getObject("gamemanager.ser"); //바이트 분해 후 스트림으로 보내는 직렬화
		if(gameManager == null) {
			gameManager = new GameManager(input);
		}
		else {
			gameManager.setScanner(input);
		}

		selectMenu(input, gameManager);
		putObject(gameManager, "gamemanager.ser"); //스트림에 넣는다
	}

	public static void selectMenu(Scanner input, GameManager gameManager) {
		int num = -1;	
		while(num != 5 ) { //num이 5가 아닌 동안 반복된다.
			try {
				showMenu();
				num = input.nextInt(); //숫자 num을 입력받는다.
				switch(num) {
				case 1:
					gameManager.addGame(); 
					logger.log("add a game"); //log 기록
					break;
				case 2:
					gameManager.deletGame();
					logger.log("delete a game");
					break;
				case 3:
					gameManager.editGame();
					logger.log("eidt a game");
					break;
				case 4:
					gameManager.viewGames();
					logger.log("edit a list of a game");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) { //try 와 catch로 에러를 잡아낸다
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Steam Game Management Menu ***"); //메뉴를 소개한다.		
		System.out.println("1. Add game"); //게임을 추가한다.
		System.out.println("2. Delet game"); //게임을 삭제한다.
		System.out.println("3. Edit game"); //게임을 수정한다.
		System.out.println("4. View games"); //게임을 본다.
		System.out.println("5. Exit"); //프로그램을 끈다.
		System.out.println("Select one number between 1 - 5:"); //번호 5개 중 하나를 고르게 한다.
	}
	
	public static GameManager getObject(String filename) {
		GameManager gameManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			gameManager = (GameManager) in.readObject(); //스트림에 있는 객체를 읽는다
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return gameManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gameManager;
	}
	
	public static void putObject(GameManager gameManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(gameManager); //스트림에 객체를 집어 넣는다
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
