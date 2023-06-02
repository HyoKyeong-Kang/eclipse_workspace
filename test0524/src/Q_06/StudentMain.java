package Q_06;

import java.text.DecimalFormat;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentKim = new Student("김유신", 1, 90, 85, 70);
		Student studentLee = new Student("이순신", 1, 60, 89, 85);

		int totalKim = studentKim.getTotal();
		int totalLee = studentLee.getTotal();
		double averageKim = studentKim.getAverage();
		double averageLee = studentLee.getAverage();

		DecimalFormat decimalFormat = new DecimalFormat("0.0");
		String formattedAverageKim = decimalFormat.format(averageKim);
		String formattedAverageLee = decimalFormat.format(averageLee);

		System.out.printf("김유신의 총점은 %s 이고 평균은 %s 입니다\n", totalKim, formattedAverageKim);
		System.out.printf("이순신의 총점은 %s 이고 평균은 %s 입니다", totalLee, formattedAverageLee);

	}
}
