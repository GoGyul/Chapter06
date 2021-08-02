package ch06_method_0802;

public class CarSpeedTest {

	public static void main(String[] args) {

		CarSpeed car = new CarSpeed(); // 인스턴스 생성
		car.keyOn(); // keyOn 함수 호출
		car.run(); // run 함수 호출
		int speed = car.getSpeed(); // getSpeed 함수를 불러내어 speed에 넣어줌.
		System.out.println("현재속도 :" +  speed);

	}

}
