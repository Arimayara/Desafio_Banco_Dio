
public class Main {
	
	public static void main(String[] args) {
		Cliente Ariany = new Cliente();
		Ariany.setNome("Ariany"); 
		
		Conta cc = new ContaCorrente(Ariany);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Ariany);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
