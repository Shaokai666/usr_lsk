package aaa;

import java.util.ArrayList;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(90);
		list1.add(112);
		list1.add(156);
		list1.add(34);
		list1.add(145);
		int max = max(list1);
		int min = min(list1);
		System.out.println("数组："+list1);
		System.out.println("最大值为："+max);
		System.out.println("最小值为："+min);
	}
	public static int max(ArrayList arr) {
		int max=(int)arr.get(0);
		for(int i=0;i<arr.size()-1;i++){
			if(max < (int)arr.get(i)){
			max=(int)arr.get(i);
			}
		}
		return max;
	}
	public static int min(ArrayList arr) {
		int min=(int)arr.get(0);
		for(int i=0;i<arr.size()-1;i++){
			if(min > (int)arr.get(i)){
			min=(int)arr.get(i);
			}
		}
		return min;
	}

}
