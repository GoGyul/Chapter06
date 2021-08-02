package ch06_method_0802;

public class Car {

	int gas;
	
	
	// 리턴값이 없는 메서드 매개값을 받아서 gas 필드를 변경.
	void setGas(int gas){
		this.gas = gas;
		
	}
	
	boolean isLeftGas(){
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다");
		return true;
	}
	
	
	void run(){
		while(true) {
			if(gas>0) { // 가스가 있다면 밑에것 실행
				System.out.println("달린다" + gas);
				gas --;
//				int Thread.sleep(200);
			}else {
				System.out.println("멈춥니다. 가스 : "  + gas);
				return;  //메소드 실행 종료
			}
		}
	}
	
}
