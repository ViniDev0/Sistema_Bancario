package sistemaBancario;

public class ContaBancaria {
	
	private int idConta;
	private String agencia;
	private String numeroConta;
	private String tipo;
	private double saldo;
	private double limiteCredito;
	
	public ContaBancaria(int idConta, String agencia, String numeroConta) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipo = "N";
	}
	
	public ContaBancaria(int idConta, String agencia, String numeroConta, double limiteCredito) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipo = "E";
		this.limiteCredito = limiteCredito;
	}

	public int getIdConta() {
		return idConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void registraDeposito(double valor) {
		this.saldo += valor;
	}
	
	public boolean registraSaque(double valor) {
		double possoSacar = this.saldo + this.limiteCredito;
		
		if (possoSacar >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}
