package model;

public class ContaBancaria {
	
	private String cliente;
	private int num_conta;
	private float saldo;

	public ContaBancaria() {
		super();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float valor) {
		saldo = valor;
	}
	
	public void sacar(double valor) {
		if(saldo - valor >= 0) {
			saldo -= valor;
		} else {
			System.out.println("\nERROR: Insira um valor menor ou igual a " + saldo + "\n");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
}
