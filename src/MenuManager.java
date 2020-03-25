import java.util.Scanner;

public class MenuManager { //menu manager Ŭ������ �����.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6 ) { //num�� 6�� �ƴ� ���� �ݺ��ȴ�.
			System.out.println("*** Steam Game Management Menu ***"); //�޴��� �Ұ��Ѵ�.		
			System.out.println("1. Add game"); //������ �߰��Ѵ�.
			System.out.println("2. Delet game"); //������ �����Ѵ�.
			System.out.println("3. Edit game"); //������ �����Ѵ�.
			System.out.println("4. View game"); //������ ����.
			System.out.println("5. Show a menu");
			System.out.println("6. Exit"); //���α׷��� ����.
			System.out.println("Select one number between 1 - 6:"); //��ȣ 5�� �� �ϳ��� ���� �Ѵ�.
			num = input.nextInt(); //���� num�� �Է¹޴´�.
			if (num == 1) { //num�� 1,2,3,4 ������ �� �� �Լ��� �����Ѵ�.
				addGame(); 
			}
			else if (num == 2) {
				deletGame();
			}			
			else if (num == 3) {
				editGame();
			}
			else if (num == 4) {
				viewGame();
			}
			else { //5�� �� ���� ������ �� while�� menu ��º��� �ٽ� ���۵ȴ�.
				continue;
			}
		}
	}
	
	public static void addGame() { //Game ID, name, E address, Phone number�� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();
		
		System.out.print("Game name:");
		String gameName = input.next();
		
		System.out.print("Email address:");
		String gameEmail = input.next();
		System.out.println(gameEmail); //�Է¹��� email�� ����Ѵ�.
		
		System.out.print("Phone number:");
		String gamePhone = input.next();	
	}
	
	public static void deletGame() { //Game Id�� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();
	}

	public static void editGame() { //Game Id�� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();
	}
	
	public static void viewGame() { //Game Id�� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();
	}
}
