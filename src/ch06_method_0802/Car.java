package ch06_method_0802;

public class Car {

	int gas;
	
	
	// ���ϰ��� ���� �޼��� �Ű����� �޾Ƽ� gas �ʵ带 ����.
	void setGas(int gas){
		this.gas = gas;
		
	}
	
	boolean isLeftGas(){
		if(gas == 0) {
			System.out.println("������ �����ϴ�.");
			return false;
		}
		System.out.println("������ �ֽ��ϴ�");
		return true;
	}
	
	
	void run(){
		while(true) {
			if(gas>0) { // ������ �ִٸ� �ؿ��� ����
				System.out.println("�޸���" + gas);
				gas --;
//				int Thread.sleep(200);
			}else {
				System.out.println("����ϴ�. ���� : "  + gas);
				return;  //�޼ҵ� ���� ����
			}
		}
	}
	
}
