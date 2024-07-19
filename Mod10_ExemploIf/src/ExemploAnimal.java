import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Digite o nome de um animal: ");
            String texto = s.next();
            String animal = exemploIf(texto);
            System.out.println(animal);
        }
    }
    
    public static String exemploIf(String animal) {
        String result;
        if (animal.equalsIgnoreCase("cachorro") || animal.equalsIgnoreCase("gato")) {
            result = animal + " é um animal doméstico.";
        } else if (animal.equalsIgnoreCase("tigre")) {
            result = animal + " é um animal selvagem.";
        } else {
            result = "Animal desconhecido.";
        }
        return result;
    }
}