package model;

public class ContaEspecial extends ContaBancaria {
	
	private float limite;

	public ContaEspecial() {
		super();
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		float saldo = getSaldo();
		float lim_total = limite + saldo;
		
		if(valor <= lim_total) {
			setSaldo((float)(getSaldo() - valor));
		} else {
			System.out.println("\nERROR: Saque excede o limite\n");
		}
	}

}
