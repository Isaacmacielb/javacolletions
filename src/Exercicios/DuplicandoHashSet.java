package Exercicios;

import java.util.HashSet;
import java.util.Set;

public class DuplicandoHashSet {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");

        System.out.println(alunos.size());

        alunos.add("Pedro");

        System.out.println(alunos.size()); // size retorna a quantidade de elementos
    }
}
