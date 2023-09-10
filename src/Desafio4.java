import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = new ArrayList<>();
        Consumer<Integer> removerNumeroImpar = numero ->{
            if(numero % 2 == 0){
                numerosPares.add(numero);
            }
        };
        numeros.forEach(removerNumeroImpar);
        numerosPares.forEach(System.out::println);
    }
}
