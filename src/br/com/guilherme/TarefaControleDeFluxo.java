package br.com.guilherme;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;

public class TarefaControleDeFluxo {
    public static void main(String args[]) {
        System.out.println("Calculadora de Média Aritmética");
        Scanner s = new Scanner(System.in);
        System.out.println("P1: ");
        Double p1 = s.nextDouble();
        System.out.println("P2: ");
        Double p2 = s.nextDouble();
        System.out.println("P3: ");
        Double p3 = s.nextDouble();
        System.out.println("P4: ");
        Double p4 = s.nextDouble();
        Double media = (p1 + p2 + p3 + p4) / 4;
        System.out.println(media);
        if (media >= 7) {
            System.out.println("Aluno Aprovado, média final: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperação, média final: " + media);
        } else {
            System.out.println("Aluno Reprovado, média final: " + media);
        }
    }
}
