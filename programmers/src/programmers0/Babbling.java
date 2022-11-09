package programmers0;

public class Babbling {

	public static void main(String[] args) {
		String[] babbling = 
			{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int answer =0;
		
		for(int i=0; i<babbling.length;i++) {	
			babbling[i]=babbling[i].replace("aya", " ");
			babbling[i]=babbling[i].replace("ye", " ");
			babbling[i]=babbling[i].replace("woo", " ");
			babbling[i]=babbling[i].replace("ma", " ");
		
			if(babbling[i].matches("[^a-z]+")) {
				answer ++;
			}				
		}		
	}

}
