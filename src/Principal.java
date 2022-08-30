
import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.modelo.Produto;
import java.math.BigDecimal;
import javax.persistence.Persistence;

public class Principal {

    private static ProdutoDAO produtoDAO = new ProdutoDAO();

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("VendasPU");
        adiconarProduto();
    }

    private static void adiconarProduto() {
        for (int i = 0; i < 10; i++) {
            Produto p = new Produto("Produto " + i, i * 10, new BigDecimal((i * 12) + 15));
            produtoDAO.inserir(p);
        }
    }
}
