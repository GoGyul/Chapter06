package ch06_method_0802;

public class Calcul {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		if(x==0 || y==0) {
			System.out.println("0은 사용할수 없습니다.");
			 
		}
		double result = (double)x/ (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 껍니다.");
	}
	
	
}
