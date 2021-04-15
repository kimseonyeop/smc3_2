import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("[1: 가위 2: 바위 3: 보 ");
		
		int user = sc.nextInt();
		int com = (int) (Math.random()* 3 + 1 - 1)+1;
		
		game(user, com);

	}
public static void game(int user, int com) {
	String users = null;
	switch (user) {
	case 1:
		users = "가위!";
		break;
	case 2:
		users = "바위!";
		break;
	case 3:
		users = "보자기!";
		break;
	}
	String coms = null;
	switch (com) {
	case 1:
		coms = "가위!";
		break;
		
	case 2:
		coms = "바위!";
		break;
		
	case 3:
		coms = "qhwkrl!";
		break;
	}
	System.out.println("--------------------가위 바위 보!---------------------");
	
}
}
