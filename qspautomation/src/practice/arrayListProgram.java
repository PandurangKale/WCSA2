package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.SizeSequence;





public class arrayListProgram {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
        a.add(1);
        a.add(5);
        a.add(6);
        a.add(2);
        a.add(4);
        a.add(3);
        Collections.sort(a);
        System.out.println(a);
       Collections.reverse(a);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.contains(4);
        System.out.println( a.get(3));
        System.out.println(a.size());
        

   
        
		
	}

}
