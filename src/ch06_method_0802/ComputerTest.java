package ch06_method_0802;

public class ComputerTest {

	public static void main(String[] args) {
		
//		sum1 == �迭�� ���� �Ű������� �޴� �޼���
//		sum2�� ���� �Ѱ��־����
		Computer cp = new Computer();
		
		int[] value = {312,512,2,152}; //sum1 �޼��带 ����ϱ� ���� �迭�� ����.
		
		int result = cp.sum1(value); //value��� �迭�� ������ �־��־�� ��, sum1���� �׷��� ����Ǿ���
		System.out.println(result);
		
		int result2 = cp.sum2(1,2,3,4,56); // sum2�޼���� ���� ����� ������ �־�� �ϱ� ������
		System.out.println(result2);	   // ��ó�� ����Ҽ� �ִ�.
		
		
//		�迭�� �Ű������� �޴� sum1�� ��ó�� new Ű����� �迭�� �����ؼ� ���޵� �����ϴ�.!
		int result3 = cp.sum1(new int[] {1,2,3,4}); 
		System.out.println(result3);
			
		int result4 = cp.sum1(new int[] {12,32,64,89,});
		System.out.println(result4);
		
		
		int[] arrrr = {2,3,4,5,6,67,8,8};
		cp.intlist = arrrr;
		System.out.println(cp.sum());
			
	}

}
