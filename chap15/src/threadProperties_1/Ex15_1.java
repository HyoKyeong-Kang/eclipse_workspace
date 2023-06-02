package threadProperties_1;

public class Ex15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Runnable r = new RunnableEx15();
		
//		new Thread(r).start();  //참조변수 없이 thread 객체 생성해서 사용
//		new Thread(r).start();
		
		Thread thread1 = new RunnableEx15();
		Thread thread2 = new RunnableEx15();
		
		thread1.setName("쓰레드 1번");
		thread2.setName("쓰레드 2번");
		
		thread1.start();
		thread2.start();
	}
}

class Account {
	private int balance = 1000;

	public int getBlance() {
		return balance;
	}

public synchronized void withdraw(int money) {
	if(balance >= money) {
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		balance -= money;
	}
}


}
class RunnableEx15 extends Thread implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(acc.getBlance()> 0) {
			acc.withdraw(200);
			System.out.println(getName() + "남은돈: " + acc.getBlance());
		}
	} 
	
}