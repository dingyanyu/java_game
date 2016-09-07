//package com.lincaiming;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		float arr[]={3, 6, 7.1f, 1.1f, 3};
		float all = 0;
		
		for(int i=0; i < arr.length; i++){
			
			all += arr[i];
		}
		System.out.println("平均时间:"+(all/arr.length));
	}

	
}
