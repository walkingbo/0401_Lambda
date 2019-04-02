import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		// 문자열 배열 만들기 - 초기 데이터를 가지고 생성
		String[] ar = { "설현	", "혜리", "수지" };
		
		/*
		int size = ar.length;
		for (int i = 0; i < size; i = i + 1) {
			//배열에서 데이터를 가져올 때는 [인덱스]	
			System.out.printf("%s\n", ar[i]);
		}
		 */
		
		// 문자열 List 생성
		List<String> list = new ArrayList<>();
		list.add("김홍도");
		list.add("안창호");
		list.add("김병연");
		
		/*
		size = list.size();
		for (int i = 0; i < size; i = i + 1) {
			//List에서 데이터를 가져올 때는 get(인덱스)	
			System.out.printf("%s\n", list.get(i));
		}
		*/
		
		//베열이나 List, Set은 동일한 자료형의 모임
		//베열이나 List, Set은 특정 위치의 데이터만 접근하는 경우는 드뭄
		//Iterator를 이용한 빠른열거를 이용하면 3개의 자료구조의 데이터에
		//동일한 방법으로 접근이 가능
		
		/*
		//데이터 정렬
		//배열은 Arrays.sort 메소드를 이용해서 정렬이 가능
		Arrays.sort(ar);
		//List는 Collections.sort 메소드를 이용해서 정렬이 가능
		Collections.sort(list);
		
		for(String imsi : ar) {
			System.out.printf("%s\n",imsi);
		}
		System.out.printf("====================\n");
		
		for(String imsi : list) {
			System.out.printf("%s\n",imsi);
		}
		*/
		
		
		//배열과 List를 가지고 Stream을 생성
		Stream<String>st1=Arrays.stream(ar);
		Stream<String>st2=list.stream();
		//정렬해서 출력
		st1.sorted().forEach(System.out::println);
		st2.sorted().forEach(System.out::println);
		
		
	}

}
