package threadStates.BlockedState;

class MyBlockTest {
	MyClass mc = new MyClass();
	Thread t1 = new Thread("thread1") {
	public void run() {
		mc.syncMethod();
	};	
};


class MyClass {
	synchronized void syncMethod() {
}

public class BlockedState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
