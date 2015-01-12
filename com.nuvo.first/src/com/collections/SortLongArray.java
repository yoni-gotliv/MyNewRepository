package com.collections;

import java.util.Arrays;

public class SortLongArray {

	
	public static void main(String[] args) {
        int[] input = {4, 1, 4, 5, 512, 6, 1, 3, 754, 5, 523, 67, 51, 8, 9, 345, 599, 2032, 2011, 300, 12};
        int[] counts = new int[2048];
        for (int i = 0; i < 2048; i++) {
            counts[i] = 0;
        }

        for (int number : input) {
            counts[number]++;
        }

        int ptr = 0;
        for (int count = 0; count < 2048; count++) {
            for (int i = 0; i < counts[count]; i++) {
                input[ptr] = count;
                ptr++;
            }
        }
        System.out.println(Arrays.toString(input));
    }
	
}
