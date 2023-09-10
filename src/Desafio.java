import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 2, 4, 4, 6, 7, 8, 9, 10, 10, 16, 3);
        
        List<Integer> numerosDuplicados = numeros.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("A lista está sem os números distintos.");
        numerosDuplicados.forEach(System.out::println);
            
        

    }
}
