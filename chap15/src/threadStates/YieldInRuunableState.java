package threadStates;

class MyThread extends Thread {
	boolean yieldFlag;

	@Override
	public void run() {
		while (true) {
			if (yieldFlag) { // yieldFlag 값이 true 일때 실행한다
				Thread.yield(); // yield() - cpu 사용을 인위적으로 딱한번 양보
				// 자기 자신을 실행 대기 상태로 전환 하겠다

			} else {
				System.out.println(this.getName() + "실행"); // 자신의 쓰레드 이름을 출력
				for (long i = 0; i < 100000000L; i++) {
				} // 시간 지연
			}
		}
	}

}

public class YieldInRuunableState {

	public static void main(String[] args) {
		// MyThread 클래스를 이용해 2개의 객체 생성
		MyThread thread1 = new MyThread(); //new
		thread1.setName("thread1"); //thread1 쓰레드 이름 설정
		thread1.yieldFlag = false; //thread1 의 yieldFlag  필드 값 false로 지정
		//run() 메서드 - false 일때 자신의 쓰레드 이름을 출력하고 일정시간 지연하는 for문 실행
		thread1.setDaemon(true);
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		//run() 메서드 - true 일때는 다른 쓰레드에게 자신의 차례를 양보
		thread2.setDaemon(true);
		thread2.start();
	
		//6초 지연
		for(int i=0; i<6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e ) {}
			thread1.yieldFlag = !thread1.yieldFlag;
			thread2.yieldFlag = !thread2.yieldFlag;
		}
	}

}
