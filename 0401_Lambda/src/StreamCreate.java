import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {

	public static void main(String[] args) {

		// 문자열 배열 만들기
		String[] ar = { "java", "javascript", "swift", "java", "Java" };
		Stream<String> stream1 = Arrays.stream(ar);
		// stream1.forEach(System.out::println);

		// 첫번 째를 제외한 나머지 데이터 가져오기
		// stream1.skip(1).forEach(System.out::println);

		// skip과 limit를 이용해서 1개의 데이터를 건너 뛰고 2개의 데이터 가져오기
		// stream1.skip(1).limit(2).forEach(System.out::println);

		// 중복제거 equals 메소드 이용: 대소문자 구분한다. equals	가 true이면 안나오게 한다.
		 stream1.distinct().forEach(System.out::println);
		
		/*
		// filter를 이용해서 5글자 이상인 데이터만 추출
		stream1.filter((language) -> {
			return language.length() >= 5;
		}).forEach(System.out::println);
		*/
		
		System.out.printf("==============\n");

		// 문자열 list 생성
		List<String> list = new ArrayList<>();
		list.add("oracle");
		list.add("mysql");
		list.add("mongodb");
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		System.out.printf("==============\n");

		// 정수 범위를 가지고 만들기
		IntStream stream3 = IntStream.range(10, 15);
		stream3.forEach(System.out::println);

		// 데이터를 2개씩 연속해서 출력
//		int size = ar.length;
//		
//		for(int i=0;i<=size/2;i=i+1) {
//			stream1 = Arrays.stream(ar);
//		stream1.skip(2*i).limit(2).forEach(System.out::println);
//		System.out.printf("==============\n");
//		} 내가 한것.

		int size = ar.length;
		// 데이터를 2개씩 출력
		int cnt = 2; // 한페이지에 출력할 데이터 개수
		int page = 0; // 현재 출력중인 페이지번호
		while (true) {
			stream1 = Arrays.stream(ar);// 스트림을 생성
			// 페이지 번호에 해당하는 데이터 개수 만큼 건너띄면서 cnt만큼 출력
			stream1.skip(page * 2).limit(cnt).forEach(System.out::println);
			// page번호 1증가
			page = page + 1;
			// 페이지 번호가 전체 페이지 개수보다 많으면 종료
			if (page >size /cnt) {
				break;
			}
		}

	}

}
