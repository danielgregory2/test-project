package com.example.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LeftRightStaticLongDiffblueTest {
  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertEquals(-9223372036854775805L, LeftRightStaticLong.sum(Long.MAX_VALUE, 4L));
  }

  @Test
  public void testMult() {
    // Arrange, Act and Assert
    assertEquals(0L, LeftRightStaticLong.mult(0L, 1L));
  }

  @Test
  public void testDivide() {
    // Arrange, Act and Assert
    assertEquals(-1L, LeftRightStaticLong.divide(1L, -1L));
    assertThrows(ArithmeticException.class, () -> LeftRightStaticLong.divide(1L, 0L));
  }
}

