import java.util.Scanner;

public class MenuManager { //menu manager 클래스를 만든다.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6 ) {
			System.out.println("*** Steam Game Management Menu ***"); //메뉴를 소개한다.
			
			System.out.println("1. Add game"); //게임을 추가한다.
			System.out.println("2. Delet game"); //게임을 삭제한다.
			System.out.println("3. Edit game"); //게임을 수정한다.
			System.out.println("4. View game"); //게임을 본다.
			System.out.println("5. Show a menu");
			System.out.println("6. Exit"); //프로그램을 끈다.
			System.out.println("Select one number between 1 - 6:"); //번호 5개 중 하나를 고르게 한다.
			num = input.nextInt();
			if (num == 1) {
				addStudent();
			}
			
			else if (num == 2) {
				deletStudent();
			}
			
			else if (num == 3) {
				editStudent();
			}
			else if (num == 4) {
				viewStudent();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();
		
		System.out.print("Student name:");
		String studentName = input.next();
		
		System.out.print("Email address:");
		String studentEmail = input.next();
		System.out.println(studentEmail);
		
		System.out.print("Phone number:");
		String studentPhone = input.next();
		

	}
	
	public static void deletStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();

	}

	public static void editStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();

	}
	
	public static void viewStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentId = input.nextInt();

	}


}
