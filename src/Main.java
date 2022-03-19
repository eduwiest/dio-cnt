
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca.sacar(101);
		
		Conta ce = new ContaEspecial(venilton, 0.1);
		ce.depositar(200);
		ce.sacar(50);			
		ce.sacar(160);
		ce.imprimirExtrato();
	}

}
