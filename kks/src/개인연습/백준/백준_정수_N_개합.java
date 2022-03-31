package 개인연습.백준;

public class 백준_정수_N_개합 {
    long sum(int[] a) {
		long sum = 0;	// a 배열 정수 합 변수
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}