package U4_13.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

//definisco la classe persona
public class Persona {
    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private char sesso;


    //Relazione CON PARTECIPAZIONE ONE-TO-MANY (una persona puó avere piu partecipazioni)
    private List<Partecipazione> listaPartecipazioni;

    public Persona() {}

    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, char sesso){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
    }


    //getter e setter

    public long getId() {
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCognome(){
        return cognome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    public char getSesso() {
        return sesso;
    }
    public void setSesso(char sesso){
        this.sesso = sesso;
    }
    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }
    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }
}
