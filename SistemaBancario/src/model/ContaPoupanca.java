package model;

public class ContaPoupanca extends ContaBancaria {
	
	private int dia_rend;

	public ContaPoupanca() {
		super();
	}

	public int getDia_rend() {
		return dia_rend;
	}

	public void setDia_rend(int dia_rend) {
		this.dia_rend = dia_rend;
	}
	
	public void calcularNovoSaldo(double taxa) {
			float old_saldo = getSaldo();
			float new_saldo = (float) (old_saldo * (1 + (taxa / 100)));
			setSaldo(new_saldo);
	}
}
	

