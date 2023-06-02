package Q_06;

public class Student {
	private String name;
	private int ban;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int ban, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAverage() {
		int total = getTotal();
		int count = 3;
		return (double) total / count;
	}

	
}