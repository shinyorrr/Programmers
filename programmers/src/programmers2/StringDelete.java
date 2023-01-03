package programmers2;

public class StringDelete {

	public static void main(String[] args) {
		String s = "baabaa";
		int answer = -1;
		String string="";
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) != s.charAt(i+1)){
				string = string + s.charAt(i);			
			}else {
				if(i==s.length()-2) {
					s= string;
				}else {
					s = string + s.substring(i+2);
				}
			} 
			System.out.println("i-->"+i);
			System.out.println("string-->"+string);
			
			
		}
		System.out.println("string-->" + string);
	}

}
