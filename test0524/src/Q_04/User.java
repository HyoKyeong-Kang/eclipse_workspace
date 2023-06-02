package Q_04;

import java.util.Scanner;

public class User {

	static Scanner sc = new Scanner(System.in);
	private static Join_EX member;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("등록할 닉네임을 입력해주세요 : ");
		String userNickname = sc.next();

		System.out.print("비밀번호를 입력해주세요 : ");
		String userPw = sc.next();

		member = new Join_EX(userNickname, userPw);

		while (true) {
			System.out.println("<메뉴 목록>");
			System.out.println("1. 회원 정보");
			System.out.println("2. 회원 수정");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 종료");
			System.out.println("실행할 메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				member.printinfo();
				break;
			case 2:
				menuUserInfoChange(userNickname, userPw);
				break;
			case 3:
				menuUserDelete(userNickname, userPw);
				break;
			case 4:
				System.out.println("실행을 종료합니다.");
				return;
			default:
				System.out.println("번호를 잘못 선택하셨습니다.");

			}

		}

	}

	private static void menuUserInfoChange(String userNickname, String userPw) {
		// TODO Auto-generated method stub
		System.out.println("닉네임을 입력해 주세요: ");
		String checkNickname = sc.next();

		if (member.checkId(checkNickname)) {
			System.out.print("비밀번호를 입력해 주세요: ");
			String checkPw = sc.next();
			if (member.checkUserPwd(checkPw)) {
				System.out.print("변경할 닉네임을 입력해주세요: ");
				String newNickname = sc.next();

				member.updateInfo(newNickname, userPw);

			} else {
				System.out.println("비밀번호가 일치하지 않아 변경할 수 없습니다.");
			}
		} else {
			System.out.println("닉네임이 일치하지 않아 변경할 수 없습니다.");

		}
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static void menuUserDelete(String userNickname, String userPw) {
		// TODO Auto-generated method stub
		System.out.print("닉네임을 입력해 주세요: ");
		String checkNickname = sc.next();

		if (member.checkId(checkNickname)) {
			System.out.println(" 비밀번호를 입력해 주세요: ");
			String checkPw = sc.next();
			if (member.checkUserPwd(checkPw)) {

				member.deleteMember();
			} else {
				System.out.println("비밀번호가 일치하지 않아 삭제할 수 없습니다.");
			}
		} else {
			System.out.println("닉네임이 일치하지 않아 삭제할 수 없습니다.");

		}
	}
}
