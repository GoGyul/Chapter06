package ch06_method_0802;

public class CarSpeedTest {

	public static void main(String[] args) {

		CarSpeed car = new CarSpeed(); // �ν��Ͻ� ����
		car.keyOn(); // keyOn �Լ� ȣ��
		car.run(); // run �Լ� ȣ��
		int speed = car.getSpeed(); // getSpeed �Լ��� �ҷ����� speed�� �־���.
		System.out.println("����ӵ� :" +  speed);

	}

}
