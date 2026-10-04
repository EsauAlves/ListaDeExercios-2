package model;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0f;
    }

    public boolean sacar(float valor) {
        if (valor > 0 && valor <= 10000 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(float valor) {
        if (valor > 0 && valor <= 10000) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public float consultarSaldo() {
        return saldo;
    }
}