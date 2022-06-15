package day0518;

public class For5 {

	public static void main(String[] args) {

		// 1+(1+2)+(1+2+3)+(1+2+3+4)..(1+2+3..+10)
		
		// 이중 for문
//		int sum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
		
		
		// 단일 for문
		int sum = 0;
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i; // 1부터 i번째까지의 합계를 구해주는 역할
			total += sum; // ()들의 총 합계를 구하는 역할
			
		}
		System.out.println(total);
	}

}
