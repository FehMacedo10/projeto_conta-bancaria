package conta.model;

public class Conta {
	
	//Atributos / Variáveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	   
	/* 3 Modificadores de Acesso
	 * 
	 * Private - Exemplo Celular Particular
	 * Protected - Exemplo Telefone Residencial
	 * Public - Exemplo Orelhão
	 * Default - 
	 */
	
	// Método Especial - Método Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
		// this => Conta.numero
		// Conta.numero = atributo
		// numero = 6
		// this.numero = 6;
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Métodos de Acesso 
	
	/**
	 * Get -> Pegar
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Set -> Colocar/Definir
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}
	
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	//Comportamentos/Métodos
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Suficiente");
			return false;
		}
	
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valor) {
		
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n**************************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("\n\n********************************************************");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
	
	}
	
	
	
}
  
	