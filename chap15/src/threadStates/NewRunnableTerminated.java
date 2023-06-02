package threadStates;

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쓰레드 상태 저장
		Thread.State state;

		// 1. 객체 생성(NEW) - NEW 상태는 Thread 객체를 new 키워드를 이용해 생성한 시점
		Thread myThread = new Thread() {

			@Override
			public void run() {
				for (long i = 0; i < 100000000L; i++) {
				} // 시간 지연
			}
		};

		state = myThread.getState(); /// new 키워드로 객체를 생성한 시점에 상태를 알아보겠다
		System.out.println("1. myThread state = " + state); // new

		// 2. myThread 시작 - start()메서드를 호출하면 RUNNABLE 상태가 된다
		myThread.start();
		state = myThread.getState();
		System.out.println("2. myThread state = " + state); // RUNNABLE

		// 3.myThread 종료
		try {
			myThread.join(); // join을 실행하는 대상 - main Thread
//		myThread인 해당 쓰레드가 완료될 때까지 main Thread는 종료되지 않고 기다리겠다는 의미
		} catch (InterruptedException e) {}
		
		
		state = myThread.getState();
		System.out.println("3. myThread state = " + state);  //myThread 객체 종료시점에 종료 
	}
}
