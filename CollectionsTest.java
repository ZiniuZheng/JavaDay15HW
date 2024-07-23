package homework;

import java.util.*;
/*
 * 模拟斗地主发牌
 * 
 * 买牌
 * 洗牌
 * 发牌
 */
public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<String> box = new ArrayList<String>();
		String arr[] = {"黑桃", "红桃", "梅花", "方片"};
		String arr2[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				box.add(arr[i] + arr2[j]);
			}
		}
		box.add("小王");
		box.add("大王");
		System.out.println(box);
		
		Collections.shuffle(box);
		System.out.println(box);
		
		ArrayList<String> 周杰伦 = new ArrayList<String>();
		ArrayList<String> 林俊杰 = new ArrayList<String>();
		ArrayList<String> 王力宏 = new ArrayList<String>();
		
		for(int i=0;i<box.size()-3;i++) {
			if(i % 3 == 0) {
				周杰伦.add(box.get(i));
			}else if(i % 3 == 1) {
				林俊杰.add(box.get(i));
			}else if(i % 3 == 2) {
				王力宏.add(box.get(i));
			}
		}
		System.out.println("周杰伦: "+周杰伦);
		System.out.println("林俊杰: "+林俊杰);
		System.out.println("王力宏: "+王力宏);
		
		System.out.println("底牌: ");
		for(int i=box.size()-3;i<box.size();i++) {
			System.out.println(box.get(i));
		}
	}
}
