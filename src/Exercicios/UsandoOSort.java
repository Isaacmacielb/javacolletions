package Exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class UsandoOSort {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("To aprendendo");
        al.add("A como");
        al.add("Usar");
        al.add("O");
        al.add("sort");

        Collections.sort(al);

        System.out.println("Listando os elementos" +
                " e aprendendo a usar colletion.sort() :\n" + al);
    }
}
