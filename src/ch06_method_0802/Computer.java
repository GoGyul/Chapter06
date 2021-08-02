package ch06_method_0802;

public class Computer {

	int[] intlist;
	
	int sum() {
		return arraySum(this.intlist);
	}
	
	
	// 배열을 직접 매개변수로 받는 메서드.
	// 이 경우에는 매개변수로 배열을 무조건 전달 받아야 하기 때문에
	// 배열을 생성해주어야 한다 !!
	int sum1(int[] value) { 
		int sum = 0;		 
		for(int i = 0; i < value.length; i++) {
			sum += value[i];
//			System.out.println(value[i]);
		}
		return sum;
	}
	
	// ... 키워드를 사용하면 값의 목록만 넘겨준다.
	// 이 메소드를 호출할때 값을 적어주어 넘겨주어야 한다.
	// computerTest 참고.!!
	
	int sum2(int ...values) {
		return arraySum(values);
	}
	
	
//	중복되는 코드를 다른 매서드를 생성하여 코드를 줄인다.
	int arraySum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	
	
	
}
