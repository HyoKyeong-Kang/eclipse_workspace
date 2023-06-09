package chap09.EX2;

import java.util.Scanner;


public class BankMain2 {



	public static void main(String[] args) {
		

		//사용자 입력
		Scanner sc = new Scanner(System.in);
		
		Account1 account = new Account1("1234567890", 100000);
		Account1 account2 = new Account1("2345678901", 200000);
		
		account.accountPrint();
		
		while(true) {
			System.out.println("======= 은행 시스템 =======");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 계좌 조회");
			System.out.println("4. 송금");
			System.out.println("0. 종료");
			
			System.out.print("원하는 기능의 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			
			switch (num) {
			case 1:
				System.out.print("계좌번호를 입력하세요 : ");
				String enteredAccountNum =sc.next();
				depositIntoAccount1(account, sc, enteredAccountNum);
				break;
			case 2 :
				System.out.print("계좌 번호를 입력하세요 : ");
				enteredAccountNum = sc.next();
				withdrawFromAccount1(account, sc, enteredAccountNum);
				break;
			case 3 :
				account.accountPrint();
				break;
			case 4:
				System.out.print("보낼 계좌번호를 입력하세요");
				enteredAccountNum = sc.next();
				accountTransfer(account ,account2 ,sc, enteredAccountNum);
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
		
	}

	private static void accountTransfer(Account1 account,Account1 account2, Scanner sc, String enteredAccountNum) {
		// TODO Auto-generated method stub
		if(account2.checkAmount(enteredAccountNum)) {
			System.out.print("송금할 금액을 입력하세요.");
			double transferAmount = sc.nextDouble();
			if(transferAmount <= 0) {
				System.out.println("금액을 잘못입력하셨습니다.");
			}else if (transferAmount > 0 && transferAmount  <= account2.getBalance()) {
//				account2.transfer(transferAmount);
				account.withdraw(transferAmount);
				account2.deposit(transferAmount);
				System.out.println(transferAmount + "원이 " + account2.accountNum + "계좌로 이체되었습니다.");
				
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			account.accountPrint();
			account2.accountPrint();
		}else {
			System.out.println("잘못된 계좌번호입니다.");
		}
	}

	private static void depositIntoAccount1(Account1 account, Scanner sc, String enteredAccountNum) {
		// TODO Auto-generated method stub
		if(account.checkAmount(enteredAccountNum)) {
			System.out.print("입금할 금액을 입력하세요 : ");
			double depositAmount = sc.nextDouble();
			
			if(depositAmount <= 0) {
				System.out.println("금액을 잘못입력하셨습니다.");
			}else {
				account.deposit(depositAmount);
				account.accountPrint();
			}
			
		} else {
			System.out.println("잘못된 계좌번호입니다.");
		}
}
	public static void withdrawFromAccount1(Account1 account, Scanner sc, String enteredAccountNum) {
		if(account.checkAmount(enteredAccountNum)) {
			System.out.print("인출할 금액을 입력하세요 : ");
			double withdrawAmount = sc.nextDouble();
			
			if(withdrawAmount == 0) {
				System.out.println("인출하려는 금액이 0원입니다.");
			}else if (withdrawAmount > 0 && withdrawAmount <= account.getBalance()) {
				account.withdraw(withdrawAmount);
				account.accountPrint();
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
