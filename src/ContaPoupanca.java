public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-----\t Extrato Bancário - Conta Poupança \t -----");
        Banco.validarOperacao("EXTRATO");
        super.imprimirDados();
    }

}
