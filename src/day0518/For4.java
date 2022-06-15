package day0518;

public class For4 {

	public static void main(String[] args) {

		/* 1부터 20까지의 정수 중에서
		 * 2의 배수가 아니면서 3의 배수가 아닌 수의 총 합계와 개수를 출력 */

		int sum = 0;
		int count =0;
		
		for (int i=1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum += i;
				count++;
//				System.out.println(i);
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("count : " + count);
	}

}
