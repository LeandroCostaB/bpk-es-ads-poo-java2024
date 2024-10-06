package exercicio04;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        setCpf(cpf);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. O CPF deve conter 11 dígitos.");
        }
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("O email não pode ser nulo ou vazio.");
        } else {
            this.email = email;
        }
    }

    public String getDadosCliente() {
        return "Nome: " + nome + " \n" +
                "CPF: " + cpf + " \n" +
                "Email: " + email + "\n";
    }
}
