/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joined.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarioJoined")
@DiscriminatorValue("FUNCIONARIO") //Valor do tipo, no caso é "FUNCIONARIO"
public class FuncionarioJoined extends PessoaJoined{
    @Column(name="salario", precision = 8, scale=2, nullable = false)
    private BigDecimal salario;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    
}
