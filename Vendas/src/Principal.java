
import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.dao.VendaDAO;
import br.edu.ifsp.pep.modelo.Item;
import br.edu.ifsp.pep.modelo.Produto;
import br.edu.ifsp.pep.modelo.Venda;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;

public class Principal {

    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    private static VendaDAO vendaDAO = new VendaDAO();

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("VendasPU");
        adiconarProduto();
        exibirProdutos();
        adicionarVenda();
    }

    private static void adiconarProduto() {
        for (int i = 0; i < 10; i++) {
            Produto p = new Produto("Produto " + i, i * 10, new BigDecimal((i * 12) + 15));
            produtoDAO.inserir(p);
        }
    }

    private static void exibirProdutos() {
        List<Produto> proiduto = produtoDAO.obterTodos();
        for (Produto produto : proiduto) {
            System.out.println(produto);
        }
    }

    private static void adicionarVenda() {
        Venda venda = new Venda();
        venda.setData(new Date());

        List<Produto> produtos = produtoDAO.obterTodos();
        Item item = new Item();

        item.setVenda(venda);
        item.setProduto(produtos.get(0));
        item.setPreco(produtos.get(0).getPreco());
        item.setQuantidade(10);

        List<Item> itens = new ArrayList<>();
        itens.add(item);

        venda.setItens(itens);

        vendaDAO.inserir(venda);

    }
}
