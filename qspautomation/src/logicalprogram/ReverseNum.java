package logicalprogram;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int n = sc.nextInt();
		 int reverseno=0;
		 while (n>0) 
		 {
			 int a=n%10;
			 reverseno=reverseno*10+a;
			 n=n/10;
		}
		 System.out.println(reverseno);
		 
	}

}
