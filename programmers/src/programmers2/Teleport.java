package programmers2;

public class Teleport {

	public static void main(String[] args) {
		int n = 5;
		int cnt = 0;
		while(n>0) {
			if(n%2!=0) {
				cnt++;
			}
			n=n/2;
		}
		System.out.println(cnt);
		System.out.println(n);
	}

}
