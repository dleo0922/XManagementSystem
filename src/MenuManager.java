import java.util.Scanner;

public class MenuManager { //menu manager Ŭ������ �����.
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		GameManager gameManager = new GameManager(input);
		int num = -1;	
		while(num != 5 ) { //num�� 5�� �ƴ� ���� �ݺ��ȴ�.
			showMenu();
			num = input.nextInt(); //���� num�� �Է¹޴´�.
			switch(num) {
			case 1:
				gameManager.addGame(); 
				break;
			case 2:
				gameManager.deletGame();
				break;
			case 3:
				gameManager.editGame();
				break;
			case 4:
				gameManager.viewGames();
				break;
			default:
				continue;
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
}
