package logicalprogram;

public class ReverseString {
	public static void main(String[] args) {
		String s="pandurang kashinath kale";
	
		String s2=" ";
		String[] d =s.split(s2);
		for (int i = d.length-1; i>=0; i--) {
System.out.print(d[i]);			
		}
	}

}
