package com.rodrigo.certificacao98388;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigo.certificacao98388.questions.Questions;

@SpringBootApplication
public class Certificacao98388Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Certificacao98388Application.class, args);
		
		Questions questions = new Questions();
		
		questions.printValues();
		
		questions.printCharactersOfString();
		
		questions.question22();
		
		questions.questao2();
		
		questions.questao10();
		
		 int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8};
		 System.out.print("Duplicate value? ");
		 System.out.println(questions.duplicate(array) ? "yes": "no");
		 System.out.println("Discount of "+questions.discountByAge(37));
		 System.out.println("Discount of "+questions.discountByAge(23));
		 System.out.println("Discount of "+questions.discountByAge(5));
		 
		 questions.testesAritimeticos();
		 
		 questions.testesAritmeticos2();
		 
		 questions.presentingLineNumbers();
		 
		 questions.displayDoubleNumbers();
		 
		 questions.printInt();
		 
		 questions.scanner();
		 
		 //System.out.println(Questions.getBirthdate());
		 
		 questions.memory();
		 
		 ArrayList<String> invoices = new ArrayList<String>();
		 invoices.add("teste1");
		 invoices.add("teste2");
		 invoices.add("teste3");
		 questions.Process(invoices);
		 System.out.println(invoices);
		 
		 questions.countDown(10);
		 
		 questions.sumScope();
		
		 questions.tryCatchTest();
		 
	}

}
