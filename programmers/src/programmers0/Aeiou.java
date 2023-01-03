package programmers0;

public class Aeiou {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		my_string = my_string.replaceAll("[aeiou]", "");
		System.out.println(my_string);
	}

}
