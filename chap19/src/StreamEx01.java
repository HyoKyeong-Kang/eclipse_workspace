import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		list.add("신길동");
		
		for (String li : list) {
			System.out.println(li);
		}
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
