package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 通过Collections对一个整数类型的集合进行排序
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(9);
		al.add(6);
		al.add(4);
		al.add(8);
		Collections.sort(al);
		System.out.println(al);
	}
}
