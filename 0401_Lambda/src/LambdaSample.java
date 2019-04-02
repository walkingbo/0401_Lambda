//인터페이스 : 추상메소드(메소드 원형만 있는 경우) 와 final 변수 만을 가진 개체
//추상메소드는 상속받은 클래스에서 재정의(Overriding) 해서 사용한다.	
interface LambdaSample1{
	public void method();
}

//매개변수가 1개인 인터페이스
interface LambdaSample2{
	public void method2(int x);
}

interface LambdaSample3{
	public int method3(int x);
}


public class LambdaSample {

	public static void main(String[] args) {
		//매개변수가 없을 때는 () 생략못함
		//실행문장이 한줄이면 { } 생략가능
		LambdaSample1 ob1 = ()->{
			System.out.printf("매개변수와 리턴이 없는 메소드\n");
		};
		ob1.method();
		
		
		//람다에서는 실행할 때 메소드의 모양이 결정되기 때문에 
		//매개변수의 자료형을 생략해도 된다.	
		
		//매개변수가 1개일 때는 () 생략 가능
		//처리 구문이 한 줄이면 { } 생략 가능
		LambdaSample2 ob2 =x->System.out.printf("x:%s\n", x);
		ob2.method2(100);
		
		//리턴이 있는 경우에는 마지막 문장으로 return을 추가해주면 됩니다. 	
		LambdaSample3 ob3 = x -> {
			int result = x * x;
			return result;
		};
		System.out.printf("결과: %d\n",ob3.method3(20));
		
	}

}
