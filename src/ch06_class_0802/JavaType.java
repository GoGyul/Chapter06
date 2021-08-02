package ch06_class_0802;

public class JavaType {

	public static void main(String[] args) {
		
		int iv = 10;
		double dv = 10.0;
		
		int [] ar0;
		ar0 = new int[2];
		
		int[] ar1 = new int[3];
		
		int[] ar2 = new int[2];
		ar2[1] = 10;
		
		
		System.out.println(ar0);
		System.out.println(ar1);
		System.out.println(ar2);
		
		int[][] arrs = new int[3][];
		
		arrs[0] = ar0;
		arrs[1] = ar1;
		arrs[2] = ar2;
		
		System.out.println(arrs[0]);
		
		
		for(int i = 0; i<arrs.length; i++) {
			for (int k = 0; k<arrs[i].length; k++) {
				System.out.println(arrs[i][k]+" , " +"i :"+ i + ", k : "+ k);
			}
		}
		
		
		
		
		
		
		
	}
	
}
