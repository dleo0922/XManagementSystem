import java.util.Scanner;

public class MenuManager { //menu manager Ŭ������ �����.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6 ) {
			System.out.println("*** Steam Game Management Menu ***"); //�޴��� �Ұ��Ѵ�.
			
			System.out.println("1. Add game"); //������ �߰��Ѵ�.
			System.out.println("2. Delet game"); //������ �����Ѵ�.
			System.out.println("3. Edit game"); //������ �����Ѵ�.
			System.out.println("4. View game"); //������ ����.
			System.out.println("5. Show a menu");
			System.out.println("6. Exit"); //���α׷��� ����.
			System.out.println("Select one number between 1 - 6:"); //��ȣ 5�� �� �ϳ��� ���� �Ѵ�.
			num = input.nextInt();
			if (num == 1) {
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
			else {
				continue;
			}
		}
	}
	
	public static void addGame() {
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int studentId = input.nextInt();
		
		System.out.print("Game name:");
		String studentName = input.next();
		
		System.out.print("Email address:");
		String studentEmail = input.next();
		System.out.println(studentEmail);
		
		System.out.print("Phone number:");
		String studentPhone = input.next();
		

	}
	
	public static void deletGame() {
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();

	}

	public static void editGame() {
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();

	}
	
	public static void viewGame() {
		Scanner input = new Scanner(System.in);
		System.out.print("Game ID:");
		int gameId = input.nextInt();

	}


}
