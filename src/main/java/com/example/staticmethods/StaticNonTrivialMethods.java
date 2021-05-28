package com.example.staticmethods;

import java.nio.charset.StandardCharsets;

public class StaticNonTrivialMethods {

  // we get a test for this before and after merge of PR 4890
  public static String getBase() {
    String x = "hello";
    x.getBytes(StandardCharsets.UTF_8);
    return x;
  }

}
