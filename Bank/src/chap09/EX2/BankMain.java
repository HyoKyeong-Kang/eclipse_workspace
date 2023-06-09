package chap09.EX2;

import java.util.Scanner;


public class BankMain {


	public static void main(String[] args) {
		

		//사용자 입력
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account("1234567890", 100000);
		account.accountPrint();
		
		while(true) {
			System.out.println("======= 은행 시스템 =======");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 계좌 조회");
			System.out.println("0. 종료");
			
			System.out.print("원하는 기능의 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			
			switch (num) {
			case 1:
				System.out.print("계좌번호를 입력하세요 : ");
				String enteredAccountNum =sc.next();
				depositIntoAccount(account, sc, enteredAccountNum);
				break;
			case 2 :
				System.out.print("계좌 번호를 입력하세요 : ");
				enteredAccountNum = sc.next();
				withdrawFromAccount(account, sc, enteredAccountNum);
				break;
			case 3 :
				account.accountPrint();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 선택 입니다. 다시입력하세요.");
				break;
			}
		}
		
//		//인출
//		//1.계좌확인 > 2.금액이 0인지 아닌지 확인>3.계좌금액 확인 >4.출금확인
//		System.out.print("계좌번호를 입력하세요: ");
//		String enteredAccountNum =sc.next();
//		extracted(sc, account, enteredAccountNum);
//		
//		
//		
		
//		//예금
//		System.out.println("입금할 금액을 입력하세요.");
//		double depositAmount =sc.nextDouble();
//		
//		account.deposit(depositAmount);
//		
//		//인출
//		System.out.println("출금할 금액을 입력하세요");
//		double withdrawAmount = sc.nextDouble();
//		
//		account.withdraw(withdrawAmount);
	}

	private static void depositIntoAccount(Account account, Scanner sc, String enteredAccountNum) {
		// TODO Auto-generated method stub
		if(account.checkAmount(enteredAccountNum)) {
			System.out.print("입금할 금액을 입력하세요 : ");
			double depositAmount = sc.nextDouble();
			
			if(depositAmount <= 0) {
				System.out.println("금액을 잘못입력하셨습니다.");
			}else if (depositAmount > 0 && depositAmount <= account.getBalance()) {
				account.withdraw(depositAmount);
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			account.accountPrint();
		}else {
			System.out.println("잘못된 계좌번호입니다.");
		}
	}

	public static void withdrawFromAccount(Account account, Scanner sc, String enteredAccountNum) {
		if(account.checkAmount(enteredAccountNum)) {
			System.out.print("인출할 금액을 입력하세요 : ");
			double withdrawAmount = sc.nextDouble();
			
			if(withdrawAmount == 0) {
				System.out.println("인출하려는 금액이 0원입니다.");
			}else if (withdrawAmount > 0 && withdrawAmount <= account.getBalance()) {
				account.withdraw(withdrawAmount);
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			account.accountPrint();
		}else {
			System.out.println("잘못된 계좌번호입니다.");
		}
	}

}
