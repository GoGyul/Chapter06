package ch06_method_0802;

public class CarSpeed {

	// ����
	int speed;
	
	// speed�� �����ϴ� �Լ�!
	int getSpeed() {
		return speed;
	}
	
	// �ܼ� ����Ʈ �Լ�
	void keyOn() {
		System.out.println("�õ� ON");
	}
	
	
	// �� �Լ��� ����Ǹ�
	void run() {
		for(int i = 0; i < 100; i += 10) { //10�� �����ϴ� for��
			speed = i; // i���� speed�� ����
			System.out.println("�ü�"+ i + "ų�η� ������"); // ����Ʈ.
		}
	}
	
}
