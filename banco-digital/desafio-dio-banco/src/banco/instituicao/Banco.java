package banco.instituicao;

import java.util.ArrayList;
import java.util.List;

import banco.conta.Conta;

public class Banco {

	private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

   
	
	
	
	
}
