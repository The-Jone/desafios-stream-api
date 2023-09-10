import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = somaNumeroPares(numeros);
        System.out.println("Soma dos números pares: " + soma);
    }
    public static int somaNumeroPares(List<Integer> numeros){
        int soma = 0;
        for(int numero : numeros){
            if(numero % 2 == 0){
                soma += numero;
                
            }
    }
        return soma;
        
    }
    
}
