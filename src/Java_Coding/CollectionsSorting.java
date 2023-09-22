package Java_Coding;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSorting {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("D");
		list.add("C");
		list.add("B");
		list.add("A");
      // Collections.sort(list);
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
	}
}