package U4_13.dao;

import U4_13.entities.Partecipazione;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartecipazioneDao {
    private final EntityManager em;

    public PartecipazioneDao(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione partecipazione) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(partecipazione);
            t.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Partecipazione getById(long id) {
        return em.find(Partecipazione.class, id);
    }

    public void delete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            Partecipazione found = em.find(Partecipazione.class, id);
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

