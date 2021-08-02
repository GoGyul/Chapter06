package ch06_method_0802;

public class Calcul2 {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		// plus 메서드 호출!!
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		// 메서드에서 또다른 매서드 호출,  avg 메서드! 
		double result = avg(7,3); 
		print("실행결과 : " + result);
	}
	
	void print(String message) {
		System.out.println(message);
	}
	
	
	
}
