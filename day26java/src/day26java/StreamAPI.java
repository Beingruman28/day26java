package day26java;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;
//import java.util.function.Consumer;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		/*for (int i = 0 ; i<6; i++) {
			System.out.println(values.get(i));
		}
        Iterator<Integer>  ivalues = values.iterator();
        while(ivalues.hasNext()) {
        	System.out.println(ivalues.next());
        	
        }
        for(int i : values) {
        	System.out.println(i);
        }
        values.forEach(i-> System.out.println(i));
        values.forEach(new Consumer<Integer>() { 
        	public void accept(Integer i) {
        		System.out.println(i);
        	}
        });*/
        values.forEach(System.out::println);
	}
}