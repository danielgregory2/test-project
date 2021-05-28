package com.example.staticmethods;

import java.nio.charset.StandardCharsets;

public class StaticNonTrivialMethods {

  // on develop we used to get a test for this.
  public static String getBase() {
    String x = "hello";
    x.getBytes(StandardCharsets.UTF_8);
    return x;
  }

}
