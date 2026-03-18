package entities;

public class ContaBancaria {
    private Double saldo;

    public ContaBancaria(Double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public Double obterSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Não é possível depositar um valor negativo!");
        }
        this.saldo+= valor;
    }

    public void sacar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Não é possível realizar o saque de um valor negativo!");
        }
        if (valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente para o saque do valor informado!");
        }
        this.saldo-= valor;
    }

}
