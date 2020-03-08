package pl.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         1. Utworzyc klase Student zawierajaca pola:
           - name
           - surname
           - grades (lista Integerow)
         2. w mainie utworz 10 studentow i dodaj ich do listy students
         3. w klasie main utworz funkcje pozwalajaca wyliczac srednia kazdego studenta
         4. w klasie main utworz funkcje wyszukujaca studentow wedlug czesci podanego nazwiska
         5. w klasie main utworz funkcje wyszukujaca wedlug imienia i nazwiska (dokladnie wprowadzone imie i nazwisko)
         6. W konsoli stworz "interfejs" pozwalajacy na dodawanie i usuwanie studentow
         7. zamiast tworzyc 10 studentow "recznie" 10 razy wywolujac "new" odczytaj ich z pliku o strukturze:
            imie;nazwisko;ocena1,ocena2,ocena3
            np.
            Jakub;Plonka;1,2,3,4,5,6,2,2,4
            Jakub;Test;1,4,3,4,5,3,2,2,4
            Najpierw odczytaj z pliku students.csv, a nastepnie z pliku students-2.csv
         */

        //TODO: omowic jak to dziala?
        //List<Integer> integers = Arrays.asList(1, 2, 34);
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        grades.add(3);
        Student student2 = new Student("Jan", "Kowalski", grades);
        students.add(new Student("Jan", "Kowalski", grades));
        grades = new ArrayList<>();
        grades.add(5);
        students.add(student2);


        System.out.println(students);
        System.out.println();
    }
}
