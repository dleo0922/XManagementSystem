import java.util.Scanner;

public class MenuManager { //menu manager Ŭ������ �����.
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		GameManager gameManager = new GameManager(input);
		int num = -1;	
		while(num != 5 ) { //num�� 5�� �ƴ� ���� �ݺ��ȴ�.
			System.out.println("*** Steam Game Management Menu ***"); //�޴��� �Ұ��Ѵ�.		
			System.out.println("1. Add game"); //������ �߰��Ѵ�.
			System.out.println("2. Delet game"); //������ �����Ѵ�.
			System.out.println("3. Edit game"); //������ �����Ѵ�.
			System.out.println("4. View game"); //������ ����.
			System.out.println("5. Exit"); //���α׷��� ����.
			System.out.println("Select one number between 1 - 5:"); //��ȣ 5�� �� �ϳ��� ���� �Ѵ�.
			num = input.nextInt(); //���� num�� �Է¹޴´�.
			if (num == 1) { //num�� 1,2,3,4 ������ �� �� �Լ��� �����Ѵ�.
				gameManager.addGame(); 
			}
			else if (num == 2) {
				gameManager.deletGame();
			}			
			else if (num == 3) {
				gameManager.editGame();
			}
			else if (num == 4) {
				gameManager.viewGame();
			}
			else { //5�� �� ���� ������ �� while�� menu ��º��� �ٽ� ���۵ȴ�.
				continue;
			}
		}
	}
}
