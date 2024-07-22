import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomeSexo {
    public static void main(String[] args) {
        List<String> listaF = new ArrayList<>();
        List<String> listaM = new ArrayList<>();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite pares nome e sexo (no formato Nome-Sexo[F/M]) separados por vírgula: ");
            String input = s.nextLine();

            String[] pessoas = input.trim().split(",");
            for (int i=0; i < pessoas.length; i++) {
                String[] partes = pessoas[i].split("-");
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();
                if (sexo.equals("F")) {
                    listaF.add(nome);
                } else if (sexo.equals("M")) {
                    listaM.add(nome);
                } 
            }
        }

        System.out.println("Nomes femininos: " + listaF);
        System.out.println("Nomes masculinos: " + listaM);
    }
}