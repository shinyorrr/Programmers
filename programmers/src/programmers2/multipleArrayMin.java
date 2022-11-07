package programmers2;

import java.util.Arrays;
import java.util.Comparator;

public class multipleArrayMin {

	public static void main(String[] args) {
		int answer =0;
		int A[] = {1, 3, 5};		
		int B[] = {2, 6, 8};
		Integer b[] = Arrays.stream(B).boxed().toArray(Integer[]::new);
		Arrays.sort(A);
		Arrays.sort(b, Comparator.reverseOrder());
		
		
		for(int i=0; i<A.length; i++) {
			answer+=A[i]*b[i];
		}

	}

}
