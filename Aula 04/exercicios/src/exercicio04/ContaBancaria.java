package exercicio04;

/**
 * 4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
 * Adicione métodos para depositar e sacar dinheiro.
 */
public class ContaBancaria {

    private Cliente cliente;
    private Integer numeroConta;
    private Double saldo;

    public ContaBancaria(Integer numeroConta, Double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0.0;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(Double valor) {
        if (valor <= 0) {
            System.out.println("Valor para saque deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }

    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Valor para depósito deve ser positivo.");
        } else {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta + "\n" +
                "Saldo: " + saldo;
    }
}
