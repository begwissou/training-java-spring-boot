package com.camara.demodatajpa.java8.functional;

import java.util.Arrays;
import java.util.function.Predicate;

/*
 * SAM: Single Abstract Method.
 * Une interface avec une seule méthode abstraite.
 * Depuis Java 1.0
 * Annotation @FunctionalInterface introduite depuis java 1.8, 8
 */
public class FunctionalInterface {

  public static void main(String[] args) {
    Note note = () -> 13;
    Note note1 = () -> 10;
    Note note2 = () -> 18;
    Note note3 = () -> 7;

    System.out.println("Exemple not functionnal interface " + note.findNote());
    System.out.println(
      "Exemple not functionnal add bonus: " + note.addBonus(2).findNote()
    );
    System.out.println(
      "Exemple not functionnal Static method: " +
      Note.moyenne(
        Arrays.asList(
          note.findNote(),
          note1.findNote(),
          note2.findNote(),
          note3.findNote()
        )
      )
    );
  }
}
