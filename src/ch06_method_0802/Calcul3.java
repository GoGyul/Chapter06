package ch06_method_0802;

public class Calcul3 {

//	매서드 오버로딩!!  //
// 	생성자 오버로딩과 비슷하다.
//	하지만 매개변수의 타입, 갯수, 순서!! 가 달라야 한다.	
// 	이것은 저절로 컴파일이 된다.	
	
	double area(double width) {
		return width*width;
	}
	
//	area 메서드의 오버로딩 ! 매개변수의 갯수가 다르다. 
	double aera(double width, double height) {
		return width*height;
	}
	
}
