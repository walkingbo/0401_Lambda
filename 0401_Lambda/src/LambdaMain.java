import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {
		// Student 클래스의 인스턴스 List를 생성
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "문정원", 46));
		list.add(new Student(2, "배유나", 66));
		list.add(new Student(3, "안유진", 96));
		list.add(new Student(4, "사나", 86));
		list.add(new Student(5, "문별", 70));
		list.add(new Student(6, "모모", 88));
		list.add(new Student(7, "하니", 59));
		list.add(new Student(8, "이지금", 79));
		list.add(new Student(9, "박소영", 99));

		// 위의 데이터를 이름 순으로 정렬
		// 데이터를 정렬하고자 하면 객체를 비교할 수 있는 메소드가 필요
		// 1.7이전 까지에서는 함수형 프로그래밍이 지원되지 않았기 때문에
		// 객체를 비교할 수 있는 메소드를 객체에 저장해서 전달

			//Collections.sort(list, new Comparator<Student>() {
		
			/*
			 * @Override public int compare(Student o1, Student o2) { 
			 * return o1.getScore() -o2.getScore(); 
			 * } 
			 * });
			 */

			/*
			 * @Override public int compare(Student o1, Student o2) { 
			 * return o2.getNum()-o1.getNum(); 
			 * } 
			 * });
			 */

			/*
			 * @Override public int compare(Student o1, Student o2) { 
			 * return o2.getName().compareTo(o1.getName()); 	
			 * } 
			 * });
			 */
			
			
			/*위의 경우 실제로 필요한 것은 데이터를 비교하기 위한 메소드 1개인데,	
			 * 메소드 단위로 대입이 안되기 때문에 new를 이용해서 인스턴스를 생성하고 메소드를
			 * 구현해서 대입
			 * 1.7에서부터는 메소드가 한 개인 인터페이스에 한해서 람다 표현식으로 메소드만 대입이 가능
			 */
		
		Collections.sort(list,(Student o1, Student o2)->{
			return o1.getScore() -o2.getScore();
		});
			
			
		// 데이터를 정렬해서 출력
		/*
		for (Student student : list) {
			System.out.printf("%s\n", student);
		}
		*/
		
		//forEach는 매개변수가 1개이고 리턴타입이 void인 메소드를 
		//매개변수로 받아서 리스트 내의 모든 데이터들을 메소드에 대입한 후
		//호출해서 실행한다.	
		
		//forEach 메소드의 매개변수가 Consumer 인터페이스 타입입니다. 	
		//Consumer 인터페이스는 void accept(T t)메소드 1개만 소유
		//Consumer 인터페이스를 implemets 한 객체를 만들어서 대입가능
		//메소드가 1개만 있으므로 람다 식을 이용해서 작성해서 대입가능
		//accept 와 동일한 원형의 메소드를 대입가능->System.out::println
		list.forEach(System.out::println);
		
		
	}

}
