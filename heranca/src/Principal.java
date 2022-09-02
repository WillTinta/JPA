
import br.edu.ifsp.pep.dao.FuncionarioDAO;
import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.modelo.Funcionario;
import br.edu.ifsp.pep.modelo.Pessoa;
import java.math.BigDecimal;


public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Will");
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        pessoaDAO.inserir(p1);
        
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Leandrinha");
        f1.setSalario(new BigDecimal(10000));
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserir(f1);
    }
}
