package ch06_method_0802;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.setGas(5); //가스의 갯수
		
//		isLeftGas 매서드 호출, 가스의 유무 확인.
		boolean isGetGas = car.isLeftGas(); // true, false로 확인
		if(isGetGas) {
			System.out.println("달립니다.");
			car.run(); // true상태라면 run 메서드 계속해서 실행
		}
		
		
		// isLeftGas를 호출, true, false로 확인		
		if(car.isLeftGas()) { 
			System.out.println("달릴수 있습니다.");
		}else {
			System.out.println("연료를 넣으셈");
		}
	
		
	}

}
