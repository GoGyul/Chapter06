package ch06_method_0802;

public class ComputerTest {

	public static void main(String[] args) {
		
//		sum1 == 배열을 직접 매개변수로 받는 메서드
//		sum2는 값을 넘겨주어야함
		Computer cp = new Computer();
		
		int[] value = {312,512,2,152}; //sum1 메서드를 사용하기 위해 배열을 생성.
		
		int result = cp.sum1(value); //value라는 배열을 값으로 넣어주어야 함, sum1에서 그렇게 선언되었음
		System.out.println(result);
		
		int result2 = cp.sum2(1,2,3,4,56); // sum2메서드는 값의 목록을 전달해 주어야 하기 떄문에
		System.out.println(result2);	   // 이처럼 사용할수 있다.
		
		
//		배열을 매개변수로 받는 sum1에 이처럼 new 키워드로 배열을 생성해서 전달도 가능하다.!
		int result3 = cp.sum1(new int[] {1,2,3,4}); 
		System.out.println(result3);
			
		int result4 = cp.sum1(new int[] {12,32,64,89,});
		System.out.println(result4);
		
		
		int[] arrrr = {2,3,4,5,6,67,8,8};
		cp.intlist = arrrr;
		System.out.println(cp.sum());
			
	}

}
