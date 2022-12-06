package com.basicprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyAllFromArr1to2 {
	public static void main(String[] args){
		int [] arr1 = new int[]{1,2,3,4,5};
		int [] arr2 = new int[arr1.length];
		List<Integer> arrL = new ArrayList<>(Arrays.asList());
	
		for(int i= 0; i< arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}

		for(int i = 0 ; i< arr2.length; i++){
			System.out.print(arr2[i]);
		}
	}
	


}

//IMP
//	List<Integer> arr = new ArrayList<Integer>(List.of(4,5,69,78));
//	List<Integer> arr1 = new ArrayList<>(Arrays.asList(5,56,45,9));
//	int[] arr2 = {4,6,8};
//	int[] arr3 = new int[]{7,7,7};
