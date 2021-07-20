package com.example.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class XYStaticIntsDiffblueTest {
  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertEquals(11, XYStaticInts.sum(4, 7));
  }

  @Test
  public void testSum2() {
    // Arrange, Act and Assert
    assertEquals(-21, XYStaticInts.sum2(-20, -1));
  }

  @Test
  public void testSum3() {
    // Arrange, Act and Assert
    assertEquals(-16, XYStaticInts.sum3(4, -20));
  }

  @Test
  public void testSum4() {
    // Arrange, Act and Assert
    assertEquals(6, XYStaticInts.sum4(6, 0));
  }

  @Test
  public void testMult() {
    // Arrange, Act and Assert
    assertEquals(-4, XYStaticInts.mult(-1, 4));
  }

  @Test
  public void testMult2() {
    // Arrange, Act and Assert
    assertEquals(-80, XYStaticInts.mult2(4, -20));
  }

  @Test
  public void testMult3() {
    // Arrange, Act and Assert
    assertEquals(0, XYStaticInts.mult3(6, 0));
  }

  @Test
  public void testDivide() {
    // Arrange, Act and Assert
    assertEquals(20, XYStaticInts.divide(-20, -1));
    assertThrows(ArithmeticException.class, () -> XYStaticInts.divide(-20, 0));
  }
}

