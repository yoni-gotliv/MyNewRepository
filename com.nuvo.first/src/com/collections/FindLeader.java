package com.collections;

public class FindLeader {

	private static void findArrayLeaders(int arr[]) {
		if (arr == null || arr.length == 0) {
			System.out.println("Invalid Inputs");
			return;
		}
		int i = 0, len = 0, leader = 0;
		len = arr.length;
		leader = arr[len - 1];
		System.out.print(leader);
		for (i = len - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				System.out.print(" " + leader);
			}
		}
	}
	
	
	public static void main(String[] args){
		int arr[] = {12,15,8,10,5,3,4};
		findArrayLeaders(arr);
	}
}
