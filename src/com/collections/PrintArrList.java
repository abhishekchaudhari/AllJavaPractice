package com.collections;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintArrList {
	public static void main(String[] args){
		List<String> colorList = new ArrayList<>(Arrays.asList("red", "blue", "white"));
		System.out.println(colorList);
	}
}
