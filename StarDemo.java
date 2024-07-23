package homework;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/*
 * 创建Star明星这个类，名字相同我们认为是同一个明星，键盘录入若干个名字，通过名字创建明星
 * 然后将明星存储到适当的集合中，保证明星的唯一性
 */
public class StarDemo {

	public static void main(String[] args) {
		Set<Star> hs = new HashSet<Star>();
		Star s1 = new Star("王力宏");
		Star s2 = new Star("林俊杰");
		Star s3 = new Star("周杰伦");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		for(Star s: hs) {
			System.out.println(s);
		}
	}
}

class Star{
	String name;

	public Star(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Star other = (Star) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Star [name=" + name + "]";
	}
	
}
