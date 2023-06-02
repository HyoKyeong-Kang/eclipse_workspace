package threadStates.timedwating;



class MyThread extends Thread {

	@Override
	public void run() {
		// Thread.sleep();, join() 메서드는 누군가 임의로 깨우는 interrupt(); 예외가 발생할 가능성이 있다.
		// try-catch 구문으로 일반 예외 처리를 해 주어야 함

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("--sleep() 진행 중 interrupt() 발생");
			for (long i = 0; i < 100000000L; i++) {
			} // 시간지연
		}
	}

}

public class TimedWating_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread(); // new
		myThread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
			System.out.println("MyThread State = " + myThread.getState());
		
		myThread.interrupt(); //main 쓰레드에서 myThread 쓰레드를 임의로 깨움
		try {
			Thread.sleep(100); // 0.1초
		} catch (InterruptedException e) {}
			System.out.println("MyThread State = " + myThread.getState());
	}
}
