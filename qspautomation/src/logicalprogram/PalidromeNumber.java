package logicalprogram;

public class PalidromeNumber {
	public static void main(String[] args) {
		int a=122;
		int b=a;
		int reverse=0;
		while (a>0) {
			int c=a%10;
			reverse=reverse*10+c;
			a=a/10;
			
		}
		System.out.println(reverse);
		if (reverse==b) {
			System.out.println("its palidrome number");
			
		}
		else {
			System.out.println("its not  palidrome number");
		}
	}

}
