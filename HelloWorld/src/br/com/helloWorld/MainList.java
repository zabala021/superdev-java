package br.com.helloWorld;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		//ALTERACAO PARA TESTE
		

		List<String> listaAlunos = new ArrayList<String>();
		
		listaAlunos.add("Zeka");
		listaAlunos.add("Jão");
		listaAlunos.add("Tio Zé");
		
		System.out.println("Quantidade de alunos: " + listaAlunos.size());
		
		
		
		System.out.println("***Print FOR***");
		for (int i = 0; i < listaAlunos.size(); i++) {
			System.out.println(listaAlunos.get(i));
		}
		
		System.out.println("***Print FOR..OF***");
		for (String aluno: listaAlunos) {
			System.out.println(aluno);
		}
		
		Integer indexRemocao = listaAlunos.indexOf("Zeka");
		if (indexRemocao >= 0) {
			listaAlunos.remove(indexRemocao.intValue());
		}
		
		System.out.println("***Print Lista Atualizada***");
		for (String aluno: listaAlunos) {
			System.out.println(aluno);
		}

	}

}
