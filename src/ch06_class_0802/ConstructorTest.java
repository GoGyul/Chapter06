package ch06_class_0802;

public class ConstructorTest {

	String color;
	String gearType;
	int door;
	
	ConstructorTest(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	ConstructorTest(){
		this("white", "auto", 10);
	}
	
// 	�ٸ� �����ڸ� ȣ�� �غ���.
// 	this Ű���带 ����Ѵ�.
//	�Ű������� color �� �ް� ���� �� ������ ���� �ִ� �����ڿ��� �����´�.
//	this Ű����� �ݵ�� �� ���� �־�� �Ѵ�.	
	ConstructorTest(String color){
		this(color, "handle", 4);
	}
	
	
	ConstructorTest(String gearType, int door){
		this(gearType,  "Yellow" , door);
	}
	
	
	public void showInfo() {
		System.out.println(color + "= color"+ gearType + "= gearType" + door + "= door");
	}
	
	
	public static void main(String[] args) {
		
		
//		�Ű������� ��Ʈ�� �ϳ��� ���޹޴� ������ ȣ�� 
		ConstructorTest c1 = new ConstructorTest("blue"); 
		c1.showInfo(); 
		
		ConstructorTest c2 = new ConstructorTest("handle", 150);
		c2.showInfo();
		
		
		
		
	}

}
