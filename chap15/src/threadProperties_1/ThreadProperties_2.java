package threadProperties_1;

class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (long i =0; i < 1000000000; i++) {}  //시간 지연용
		System.out.println(getName() + "우선순위: " + getPriority());
		
	}
	
}

public class ThreadProperties_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("코어 수" + Runtime.getRuntime().availableProcessors());
	for(int i = 0; i<3; i ++) {
		Thread thread = new MyThread();
		thread.start();
	}
	
	try{Thread.sleep(1000);}catch(InterruptedException e) {}
	
	for(int i = 0; i< 10; i ++) {
		Thread thread = new MyThread();
		thread.setName(i+ "번째 쓰레드");
		if(i== 9) thread.setPriority(10);
		thread.start();
	}
	
	}

}
