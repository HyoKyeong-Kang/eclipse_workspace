package list;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	String command;
	String to;
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
}
public class Queue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue Collection 생성 - interface
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김기역"));
		messageQueue.offer(new Message("sendKakaotalk", "나니은"));
		
		//메세지를 하나씩 꺼내어 처리
		while(!messageQueue.isEmpty()) {//비어있지 않다면
			//isEmpty() 비어있으면 true -> 조건에 not(!)연산자를 붙였기 때문에 - 비어있는 경우라면 조건문 실행될 수 X
			//!true => false  // !false=>true 
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail" :
				System.out.println(message.to +"님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to +"님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to +"님에게 Kakaotalk을 보냅니다.");
				break;
			}
		}
	
	}
	

}
