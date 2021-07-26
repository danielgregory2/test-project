package com.example.numbers;

import java.time.LocalDate;

public class RealisticNumbers {

  public static int sumInt(int lhs, int rhs) {
    return lhs + rhs;
  }

  public static int productInt(int lhs, int rhs) {
    return lhs * rhs;
  }

  public static double powerInt(int lhs, int rhs) {
    return Math.pow(lhs, rhs);
  }

  public static LocalDate createDateFromInts(int year, int month, int day) {
    return LocalDate.of(year, month, day);
  }

  public static double findById(int ID) {
      return Math.pow(ID, ID);
  }
}