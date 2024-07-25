package banco.main;
import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import banco.instituicao.Banco;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		
		Cliente cidinha = new Cliente();
		cidinha.setNome("Karen fofoqueira");
		
		Conta cc = new ContaCorrente(cidinha);
		Conta cPoupanca = new ContaPoupanca(cidinha);
		
		banco.adicionarConta(cPoupanca);
		banco.adicionarConta(cc);

		cc.imprimirExtrato();
		cPoupanca.imprimirExtrato();
		
		
	}

}
