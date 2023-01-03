package programmers2;

public class binayZeroCount {

	public static void main(String[] args) {
		String s = "110010101001";
				
		int zeroCnt = 0;
		int cnt=0;
		
		do {
			for(int i=0; i<s.length(); i++) {
				char zero = s.charAt(i);
				if(zero=='0') {
					zeroCnt++;
				}
			}
			s = s.replaceAll("0", "");			
			s = Integer.toBinaryString(s.length());
			cnt++;

		}while(!s.equals("1"));
		
		System.out.println("[" + cnt + "," + zeroCnt + "]");
	}

}
