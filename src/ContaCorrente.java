public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-----\t Extrato Bancário - Conta Corrente \t -----");
        Banco.validarOperacao("EXTRATO");
        super.imprimirDados();
    }
}
