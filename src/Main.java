public class Main {
    public static void main(String[] args) {
        Cliente Lucas = new Cliente("Lucas", "111.444.777-22");
        Cliente Filipe = new Cliente("Filipe", "110.999.664-00");
        Conta contaLucas = new ContaCorrente(Lucas);
        Conta contaFilipe = new ContaPoupanca(Filipe);
        contaLucas.imprimirExtrato();
        contaFilipe.imprimirExtrato();
        contaLucas.depositar(120.50);
        contaLucas.transferir(20.50, contaFilipe);
        contaFilipe.imprimirExtrato();
        contaLucas.imprimirExtrato();


        }


}