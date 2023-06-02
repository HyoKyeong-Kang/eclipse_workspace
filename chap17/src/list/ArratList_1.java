package list;

import java.util.ArrayList;
import java.util.List;

public class ArratList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 생성
		List<Board> list = new ArrayList<>();
//		List<E> 즉 , Board 타입의 객체만 ArrayList에 추가/ 삭제될 수 있다는 것
		
		// 객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		
		System.out.println(list);
		// 저장된 객체의 총 개수 열기
		System.out.println("list size = " + list.size());
		
		//특정 인덱스로 객체 가져오기 - get
		Board board = list.get(3);
		System.out.println(board);
		//반복문을 이용하여 list의 모든 객체를 가져오기
		System.out.println("======= for문 =======");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		//객체 삭제
		list.remove(3);
		list.remove(1);
	
		//향상된 for문으로 list에 모든 객체 가져오기
		System.out.println("====향상된 for문 사용 ====");
		for(Board li : list) {
			//Board li;
			//li = list.get(0); -- for문 1번째
			//li = list.get(1); -- for문 2번째
			System.out.println(li);
		}
	}

}
