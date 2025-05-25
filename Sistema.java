package dio;

public class Sistema {
	public static void main(String[] args) {
		Cliente fulano = new Cliente();			
		fulano.setNome("Fulano da Silva");
		
		Conta cc = new ContaCorrente(fulano);
		Conta poupanca = new ContaPoupanca(fulano);

		cc.depositar(500);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
