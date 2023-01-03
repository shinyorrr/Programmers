package programmers2;

public class WordRelay {

	public static void main(String[] args) {
		int answer =0;
		int n = 78;
		int cnt =0;
		String binary = Integer.toBinaryString(n);
		for(int i=0; i<binary.length(); i++) {
			if(binary.charAt(i)=='1') {
				cnt++;
			}
		}
		
		for(int i=n+1 ; i<1000000; i++) {
			int count =0;
			String s =Integer.toBinaryString(i);
			for(int j=0; j<s.length();j++) {
				if(s.charAt(j)=='1') {
					count++;
				}
			}if(count==cnt) {
				answer = i;
				break;
			}				
		}
		System.out.println(answer);

	}

}
