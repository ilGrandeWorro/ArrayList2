package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student giorgio = new Student("Giorgio", 21);
        Student marta = new Student("Marta", 19);
        Student marco = new Student("Marco", 19);
        Student lucia = new Student("Lucia", 18);
        Student andrea = new Student("Andrea", 20);
        Student ivan = new Student("Ivan", 21);
        Student roberto = new Student("Roberto", 21);
        Student claudio = new Student("Claudio", 19);
        Student stefano = new Student("Stefano", 19);
        Student emanuele = new Student("Emanuele", 18);
        Student alessandro = new Student("Alessandro", 20);
        Student sergio = new Student("Sergio", 21);
        ArrayList<Integer> school = new ArrayList<Integer>(Arrays.asList(giorgio.getAge(), marta.getAge(), marco.getAge(),
                lucia.getAge(), andrea.getAge(), ivan.getAge(), roberto.getAge(), claudio.getAge(), stefano.getAge(),
                emanuele.getAge(), alessandro.getAge(), sergio.getAge()));

        System.out.println(school);
        System.out.println();
        Collections.sort(school);
        System.out.println(school);
    }
}
