import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionLista {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<String>();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Informe uma lista de nomes separados por vírgula (sem espaço após a vírgula): ");
            String str = s.nextLine();
            String[] nomes = str.split(",");
            for (String nome : nomes) {
                lista.add(nome);
                Collections.sort(lista);
            }
        }
        System.out.println(lista);
    }
}
