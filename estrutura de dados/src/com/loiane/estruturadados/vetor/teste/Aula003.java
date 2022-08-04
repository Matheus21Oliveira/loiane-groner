package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula003 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor (5); 
		try {
			vetor.adiciona("elemento 1");
			
			vetor.adiciona("elemento 2");
			
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 
}
