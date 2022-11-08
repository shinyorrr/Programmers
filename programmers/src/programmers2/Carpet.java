package programmers2;

public class Carpet {

	public static void main(String[] args) {
		
		int brown = 24;
		int yellow = 24;
		int[] answer = new int[2];
		for(int i=1; i<Math.sqrt(yellow); i++) {
			if(yellow%i==0) {
				int j = yellow/i;
				if(((j+i+4)*2-4)==brown) {
					
					answer[0] = j+2;
					answer[1] = i+2;
					
				}
			}
		}
		
			System.out.println(answer[0]);
			System.out.println(answer[1]);


	}

}
