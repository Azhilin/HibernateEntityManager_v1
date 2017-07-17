package HEM;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by azhilin on 24.01.2017.
 */
public class CoreMain {
    public static void main(String[] args) {
    	MyUserClass myUser = new MyUserClass();
        myUser.setName("Alexey");
        myUser.setSurname("Zhilin");
    	
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.jpa");
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        entityManager.persist(myUser);

        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();


    }
}
