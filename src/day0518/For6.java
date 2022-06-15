package day0518;

public class For6 {

	public static void main(String[] args) {
		
		/* 1 +(-2) + 3 + (-4) + 5 + (-6) +..과 같은 식으로
		 * 계속 더해나갔을 때,
		 * 몇까지 더 해야 총합이 100 이상 되는지 구하시오. */
		
//		int i;
//		int sum = 0;
		
//		int i = 1;
//		for (;;) {
//			if(i%2==1) {
//				sum += i;
//			} else {
//				sum -= i;
//			}
//			if(sum>=100)
//				break;
//			i++;
//		}
		
//		for (i=1; true; i++) {
//			if(i%2==1) {
//				sum += i;
//			} else {
//				sum -= i;
//			}
//			if(sum>=100)
//				break;
//		}
//		System.out.println(i);
//		System.out.println(sum);
		
		
//		-----------------------
		
		int s = 1; // 부호를 바꾸기 위한 변수
		int num = 0;
		int sum = 0;
		
		// 무한반복
		for (int i=1; true; i++) {
			num = i * s; // i와 부호(s)를 곱해서 더할 값 구하기
			sum += num;
			s *= -1; // s에 -1을 곱하여 1, -1, 1, -1이 되도록 설정 
			
//		for (int i=1; true; i++, s=-s) {
//			num = i * s;
//			sum += num;
			 
			if(sum>=100) { // 총합이 100 이상이면 반복문에서 탈출
				break;
			}
		}
		System.out.println(num);
		
		

	}

}
