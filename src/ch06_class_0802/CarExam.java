package ch06_class_0802;

public class CarExam {

	public static void main(String[] args) {

		Car car2 = new Car("자가용");
		
		System.out.println(car2.color);
		
		Car car3 = new Car("자가용", "red");
		
		System.out.println(car3.model);
		System.out.println(car3.color);
		
	}

}
