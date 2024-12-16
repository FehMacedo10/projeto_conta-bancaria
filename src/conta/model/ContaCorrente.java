package conta.model;

public class ContaCorrente extends Conta { // extends => herança/herda
	
	//Atributos / Variáveis
		private float limite;
		   
		
		// Método Especial - Método Construtor
		public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {			
			super(numero, agencia, tipo, titular, saldo); // Invocando o método Construtor da Classe Conta
			this.limite = limite; // this => nome da Classe
		}

		public ContaCorrente (int numero, int agencia, int tipo, String titular, float saldo) {
			super(numero, agencia, tipo, titular, saldo);
			this.limite = 5000.0f;
			
		}
		
		//Método de Acesso
		/**
		 * @return the limite
		 */
		public float getLimite() {
			return limite;
		}


		/**
		 * @param limite the limite to set
		 */
		public void setLimite(float limite) {
			this.limite = limite;
		}
		
 		// Polimorfismo de Sobrescrita
		public void visualizar() {
			super.visualizar();
			System.out.println("Limite de Crédito: " + this.limite);
		}
		
}
