package day0518;

public class For3 {

	public static void main(String[] args) {
		
//		System.out.println("a\tbcde");
	
		// 1
//		for(int i=2; i<=9; i++) {
//			System.out.print(i + "단\t\t");
//		}
//		
//		System.out.println(); // 줄바꿈
//		
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.printf("%d X %d = %d\t", j, i, j*i);
//			}
//			System.out.println();
//		}

		
		// 2
		for(int i=0; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(i == 0) {
					System.out.print(j + "단\t\t");
				} else {
					System.out.printf("%d X %d = %d\t", j, i, j*i);
				}
			}
			System.out.println(); // 줄바꿈
		}
	}

}
