package ch06_method_0802;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.setGas(5); //������ ����
		
//		isLeftGas �ż��� ȣ��, ������ ���� Ȯ��.
		boolean isGetGas = car.isLeftGas(); // true, false�� Ȯ��
		if(isGetGas) {
			System.out.println("�޸��ϴ�.");
			car.run(); // true���¶�� run �޼��� ����ؼ� ����
		}
		
		
		// isLeftGas�� ȣ��, true, false�� Ȯ��		
		if(car.isLeftGas()) { 
			System.out.println("�޸��� �ֽ��ϴ�.");
		}else {
			System.out.println("���Ḧ ������");
		}
	
		
	}

}
