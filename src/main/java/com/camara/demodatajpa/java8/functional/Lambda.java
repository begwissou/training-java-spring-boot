package com.camara.demodatajpa.java8.functional;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * Comme une fonction anonyme
 * Indépendante d'une class
 * Utilisée le plus souvent comme paramettre à d'autres fonctions.
 * Peut etre affecté à une variable
 * Très utile pour implémentter simplement les @FunctionalInterface
 */
public class Lambda {

  public static void main(String[] args) {
    Function<Integer, Integer> myFunction = x -> x + 2;
    System.out.println("Excecute funstion " + myFunction.apply(9));

    int[] list = new int[] { 20, 15, 16, 4, 70 };

    IntPredicate greaterThan15 = v -> 15 < v;
    IntPredicate lessThan30 = v -> 30 > v;

    int sum = Arrays.stream(list).filter(greaterThan15.and(lessThan30)).sum();
    sum = Arrays.stream(list).filter(greaterThan15).filter(lessThan30).sum();
    sum = Arrays.stream(list).filter(greaterThan15.or(lessThan30)).sum();

    System.out.println(
      "Sum Declarative Way : " + sum + " " + greaterThan15.test(20)
    );

    IntBinaryOperator accFunction = (acc, v) -> {
      if (acc < 40) return acc + v;
      return v;
    };
    sum = Arrays.stream(list).filter(v -> 15 < v).reduce(0, accFunction);
    System.out.println("Sum Declarative Way : " + sum);
  }
}
