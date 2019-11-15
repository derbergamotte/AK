package com.name.test27;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<40; i++) {
			int x=(int) (Math.random()*10);
			list.add(x);
		}
		Set<Integer> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);

	}

}
