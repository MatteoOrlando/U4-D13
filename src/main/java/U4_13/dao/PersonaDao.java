package U4_13.dao;

import U4_13.entities.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDao {
    private EntityManager em;

    public PersonaDao(EntityManager em) {
        this.em = em;
    }

    public void save(Persona persona) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(persona);
            t.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Persona getById(long id) {
        return em.find(Persona.class, id);
    }

    public void delete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            Persona found = em.find(Persona.class, id);
            if (found != null) {
                t.begin();
                em.remove(found);
                t.commit();
                System.out.println("Elemento eliminato");
            } else {
                System.out.println("Elemento non trovato");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
