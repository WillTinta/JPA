package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Objects;

public class ContaPK implements Serializable{
    private int numeroAgencia;
    private int numeroConta;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.numeroAgencia;
        hash = 41 * hash + Objects.hashCode(this.numeroConta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaPK other = (ContaPK) obj;
        if (this.numeroAgencia != other.numeroAgencia) {
            return false;
        }
        return this.numeroConta == other.numeroConta;
    }

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
    
}
