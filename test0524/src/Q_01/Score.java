package Q_01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("점수를 입력하세요: ");
			int userNum = sc.nextInt();

			if (userNum >= 90 && userNum <= 100) {
				System.out.println("A");
			} else if (userNum >= 80 && userNum < 90) {
				System.out.println("B");
			} else if (userNum >= 70 && userNum < 80) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}

		}
	}
}
