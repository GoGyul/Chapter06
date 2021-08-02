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
	
// 	다른 생성자를 호출 해보자.
// 	this 키워드를 사용한다.
//	매개변수로 color 를 받고 남은 두 변수는 위에 있는 생성자에서 가져온다.
//	this 키워드는 반드시 맨 위에 있어야 한다.	
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
		
		
//		매개변수로 스트링 하나만 전달받는 생성자 호출 
		ConstructorTest c1 = new ConstructorTest("blue"); 
		c1.showInfo(); 
		
		ConstructorTest c2 = new ConstructorTest("handle", 150);
		c2.showInfo();
		
		
		
		
	}

}
