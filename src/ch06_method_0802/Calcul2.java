package ch06_method_0802;

public class Calcul2 {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		// plus �޼��� ȣ��!!
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		// �޼��忡�� �Ǵٸ� �ż��� ȣ��,  avg �޼���! 
		double result = avg(7,3); 
		print("������ : " + result);
	}
	
	void print(String message) {
		System.out.println(message);
	}
	
	
	
}
