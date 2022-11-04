public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String ocultarCpf(String cpf) {
        String cpfOcultado = "";

        for (int x = 0; x < cpf.length(); x++) {
            if (cpf.length() - x <= 2) {
                cpfOcultado += cpf.toCharArray()[x];
            } else
            {
                if (cpf.toCharArray()[x] == '-' | cpf.toCharArray()[x] == '.') {
                    cpfOcultado += cpf.toCharArray()[x];
                } else {
                    cpfOcultado += "*";
                }
            }

        }
        return cpfOcultado;
    }
}
