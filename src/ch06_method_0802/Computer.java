package ch06_method_0802;

public class Computer {

	int[] intlist;
	
	int sum() {
		return arraySum(this.intlist);
	}
	
	
	// �迭�� ���� �Ű������� �޴� �޼���.
	// �� ��쿡�� �Ű������� �迭�� ������ ���� �޾ƾ� �ϱ� ������
	// �迭�� �������־�� �Ѵ� !!
	int sum1(int[] value) { 
		int sum = 0;		 
		for(int i = 0; i < value.length; i++) {
			sum += value[i];
//			System.out.println(value[i]);
		}
		return sum;
	}
	
	// ... Ű���带 ����ϸ� ���� ��ϸ� �Ѱ��ش�.
	// �� �޼ҵ带 ȣ���Ҷ� ���� �����־� �Ѱ��־�� �Ѵ�.
	// computerTest ����.!!
	
	int sum2(int ...values) {
		return arraySum(values);
	}
	
	
//	�ߺ��Ǵ� �ڵ带 �ٸ� �ż��带 �����Ͽ� �ڵ带 ���δ�.
	int arraySum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	
	
	
}
