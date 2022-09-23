package Exercicios;

import java.util.HashSet;
import java.util.Set;

public class UsandoSet {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Lucas");

        // o set não mantém a ordem dos alunos
        // apenas acessando ou removendo os elementos (get || remove)
        for(String aluno: alunos) { // ":" é um foreach, ele percorre todos os elementos de uma Collection

            System.out.println(aluno);
        }
    }
    //Um HashSet é uma coleção de itens
}
