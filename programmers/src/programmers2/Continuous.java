package programmers2;

public class Continuous {

	public static void main(String[] args) {
		int n = 15;
		int sum = 0;
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			sum = 0;
			sum+=i;
			if(sum==n) answer++;
			System.out.println("i="+i);
			for(int j=i+1; j<n; j++) {
				
				System.out.println("j="+j);
				sum= sum+j;
				System.out.println("sum="+sum);
				if(sum==n) {
					answer++;
					break;
				}
				else if(sum>n) {
					break;
				}
			}
		}

		//System.out.println("-----------------"+answer);
	}

}
