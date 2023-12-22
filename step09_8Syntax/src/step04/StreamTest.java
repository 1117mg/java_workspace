package step04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		// Stream
		// step01 : 스트림 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(list1.stream());
		
		// step02 : 중간 연산
		List<String> fruitList = Arrays.asList("pineapple", "mango", "kiwi");
		fruitList.stream()
					.filter((fruit) -> fruit.contains("i"))
					.forEach((result) -> System.out.println(result));
		
		// for
//		for(String fruit : fruitList) {
//			if(fruit.contains("i")) {
//				System.out.println(fruit);
//			}
//		}
		
		System.out.println();
		
		// sorted
		fruitList.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(fruit -> System.out.println(fruit));
		
		System.out.println();
		
		// skip
		fruitList.stream()
					.skip(2)
					.forEach(fruit -> System.out.println(fruit));
		
		// step03 : 최종연산
		// 
		List<Integer> integerList2 = Arrays.asList(1, 3, 6, 1, 6, 2, 6, 20, 48, 4761, 354);
		integerList2.stream()
					.mapToInt(v -> v)
					.max();

		System.out.println();
		System.out.println(integerList2.stream()
										.mapToInt(v -> v)
										.average());
		
		System.out.println();
		// reduce
		System.out.println(Arrays.asList(1, 5, 9).stream()
								.reduce((v1, v2) -> v1 + v2)
								.get());
		
		
		System.out.println();
		// collect
		System.out.println(integerList2.stream()
										.collect(Collectors.counting()));
		
		
		
		
		
		System.out.println();
		// Optional
		// empty() : 빈 Optional 객체 생성
		Optional<String> opt1 = Optional.empty();
		System.out.println(opt1);
		
		// of(value / null) : null 이 아닌 데이터 생성 / *NPE 발생
		Optional<String> opt2 = Optional.ofNullable("java");
//		System.out.println(opt2.get());
		
		// ofNullable(value / null) : null 일 수도 있는 값이 들어가는 경우
		// null 이 들어가게 되면 Optional 빈 객체 생성
		
		// ifPresent() : Optional 객체 내부에 데이터가 존재하는 경우만 해당 결과값을 반환
		opt2.ifPresent((v) -> System.out.println(v));
		
		// orElse : 빈 Optional 라면 orElse 내부 파라미터로 받은 값이 반환
		//          값을 내부에 갖고 있는 Optional 라면 해당 보유 값을 반환
		
		System.out.println();
		System.out.println(opt2.orElse("기본값"));
		

		// orElseThrow : 파라미터로 Exception 객체 전달, 만약 null 아닐경우 해당 보유 객체값을 반환

		try {
			opt2.orElseThrow(() -> new Exception());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
