import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("[1: ���� 2: ���� 3: �� ");
		
		int user = sc.nextInt();
		int com = (int) (Math.random()* 3 + 1 - 1)+1;
		
		game(user, com);

	}
public static void game(int user, int com) {
	String users = null;
	switch (user) {
	case 1:
		users = "����!";
		break;
	case 2:
		users = "����!";
		break;
	case 3:
		users = "���ڱ�!";
		break;
	}
	String coms = null;
	switch (com) {
	case 1:
		coms = "����!";
		break;
		
	case 2:
		coms = "����!";
		break;
		
	case 3:
		coms = "qhwkrl!";
		break;
	}
	System.out.println("--------------------���� ���� ��!---------------------");
	
}
}
