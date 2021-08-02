package ch06_method_0802;

public class CarSpeed {

	// 변수
	int speed;
	
	// speed를 리턴하는 함수!
	int getSpeed() {
		return speed;
	}
	
	// 단순 프린트 함수
	void keyOn() {
		System.out.println("시동 ON");
	}
	
	
	// 이 함수가 실행되면
	void run() {
		for(int i = 0; i < 100; i += 10) { //10씩 증가하는 for문
			speed = i; // i값을 speed로 넣음
			System.out.println("시속"+ i + "킬로로 질주중"); // 프린트.
		}
	}
	
}
