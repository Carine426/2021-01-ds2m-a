package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
		// Cria��o do Cliente 
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alves Cabral");
		pedro.setCpf("051025540");
		pedro.setTelefone("(11)9548-1010");
		pedro.setCep("01205025");
		
		// Criar da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("222-2");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(pedro.getNome());
					
	}

}
