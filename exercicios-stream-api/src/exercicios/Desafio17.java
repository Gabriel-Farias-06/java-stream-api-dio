package exercicios;

import java.util.Arrays;
import java.util.List;

// Desafio 17 - Filtrar os números primos da lista:

public class Desafio17 {
  
  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    numeros.stream().filter(n -> {
      if (n < 2) return false;
      for (int i = 2; i < n; i++)
        if(n % i == 0) return false;
      return true;
    }).forEach(System.out::println);
  }
}
