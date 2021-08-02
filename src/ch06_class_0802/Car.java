package ch06_class_0802;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model, "shiver, 250");
	}
	
	Car(String model, String color){
		this(model , color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
