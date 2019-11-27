package com.name.testCreateNewFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		Date date1 = new Date();
		File file = new File("d:\\date.txt");
		
		date = getDate();
		System.out.println(checkParDate(date));
		
		writeDateInFile(date, file);
		date1 = readDateFromFile(file);
		System.out.println(date1);
	}
	
	public static boolean checkParDate (Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);	
		return calendar.get(Calendar.DAY_OF_YEAR)%2==0;
	}
	
	public static Date getDate() {
		System.out.println("¬ведите дату в формате: dd.MM.yyyy");
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Scanner scaner = new Scanner(System.in);
		String string = scaner.nextLine();
		scaner.close();
		try {
			date = format.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static void writeDateInFile(Date date, File file) {
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		try {
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write(format.format(date));
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 	
	}

	public static Date readDateFromFile(File file) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		try (BufferedReader bf = new BufferedReader(new FileReader(file))){
			date = format.parse(bf.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
