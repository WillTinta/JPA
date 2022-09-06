

import br.edu.ifsp.pep.dao.FuncionarioPerClassDAO;
import java.math.BigDecimal;
import tablePerClass.FuncionarioPerClass;

public class Principal {
    
    public static void main(String[] args) {        
        
        FuncionarioPerClass f1 = new FuncionarioPerClass();
        f1.setNome("Leandrinha");
        f1.setSalario(new BigDecimal(10000));
        FuncionarioPerClassDAO funcionarioDAO1 = new FuncionarioPerClassDAO();
        funcionarioDAO1.inserir(f1);
    }
}
