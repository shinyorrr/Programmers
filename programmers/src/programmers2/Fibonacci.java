package programmers2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		int n =5;
		int[] array = new int[n+1];
		array[0]=0;
		array[1]=1;
		for(int i=2; i<=5; i++){
			array[i]=array[i-1]+array[i-2];
		}
		

	}

}
