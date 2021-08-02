package ch06_class_0802;

public class Tv {

	String brand;
	int year;
	int inch;
	
	Tv(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void showTvInfo() {
		System.out.println(brand+"에서 만든" + year + "년형" + inch + "Tv" );
	}
	
	public static void main(String[] args) {
		 
		Tv tv = new Tv("현대", 2017, 32);
		
		tv.showTvInfo();
		

	}

}
