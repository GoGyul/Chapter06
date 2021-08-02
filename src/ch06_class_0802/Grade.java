package ch06_class_0802;

import java.util.Scanner;

public class Grade {

	int math;
	int science;
	int english;
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	
	public int av() {
		return (math + science+ english)/3;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("과목별 점수 입력");
		int math = scn.nextInt();
		int science = scn.nextInt();
		int english = scn.nextInt();
		
		Grade myGrade = new Grade(87,64,50);
		System.out.println(myGrade.av());
		
		
	}

}
