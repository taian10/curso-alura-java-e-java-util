package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {

		// int[] idades = new int[5];
		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;

		
		//System.out.println(contas[1].getNumero());
		
		//Object referenciaGenerica = contas[1];
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
