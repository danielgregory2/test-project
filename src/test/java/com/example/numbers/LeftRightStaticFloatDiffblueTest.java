package com.example.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LeftRightStaticFloatDiffblueTest {
  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertEquals(Float.NaN, LeftRightStaticFloat.sum(Float.NaN, 0.0f));
  }

  @Test
  public void testMult() {
    // Arrange, Act and Assert
    assertEquals(2.0f, LeftRightStaticFloat.mult(0.5f, 4.0f));
  }

  @Test
  public void testDivide() {
    // Arrange, Act and Assert
    assertEquals(0.0f, LeftRightStaticFloat.divide(0.0f, 2.0f));
  }
}

