public abstract class Conta implements Iconta{
    private static final int AGENCIA_PADRAO = 01;
    private static int SEQUENCIAL = 01;

    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        Banco.validarOperacao("SAQUE");
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        Banco.validarOperacao("DOC");

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
        Banco.validarOperacao("PIX");


    }

     protected void imprimirDados(){
        System.out.println(String.format("N. Titular - %s", this.cliente.getNome()));
        System.out.println(String.format("CPF do Titular - %s", this.cliente.ocultarCpf(cliente.getCpf())));
        System.out.println(String.format("N. Agencia - %d", this.agencia));
        System.out.println(String.format("N. Conta - %d", this.numConta));
        System.out.println(String.format("N. Conta - %.2f", this.saldo));
    }
}
