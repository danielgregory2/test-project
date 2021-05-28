package com.example.equalsAndHashCode;

import java.nio.charset.StandardCharsets;

public class StaticNonTrivialMethods {

  public static String getBase() {
    String x = "hello";
    x.getBytes(StandardCharsets.UTF_8);
    return x;
  }

}
