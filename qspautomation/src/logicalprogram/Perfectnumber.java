package logicalprogram;

import java.util.Scanner;

public class Perfectnumber {

	 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	for (int i = 1; i < a; i++) {
		if (a%i==0) {
			sum = sum+i;	
		}
	}
	if (a==sum) {
		System.out.println("its perfect no");
		
		
	}
	else {
		System.out.println("its not perfect no");
	}
}

}
