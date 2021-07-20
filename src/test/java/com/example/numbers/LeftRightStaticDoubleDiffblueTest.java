package com.example.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LeftRightStaticDoubleDiffblueTest {
  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, LeftRightStaticDouble.sum(Double.NaN, 10.0));
  }

  @Test
  public void testMult() {
    // Arrange, Act and Assert
    assertEquals(2.5, LeftRightStaticDouble.mult(1.0, 2.5));
  }

  @Test
  public void testDivide() {
    // Arrange, Act and Assert
    assertEquals(-20.0, LeftRightStaticDouble.divide(10.0, -0.5));
  }
}

