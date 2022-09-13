package main;

import dao.PessoaDAO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import modelo.Pessoa;

public class Principal {

    static PessoaDAO pessoaDAO = new PessoaDAO();

    public static void main(String[] args) {

        //pessoaDAO.verificarEsatadoDoCicloDeVida();
        
        Pessoa p = new Pessoa("Pessoa", new Date(), new BigDecimal(1000));
        buscarPessoaNome("Pessoa");
        pessoaDAO.remover(p);

    }

    public static void adicionarPessoa() {
        for (int i = 1; i < 11; i++) {
            Pessoa p = new Pessoa("Pessoa " + i, new Date(), new BigDecimal(1000 * 4 + (i * 10)));
            pessoaDAO.inserir(p);
        }
    }

    private static void buscarPessoaID(int id) {
        Pessoa pessoaResultado = pessoaDAO.buscarPorId(id);
        System.out.println(pessoaResultado);
    }

    private static void buscarPessoaNome(String nome) {
        List<Pessoa> pessoaResultado = pessoaDAO.buscarPorNome(nome);
        for (Pessoa pessoa : pessoaResultado) {
            System.out.println(pessoa);
        }
    }

    private static void buscarPessoaSalario(BigDecimal salario) {
        List<Pessoa> pessoaResultado = pessoaDAO.buscarPorSalaraio(salario);
        for (Pessoa pessoa : pessoaResultado) {
            System.out.println(pessoa);
        }
    }
}
