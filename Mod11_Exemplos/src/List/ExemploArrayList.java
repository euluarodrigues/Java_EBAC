package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import domain.Aluno;
import domain.ComparaNota;

public class ExemploArrayList {
//     public static void main(String[] args) throws Exception {
//         List<Aluno> lista = new ArrayList<Aluno>();
//         lista.add(new Aluno("Rebeca", "Programação", 10.0));
//         lista.add(new Aluno("Alice", "Programação", 9.0));
//         lista.add(new Aluno("Bruno", "Programação", 5.0));
//         lista.add(new Aluno("Jonas", "Programação", 8.0));
//         Collections.sort(lista);
//         System.out.println("Ordem alfabética");
//         System.out.println(lista);
//         Collections.sort(lista, new ComparaNota());
//         System.out.println("Ordem notas");
//         System.out.println(lista);
//     }
// }

public static void main(String[] args) throws Exception {
    try (Scanner s = new Scanner(System.in)) {
        Aluno aluno = new Aluno("aaa", "aaa", 0.0);
        System.out.println("Nome: ");
        aluno.setNome(s.nextLine());
        System.out.println("Curso: ");
        aluno.setCurso(s.nextLine());
        System.out.println("Nota: ");
        aluno.setNota(s.nextDouble());
        List<Aluno> lista = new ArrayList<Aluno>();
        lista.add(aluno);
        Collections.sort(lista);
        System.out.println("Ordem alfabética");
        System.out.println(lista);
        Collections.sort(lista, new ComparaNota());
        System.out.println("Ordem notas");
        System.out.println(lista);
    }
}
}