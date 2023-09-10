import java.util.ArrayList;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(123);
        numeros.add(456);
        numeros.add(789);

        int somaDosDigitos = numeros.stream()
            .mapToInt(Desafio8::somaDosDigitos)
            .sum();

        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }

    public static int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; 
            numero /= 10; 
        }
        return soma;
    }
}