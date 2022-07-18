package com.camara.demodatajpa.java8.functional;

import java.util.Arrays;

public class ImperativeVsDeclarative {

  /*
   * D'une manière générale
   * Ecrire un programme c'est résoudre un problème.
   * Le plus souvent: Parametres d'entrés, traitements puis résultat. algoryhtme, procédures, focntions etc.
   * Et cela ne changera pas
   */

  //Impérative: Comment ?
  /*
   *Quand tu lit le code, tu vois comment le problème est résolut.
   *Et Qaund tu écris le code tout de suite ton esprit commence
   *par réfléchir à comment le résoudre
   */

  //Déclarative:  Quoi ?
  /*
   *Quand tu lit le code, tu vois l'enchainement des étapes de la solutions. une liste de fonctions qui s'enchainent
   *Et Qaund tu écris le code, ton esprit commence par voir de quoi s'agit t-il. ce que tu veux faire pas comment le faire
   */

  // Functional programming
  /*
  *https://www.youtube.com/watch?v=mW_nLYvXyKk&ab_channel=Web2day
   *L'idée n'est pas rejeter l'une ou l'autre des concepts mais de les utiliser au mieux 
   tout en mettant en avant la programmation fonctionnelle pour arriver à un code clean et facile à maintenir.

   *
   */

  public static void main(String[] args) {
    /*
     * La somme des entiers > 15 d'une liste
     */
    int[] list = new int[] { 20, 15, 16, 4, 70 };

    /*
     * Imperative Way
     * Parcour la liste
     * Pour chaque entier checker s'il est inferieur à 15 ou pas
     * S'il est superieur ajouter à la somme
     * sinon continuer avec l'entier suivent de la boucle
     */
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
      sum = list[i] > 15 ? sum + list[i] : sum;
    }

    System.out.println("Sum Imperative Way : " + sum);

    /*
     * Declarative way
     * Filtrer les entiers superieur à 15
     * Et faire la somme.
     */
    sum = Arrays.stream(list).filter(v -> 15 < v).sum();
    System.out.println("Sum Declarative Way : " + sum);

    sum =
      Arrays
        .stream(list)
        .filter(v -> 15 < v)
        .reduce(
          0,
          (acc, v) -> {
            return acc + v;
          }
        );
    System.out.println("Sum Declarative Way : " + sum);
  }

  public int addOne(int x) {
    return x + 1;
  }
}
