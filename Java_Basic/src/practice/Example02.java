package practice;

/*
 * 1~10까지 홀수를 출력하시오.
 * 
 * logic: 홀수는 2n-1의 성질을 지녔다.
 */

public class Example02 {
	public static void main(String[] args) {
		for (int i=1; i<=10; i+=2) { // i를 1부터 2씩 증가하여 홀수로 출력한다. 
			System.out.println(i);
		}
	}
}