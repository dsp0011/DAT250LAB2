import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "BankSystem";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.clear();
        // read the existing entries and write to console
 /*       Query q = em.createQuery("select t from CreditCard t");
        List<CreditCard> todoList = q.getResultList();
        for (CreditCard todo : todoList) {
            System.out.println(todo);
        }*/
/*
        System.out.println("Size: " + todoList.size());
*/

        // create new todo
        em.getTransaction().begin();
        CreditCard todo = new CreditCard();
        todo.setNumber(500);
        em.persist(todo);
        em.getTransaction().commit();
        em.close();
    }
}