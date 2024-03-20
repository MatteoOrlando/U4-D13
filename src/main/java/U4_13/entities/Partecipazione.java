package U4_13.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private long id;

    //IMPOSTO LE RELAZIONI MANY-TO-ONE ( possono esserci piú partecipazioni,
    // ma ognuna di essere puo essere rappresentata da una sola persona)
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    //la relazione fra evento e persona é many to one, perché ci possono essere piu eventi,
    // ma una persona puo assistere ad un evento alla volta
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Event evento;
    @Enumerated(EnumType.STRING)
    private StatoPartecipazione stato;

    public Partecipazione() {
    }

    public Partecipazione(Persona persona, Event evento, StatoPartecipazione stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Event getEvento() {
        return evento;
    }

    public void setEvento(Event evento) {
        this.evento = evento;
    }

    public StatoPartecipazione getStato() {
        return stato;
    }

    public void setStato(StatoPartecipazione stato) {
        this.stato = stato;
    }
}
