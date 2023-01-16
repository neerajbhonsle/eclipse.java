package com.xworkz.boot;

import java.util.Arrays;
import java.util.*;



public class ArrayRev {

	public static void main(String[] args) {
		Integer ref1[]= {1,3,4,6,2};
		System.out.println("Original Array : "
                + Arrays.toString(ref1));
        Collections.reverse(Arrays.asList(ref1));
        System.out.println("Modified Array : "
				+ Arrays.toString(ref1));        

		
		


	}

}
