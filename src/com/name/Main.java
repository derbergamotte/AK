package com.name;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Students> markList = new ArrayList<>();
		Students ivanov = new Students("Ivanov", (int) (Math.random()*10+1));
		Students kovaliov = new Students("Kovaliov", (int) (Math.random()*10+1));
		Students kozlov = new Students("Kozlov", (int) (Math.random()*10+1));
		Students novikov = new Students("Novikov", (int) (Math.random()*10+1));
		Students zajcev = new Students("Zajcev", (int) (Math.random()*10+1));
		Students zhuk = new Students("Zhuk", (int) (Math.random()*10+1));
		Students morozov = new Students("Morozov", (int) (Math.random()*10+1));
		Students novik = new Students("Novik", (int) (Math.random()*10+1));
		Students mielnikov = new Students("Mielnikov", (int) (Math.random()*10+1));
		Students kozlovskij = new Students("Kozlovskij", (int) (Math.random()*10+1));
		markList.add(ivanov);
		markList.add(kovaliov);
		markList.add(kozlov);
		markList.add(novikov);
		markList.add(zajcev);
		markList.add(zhuk);
		markList.add(morozov);
		markList.add(novik);
		markList.add(mielnikov);
		markList.add(kozlovskij);
		markList.size();

		markList = remNeudMark(markList);
		printMark(markList);
	}
	
	public static List<Students> remNeudMark(List<Students> list) {
		for (int i=0; i<list.size(); i++) {
			Students student = new Students();
			student = list.get(i);
			if (student.getMark()==1||student.getMark()==2||student.getMark()==3||student.getMark()==4) {
				list.remove(i);
			}
			student = null;
		}
		return list;
	}
	public static void printMark(List<Students> list) {
		for (int i=0; i<list.size(); i++) {
			Students student = new Students();
			student = list.get(i);
			System.out.println(student.getName()+" "+student.getMark());
			student = null;
		}
	}
}
