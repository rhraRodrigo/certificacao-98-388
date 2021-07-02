package com.rodrigo.certificacao98388.questions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Questions {
	
	public void printValues() {
		System.out.println(fee('A'));
		System.out.println(fee('T'));
		System.out.println(fee('C'));
		System.out.println(fee(' '));
	}
	
	private int fee(Character model) {
		int price = 0;
		
		switch (model) {
		case 'A':	
			price = 50;
			break;
		case 'T':
			price=20;
		case 'C':
			price=5;
			break;
		default:
			price=100;
			break;
		}
		
		return price;
	}
	
	public void printCharactersOfString() {
		String firstName = "Christopher";
		
		firstName = firstName.substring(0, 5);
		
		String output = String.format("%s is %d characters long", firstName, firstName.length());
		
		System.out.println(output);
	}
	
	public void question22() {
		double dNum = 2.667;
		int iNum = 0;
		iNum = (int)dNum;
		
		System.out.println(iNum);
	}
	
	public void question24() {
		String numero = "2.667";
		
		Double.parseDouble(numero);
	}
	
	public void questao2() {
		int aVar = 9;
		if(aVar++ < 10) {
			System.out.println(aVar + " Hello World!");
		}else {
			System.out.println(aVar + " Hello Universe!");
		}
	}
	
	public void questao10() {
		System.out.println((2+3)*4-1);
		System.out.println(4*4+2*5);
		System.out.println(8*2%3);
		System.out.println(5/2-4%2);
	}
	
	public boolean duplicate(int[] array) {
		boolean isDuplicate = false;
		
		for(int x=0; x<array.length-1;x++) {
			for(int y=x+1;y<array.length;y++) 
				if(array[x]==array[y]) isDuplicate=true;
			if(isDuplicate) break;
			
		}
		
		return isDuplicate;
	}
	
	public double discountByAge(int age) {
		double discount = -1.00;
		switch((age >= 25) ? 0 :
			(age >= 21 && age < 25) ? 1 : 2) {
			case 0:
				discount = 0.50;
				break;
			case 1:
				discount = 0.25;
				break;
			case 2: default:
				discount=0.0;
				break;
				
		}
		
		return discount;
	}
	
	public boolean validateEntries(String[] entries) {
		boolean allValidEntries = true;
		
		for(String entry : entries) {
			if(entry.length() > 10) {
				allValidEntries=false;
				break;
			}
		}
		
		return allValidEntries;
	}
	
	public void testesAritimeticos() {
		int a=5;
		int b=10;
		int c=++a * b--;
		System.out.println("c = "+ c);
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		int d=a-- + ++b;
		System.out.println("d = "+ d);
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
	
	public void testesAritmeticos2() {
		double number = 27;
		number %= -3d;
		System.out.println("number = "+ number);
		number += 10f;
		System.out.println("number = "+ number);
		number *= -4;
		
		System.out.println(number);
	}
	
	public void presentingLineNumbers() {
		try {
			char data1 = 65;
			
			System.out.println(data1);
		
		
			long data2 = 65;
			System.out.println(data2);
			
			float data3=Float.valueOf("-65.0");
			System.out.println(data3);
			
			short data4 = Short.valueOf("65.0");
			System.out.println(data4);
		}catch(Exception e) {
			System.out.println("data occurred error: "+ e.getMessage());
		}
	}
	
	public void displayDoubleNumbers() {
		double pi = Math.PI;
		
		System.out.format("Pi is %.3f%n", pi);
		System.out.format("Pi is %.0f%n", pi);
		System.out.format("Pi is %09f%n", pi);
	}
	
	public void printInt() {
		if(true) {
			int num=1;
			if(num>0) {
				num++;
			}
		}
		int num=1;
		addOne(num);
		num -= 1;
		System.out.println(num);
	}
	
	private void addOne(int num) {
		num += 1;
	}
	
	public void scanner() {
		Scanner sc= new Scanner("1 Excellent 2 Good 3 Fair 4 Poor");
		Object data1 = sc.next();
		System.out.println("data1 is "+ data1);
		Object data2 = sc.next();
		System.out.println("data2 is "+ data2);
		Object data3 = sc.nextInt();
		System.out.println("data3 is "+ data3);
		Object data4 = sc.nextLine();
		System.out.println("data4 is "+ data4.toString().trim());
		
		sc.close();
	}
	
	public static String getBirthdate() {
		System.out.println("Enter your birthday in the format MMDDYYYY");
		
		Scanner sc = new Scanner(System.in);
		
		String birthdate= sc.next();
		
		
		sc.close();
		return birthdate;
	}
	
	int x=25;
	
	public void memory() {
		Questions app = new Questions();
		{
			int x=5;
		}
		{
			int x=10;
		}
		int x=100;
		System.out.println(x);
		System.out.println(app.x);
	}
	
	public Questions() {
		int x = 1;
		System.out.println(x);
	}
	
	public void Process(ArrayList<String> invoices) {
		for(int i=0; i<invoices.size();) {
			String invoice = invoices.get(i);
			invoices.remove(i);
		}
	}
	
	public void countDown(int start) {
		for(int i=start;i > 0;--i) {
			System.out.print(i+",");
		}
	}
	
	public void sumScope() {
		System.out.println("");
		int anum=55;
		
		for(int cnt=0;cnt<10;cnt++) {
			add(anum);
			if(cnt == 9) System.out.println("line 05: "+ anum);
		}
		System.out.println("line 06: "+anum);
	}
	
	static int count = 0;
	
	public static void add(int anum) {
		anum++;
		if(count == 7) System.out.println("line 11: "+anum);
		count++;
	}
	
	private int id=3;
	public static void main() {
		Questions questions = new Questions();
		questions.id=5;
		questions.showId();
	}
	
	protected void showId() {
		System.out.println(id);
	}
	
	public void tryCatchTest() {
		try {
			int x=1/0;
			System.out.println("try");
		}
		catch(ArithmeticException ex) {
			System.out.println("catch ArthmeticException");
		}
		catch(Exception ex) {
			System.out.println("catch Exception");
		}
		finally {
			System.out.println("finally");
		}
	}
}
