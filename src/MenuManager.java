import java.util.Scanner;

public class MenuManager { //menu manager 클래스를 만든다.
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		GameManager gameManager = new GameManager(input);
		int num = -1;	
		while(num != 5 ) { //num이 5가 아닌 동안 반복된다.
			System.out.println("*** Steam Game Management Menu ***"); //메뉴를 소개한다.		
			System.out.println("1. Add game"); //게임을 추가한다.
			System.out.println("2. Delet game"); //게임을 삭제한다.
			System.out.println("3. Edit game"); //게임을 수정한다.
			System.out.println("4. View game"); //게임을 본다.
			System.out.println("5. Exit"); //프로그램을 끈다.
			System.out.println("Select one number between 1 - 5:"); //번호 5개 중 하나를 고르게 한다.
			num = input.nextInt(); //숫자 num을 입력받는다.
			if (num == 1) { //num이 1,2,3,4 정수일 때 각 함수를 실행한다.
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
			else { //5나 그 외의 숫자일 때 while로 menu 출력부터 다시 시작된다.
				continue;
			}
		}
	}
}
