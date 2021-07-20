package com.example.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LeftRightStaticIntsDiffblueTest {
  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertEquals(7, LeftRightStaticInts.sum(-1, 8));
  }

  @Test
  public void testMult() {
    // Arrange, Act and Assert
    assertEquals(20, LeftRightStaticInts.mult(4, 5));
  }

  @Test
  public void testDivide() {
    // Arrange, Act and Assert
    assertEquals(0, LeftRightStaticInts.divide(5, 7));
    assertThrows(ArithmeticException.class, () -> LeftRightStaticInts.divide(5, 0));
  }
}

