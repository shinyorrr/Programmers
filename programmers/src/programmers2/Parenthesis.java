package programmers2;

public class Parenthesis {

	public static void main(String[] args) {
		String s = "(()(";
		boolean answer = true;
		
		int cnt =0;
		
		if(s.indexOf("(") > s.indexOf(")")) {
			answer = false;
		}
		
		for(int i=0; i<s.length(); i++) {
			char character = s.charAt(i);
			if(character == '(') {
				++cnt;
			}else if(character == ')') {
				--cnt;
			}
		
			if(cnt<0) {
				answer = false;
			}
		}
		

		if(cnt!=0) {
			answer = false;
		}
		
		
	
	}

}
