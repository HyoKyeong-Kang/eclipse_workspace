package threadStates.timedwating_join;

class MyThread1 extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000000000L; i++) {
		} // 시간지연
	}

}

class MyThread2 extends Thread {
	MyThread1 myThread1;

	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}

	@Override
	public void run() {
		// Thread.sleep();, join() 메서드는 누군가 임의로 깨우는 interrupt(); 예외가 발생할 가능성이 있다.
		// try-catch 구문으로 일반 예외 처리를 해 주어야 함

		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println("--join(...) 진행 중 interrupt() 발생");
			for (long i = 0; i < 100000000L; i++) {
			} // 시간지연
		}
	}
}

public class Timedwating_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());

		myThread2.interrupt(); // main 쓰레드에서 myThread 쓰레드를 임의로 깨움
		try {
			Thread.sleep(100); // 0.1초
		} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());

	}
}
