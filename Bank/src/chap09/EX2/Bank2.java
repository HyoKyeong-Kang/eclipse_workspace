package chap09.EX2;

class Account1 {
	public String accountNum;
	public double balance;
	


	public Account1(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public Account1() {
		
			
	}

	public void accountPrint() {
		System.out.println("계좌번호: " + accountNum);
		System.out.println("잔액: " + balance + "원");
	}
	
	
		public double deposit;
		public double withdraw;
		public double transfer;
		
		public Account1(double deposit, double withdraw,double transfer) {
			super();
			this.deposit = deposit;
			this.withdraw = withdraw;
			this.transfer = transfer;
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
//		public void transfer2(double transferAmount) {
//			// TODO Auto-generated method stub
//			 withdraw
//		}

		public void transfer(double amount) {
			deposit(amount);
			withdraw(amount);
			accountPrint();
			System.out.println(amount + "원이 " + accountNum + "계좌로 이체되었습니다.");	
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
	
