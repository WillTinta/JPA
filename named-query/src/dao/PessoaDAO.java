/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import modelo.Pessoa;

public class PessoaDAO extends AbstractDAO<Pessoa> {

    public Pessoa buscarPorId(long id) {
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorId", Pessoa.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public List<Pessoa> buscarPorNome(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorNome", Pessoa.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public List<Pessoa> buscarPorSalaraio(BigDecimal salario) {
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorSalario", Pessoa.class);
        query.setParameter("salario", salario);
        return query.getResultList();
    }

    public void verificarEsatadoDoCicloDeVida() {
        Pessoa p = new Pessoa("Pessoinha", new Date(), new BigDecimal(20000));

        EntityManager em = getEntityManager();
        System.out.println("Estado Gerenciado? R: " + em.contains(p));
        
        em.persist(p);
        System.out.println("Estado Gerenciado? R: " + em.contains(p));
        
        em.detach(p);
        System.out.println("Estado Gerenciado? R: " + em.contains(p));
    }
    
    public void remover(Pessoa p){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        System.out.println("Estado Gerenciado? R: " + em.contains(p));
        
        Pessoa merge = em.find(Pessoa.class, p.getId());
        em.remove(merge);
        
        em.getTransaction().commit();
        em.close();
    }
}
