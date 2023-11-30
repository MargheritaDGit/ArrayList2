/*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
  In questa classe avere i metodi pubblici per ottenere le informazioni.
  Creare un ArrayList con 12 elementi e stamparlo in console.
  Mettere in ordine la collezione e stampare il risultato*/


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Margherita", 29);
        List<Student> list = new ArrayList<>(Arrays.asList(student));

        //List<Student> list = Arrays.asList(student);
        List<String> lista1 = new ArrayList<>();
        lista1.add(student.name);
        lista1.add(String.valueOf(student.age));
        lista1.add("H 1.60");
        lista1.add("Occhi marroni");
        lista1.add("Capelli castani");
        lista1.add("id: 934");
        lista1.add("Colore: rosso");
        lista1.add("Film: Harry Potter");
        lista1.add("Casata: Griffondoro");
        lista1.add("Diploma: Hogwarts");

        System.out.println("Studente aggiornato: " + lista1);

        Collections.sort(lista1);
        System.out.println("L'ordine alfabetico è " + lista1);
    }
}