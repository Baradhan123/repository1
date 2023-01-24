package Testng;

public class stringprogram {

public static void main(String[] args) {
	String s="Welcooomeee to Javaaa";
	int count=0;
	char[] charArray = s.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if (charArray[i]=='e') {
			count++;
			if (count==3) {
				System.out.println(i);
			}
		}
	}
}
}
