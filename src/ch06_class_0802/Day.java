package ch06_class_0802;

import java.util.Scanner;

public class Day {

	String work;
	
	
	
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public void show() {
		if(work == null) {
			System.out.println("할일이 없습니다.");
		}else {
			System.out.println(work + " 하거라 ");
		}
	}



	public static void main(String[] args) {

	}

}


