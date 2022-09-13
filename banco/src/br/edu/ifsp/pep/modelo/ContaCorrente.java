package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Id;

public class ContaCorrente {
    
    @Id    
    @Column(name = "idConta")
    private int numeroAgencia;
    @Id    
    @Column(name = "numeroConta")
    private int numeroConta;
    @Column(name="salario", precision = 20, scale=2)
    private BigDecimal saldo;

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    
}
