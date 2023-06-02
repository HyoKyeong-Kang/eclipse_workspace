import java.util.Scanner;

public class StudyRoom {
	private static boolean[] studyRooms = new boolean[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입장할 번호를 입력해 주세요 : ");

		int inputNumber = sc.nextInt(); // 1번 사람 방 번호
		int randomNumber = (int)(Math.random() * 4 + 1); // 2번 사람 방 번호

		Thread person1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(inputNumber + "룸 예약을 시도합니다.");
				reserveStudyRoom(inputNumber, "Person 1");
			}

		});
		Thread person2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(inputNumber + "룸 예약을 시도합니다.");
				reserveStudyRoom(inputNumber, "Person 2");

			}

		});
	
	person1.start();
	person2.start();
	}

	protected static synchronized void reserveStudyRoom(int roomNumber, String person) {
		// 만약 studyRooms[roomNumber]가 true 가 아니라면 , 예약을 할 수있게 해주고,
		if(!studyRooms[roomNumber]) {
			studyRooms[roomNumber]= true;
			System.out.println(person + "님 " + roomNumber + "번 스터디룸 예약을 성공하였습니다.");
		}
		// 만약 studyRooms[roomNumber]가 true 라면 예약이 찬 상태이니 예약을 할 수 없다고 알려 주어야한다.
		else {
			System.out.println("죄송합니다 이미 예약마감 되었습니다.");
		}
	}

}
