package chap14;

class MyException extends Exception {
	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}


public class CreateUserException {

		// TODO Auto-generated method stub
	static 	MyException me1 = new MyException("예외 메시지 : MyException 발생");

	static void abc(int num) {
		try {
			if(num > 70)
				System.out.println("정상 작동");
			else 
				throw me1;  //예외를 던짐과 동시에 예외 발생
		}catch (MyException e) {
		System.out.println(me1.getMessage());	
		}
	}
	public static void main(String[] args) {
	abc(71); //정상 작동
	System.out.println("--------------------");
	abc(60);
}
	
	}
