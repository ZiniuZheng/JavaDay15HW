package homework;

import java.util.*;
/*
 * String s = "sdfkhew24353dsvifsougfouu";
 * 计算每个字符出现的次数，通过两种方式遍历Map
 */
public class MapDemo {

	public static void main(String[] args) {
		//创建Map对象
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		String s = "sdfkhew24353dsvifsougfouu";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}else {
				int num = hm.get(c)+1;
				hm.put(c, num);
			}
		}
		
		//遍历Map对象
		//方式1: 获取所有的key，通过key来获取value
		Set<Character> keys = hm.keySet();
		for(char key: keys) {
			int value = hm.get(key);
			System.out.println(key + "---" + value);
		}
		
		//方式2: 获取所有的entry对象
		Set<Map.Entry<Character, Integer>> entrys = hm.entrySet();
		for(Map.Entry<Character, Integer> entry: entrys) {
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + "---" + value);
		}
	}
}
