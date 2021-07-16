package com.example.equalsAndHashCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StaticMethodsDiffblueTest {
  @Test
  public void testHello() {
    // Arrange, Act and Assert
    assertEquals("hello daniel", StaticMethods.hello());
  }
}

