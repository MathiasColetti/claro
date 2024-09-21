package entities;

public class Conta {

    private Integer numeroConta;
    private String Agencia;
    private String NomeCliente;
    private Double saldo;

    public Conta(Integer numeroConta, String agencia, String nomeCliente, Double saldo) {
        this.numeroConta = numeroConta;
        Agencia = agencia;
        NomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
