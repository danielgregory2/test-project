package com.example.staticmethods;


// Exact copy of something out of piggymetrics.
public enum Currency {

  USD, EUR, RUB;

  public static Currency getBase() {
    return USD;
  }
}
