//와일드 카드 타입 변수(파라미터) -- "?" (API Document에서 사용할 수 있다)

//제네릭타입을 매개갑으로 사용할 때 타입 파라미터로 ?(와일드카드)를 사용할 수 있다.
// ? - 범위에 있는 모든 타입으로 대체할 수 있다는 표시가 되는데, 상속 관계에서 많이 사용  

class Person {
} // 일반인 클래스

class Worker extends Person {
} // 일반인을 상속하고 있는 직장인 클래스

class Student extends Person {
} // 일반인을 상속하고 있는 학생 클래스

class HighStudent extends Student {
} // 학생을 상속하고 있는 고등학생 클래스

class MiddleStudent extends Student {
} // 학생을 상속하고 있는 중학생 클래스

class Applicant<T> { // 수강신청을 받는 사람을 생성
	public T kind; // 해당타입을 가리키는 참조 변수 선언
	// <> 제네릭 타입 파라미터(변수)에 들어올 수 있는 참조자료형 - 클래스, 인터페이스
	// 참조자료형 변수명; => 변수는 즉, 번지 수를 가지는 참조 변수가 된다. (참조 자료형의 값은 객체로 heap 메모리에 저장)

	public Applicant(T kind) { // 해당 타입의 객체의 번지 수를 가지고 있는 참조 변수의 값을 입력 매개값으로 받겠다.
		super();
		this.kind = kind;
	}

}

class Coures {
	// 1. 첫번째 메소드는 모든 사람이 들을 수 있는 과정 신청 메소드
	// 2. 두번째 메소드는 학생만 들을 수 있는 과정 신청 메소드
	// 3. 세번째 메소드는 직장인과 일반인만 들을 수 있는 과정 신청 메소드
	public static void registerCoures1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "(이)가 Coures1 과정을 등록 했습니다.");
	}

	// 2
	public static void registerCoures2(Applicant<? extends Student> applicant) {
		// 최대 Student class 객체나 혹은 Student를 상속받고 있는 자식 타입 객체들만 올 수 있도록 선언
		// Student 클래스를 상속하고 있는 객체들만 가능
		System.out.println(applicant.kind.getClass().getSimpleName() + "(이)가 Coures2 과정을 등록 했습니다.");

	}
	
	//3	
	public static void registerCoures3(Applicant<? super Worker> applicant) {
		// 최소 Worker와 Worker class 가 상속하고 있는 부모 타입만 가능
		System.out.println(applicant.kind.getClass().getSimpleName() + "(이)가 Coures3 과정을 등록 했습니다.");
	}
}

public class Generic_Ex02 {
	public static void main(String[] args) {
//		Person p = new Person();
//		Applicant<Person> p1 = new Applicant<>(p);
//		Coures.registerCoures1(p1);

		Coures.registerCoures1(new Applicant<Person>(new Person()));
		Coures.registerCoures1(new Applicant<Worker>(new Worker()));
		Coures.registerCoures1(new Applicant<Student>(new Student()));
		Coures.registerCoures1(new Applicant<HighStudent>(new HighStudent()));
		Coures.registerCoures1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		//학생만 신청 가능
//		Coures.registerCoures2(new Applicant<Person>(new Person()));
//		Coures.registerCoures2(new Applicant<Worker>(new Worker()));
		Coures.registerCoures2(new Applicant<Student>(new Student()));
		Coures.registerCoures2(new Applicant<HighStudent>(new HighStudent()));
		Coures.registerCoures2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		//직장인만 신청 가능
		Coures.registerCoures3(new Applicant<Person>(new Person()));
		Coures.registerCoures3(new Applicant<Worker>(new Worker()));
//		Coures.registerCoures3(new Applicant<Student>(new Student()));
//		Coures.registerCoures3(new Applicant<HighStudent>(new HighStudent()));
//		Coures.registerCoures3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		// 입력 매개변수의 타입을 제네릭 클래스로 지정한 경우, 제네릭 클래스에 지정될 수 있는 실제 타입을 와일드 카드를 이용해 제한할 수 있다.
		// 제네릭 클래스란? 객체가 생성될 때 실체 타입이 지정됨
		
	}
}
