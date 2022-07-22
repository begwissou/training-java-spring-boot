package com.camara.demodatajpa.java8.functional;

import java.lang.FunctionalInterface;
import java.util.List;

@FunctionalInterface
public interface Note {
  int findNote();

  default Note addBonus(int bonus) {
    return () -> findNote() + bonus;
  }

  static Double moyenne(List<Integer> notesInt) {
    return notesInt.stream().mapToDouble(Double::valueOf).average().orElse(0);
  }
}
