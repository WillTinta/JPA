package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Objects;

public class TelefonePK implements Serializable{
    private int ddd;
    private String numero;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.ddd;
        hash = 11 * hash + Objects.hashCode(this.numero);
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
        final TelefonePK other = (TelefonePK) obj;
        if (this.ddd != other.ddd) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }

    

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
