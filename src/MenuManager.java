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
	static EventLogger logger = new EventLogger("log.txt"); //EventLoggerŬ������ �ڵ尡 ����� �ð��� ����Ѵ�
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GameManager gameManager = getObject("gamemanager.ser"); //����Ʈ ���� �� ��Ʈ������ ������ ����ȭ
		if(gameManager == null) {
			gameManager = new GameManager(input);
		}
		else {
			gameManager.setScanner(input);
		}

		selectMenu(input, gameManager);
		putObject(gameManager, "gamemanager.ser"); //��Ʈ���� �ִ´�
	}

	public static void selectMenu(Scanner input, GameManager gameManager) {
		int num = -1;	
		while(num != 5 ) { //num�� 5�� �ƴ� ���� �ݺ��ȴ�.
			try {
				showMenu();
				num = input.nextInt(); //���� num�� �Է¹޴´�.
				switch(num) {
				case 1:
					gameManager.addGame(); 
					logger.log("add a game"); //log ���
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
			catch(InputMismatchException e) { //try �� catch�� ������ ��Ƴ���
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Steam Game Management Menu ***"); //�޴��� �Ұ��Ѵ�.		
		System.out.println("1. Add game"); //������ �߰��Ѵ�.
		System.out.println("2. Delet game"); //������ �����Ѵ�.
		System.out.println("3. Edit game"); //������ �����Ѵ�.
		System.out.println("4. View games"); //������ ����.
		System.out.println("5. Exit"); //���α׷��� ����.
		System.out.println("Select one number between 1 - 5:"); //��ȣ 5�� �� �ϳ��� ���� �Ѵ�.
	}
	
	public static GameManager getObject(String filename) {
		GameManager gameManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			gameManager = (GameManager) in.readObject(); //��Ʈ���� �ִ� ��ü�� �д´�
			
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
			
			out.writeObject(gameManager); //��Ʈ���� ��ü�� ���� �ִ´�
			
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
