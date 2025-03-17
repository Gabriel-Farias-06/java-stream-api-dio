package exercicios;

import java.util.Arrays;
import java.util.List;

// Desafio 14 - Encontre o maior número primo da lista:

public class Desafio14 {
  
  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    System.out.println(numeros.stream().sorted().filter(n -> {
      if (n < 2) return false;
      for (int i = 2; i < n; i++)
        if(n % i == 0) return false;
      return true;
    }).toList().getLast());
  }
}
