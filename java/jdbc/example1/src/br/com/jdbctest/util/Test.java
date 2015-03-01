package br.com.jdbctest.util;

import java.util.Calendar;
import java.util.List;

import br.com.jdbctest.Contato;
import br.com.jdbctest.ContatoDao;

public class Test {
	public static void main(String[] args){
		
		Contato contato = new Contato();
		
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj87");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao bd = new ContatoDao();
		
		bd.adiciona(contato);
		System.out.println("Gravado!");
		
		List<Contato> contatos = bd.getLista();
		
		for (Contato contato2 : contatos) {
			System.out.println("Nome: "+contato2.getNome());
			System.out.println("Email:"+contato2.getEmail());
			System.out.println("Endereço:"+contato2.getEndereco());
			System.out.println("Data de Nascimento:"+contato.getDataNascimento().getTime()+"\n");
		}
		
	}
}
