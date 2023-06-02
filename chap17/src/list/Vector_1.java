package list;

import java.util.List;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> vList = new Vector<>();

		// 작업 쓰레드 객체 생성
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				// 객체 100개를 저장 (게시글 1~100까지 저장)
				System.out.println(Thread.currentThread().getName() + "실행");
				for (int i = 1; i <= 100; i++) {
					vList.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				// 객체 100개를 저장 (게시글 101~200까지 저장)
				System.out.println(Thread.currentThread().getName() + "실행");
				for (int i = 101; i <= 200; i++) {
					vList.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		// 작업쓰레드 실행
		thread1.start();
		thread2.start();

//		thread1과 thread2의 실행이 끝날 때까지 메인 쓰레드는 기다린다.
		try {
			thread1.join();
			thread2.join();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("vList size =  " + vList.size());
		
		for(Board li : vList) {
			System.out.println(li);
		}
	}

}
