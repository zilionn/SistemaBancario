package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class CaixaDeBanco {

	public static void main(String[] args) {
		ContaPoupanca contp = new ContaPoupanca();
		ContaEspecial conte = new ContaEspecial();
		
		contp.setCliente("Lady Gaga");
		contp.setNum_conta(999);
		contp.setDia_rend(1);
		contp.setSaldo(1000);
		
		System.out.println("------------------------------------");
		System.out.println("Cliente: " + contp.getCliente());
		System.out.println("Número da conta: " + contp.getNum_conta());
		System.out.println("Dia de rendimento: " + contp.getDia_rend());
		System.out.println("Saldo: |" + contp.getSaldo() + "|");
		System.out.println("------------------------------------");
		
		conte.setCliente("José");
		conte.setNum_conta(111);
		conte.setLimite(2500);
		conte.setSaldo(1000);
		
		System.out.println("------------------------------------");
		System.out.println("Cliente: " + conte.getCliente());
		System.out.println("Número da conta: " + conte.getNum_conta());
		System.out.println("Limite: " + conte.getLimite());
		System.out.println("Saldo: |" + contp.getSaldo() + "|");
		System.out.println("------------------------------------");
		
		contp.sacar(250);
		System.out.println("Saldo de " + contp.getCliente() + " após o saque: " + contp.getSaldo());
		
		contp.sacar(15000);
		System.out.println("Saldo de " + contp.getCliente() + " após a tentativa de saque: " + contp.getSaldo());
		
		contp.calcularNovoSaldo(2.5);
		System.out.println("Saldo de " + contp.getCliente() + " após o rendimento: " + contp.getSaldo());
		
		System.out.println("------------------------------------");
		
		conte.sacar(500);
		System.out.println("Saldo de " + conte.getCliente() + " após o saque: " + conte.getSaldo());
		
		conte.sacar(3001);
		System.out.println("Saldo de " + conte.getCliente() + " após o saque: " + conte.getSaldo());
		
		System.out.println("------------------------------------");
		

	}

}
