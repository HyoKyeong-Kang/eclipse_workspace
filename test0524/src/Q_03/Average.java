package Q_03;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[]{100, 80, 100, 100, 95};
		
		int sum = Arrays.stream(score).sum();
		System.out.println("총 점수: " + sum);
		
		
		
		int sum1 = 0;
		for(int i : score) {
			sum1 += i;		
		}
		
		double avg = sum1/(score.length);
		
		System.out.println("평균 점수: " + avg);
	}

}
