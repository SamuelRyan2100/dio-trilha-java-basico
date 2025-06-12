package contaBancariaa;

public class ContaTerminal {
	private int numero;
	private String agencia;
	private String nomeCliente;
	private float saldo;
	//métodos seters e geters
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public void setAgencia(String agencia) {
		this.agencia=agencia;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente= nomeCliente;
	}
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}

}
