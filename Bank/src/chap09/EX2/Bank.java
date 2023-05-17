package chap09.EX2;

class Account {
	public String accountNum;
	public double balance;
	


	public Account(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public Account() {
		
			
	}

	public void accountPrint() {
		System.out.println("계좌번호: " + accountNum);
		System.out.println("잔액: " + balance + "원");
	}
	
	
		public double deposit;
		public double withdraw;
		
		public Account(double deposit, double withdraw) {
			super();
			this.deposit = deposit;
			this.withdraw = withdraw;
		}

		public void deposit(double amount) {
			balance += amount;
			System.out.println(amount + "원이 입금되었습니다.");
			accountPrint();
			}
		
		public void withdraw(double amount) {
			if(balance >= amount) {
				balance -= amount;
			System.out.println(amount + "원이 인출 되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		
			
	}

		
		public boolean checkAmount(String enteredAccountNum ) {
			return this.accountNum.equals(enteredAccountNum);
		}
			
		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
	
}
	
