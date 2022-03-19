
public class ContaEspecial extends Conta{	

	public ContaEspecial(Cliente cliente, double limite) {
		super(cliente, limite);
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > (saldo * getLimite()) + saldo) {
			System.out.println("Valor a retirar é maior que saldo!");
		}else {
			saldo -= valor;
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n=== Extrato Conta Especial === ");
		super.imprimirInfosComuns();
	}
	
}
