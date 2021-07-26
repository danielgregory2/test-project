package com.example.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RealisticNumbersDiffblueTest {
  @Test
  public void testSumInt() {
    // Arrange, Act and Assert
    assertEquals(2, RealisticNumbers.sumInt(1, 1));
  }

  @Test
  public void testProductInt() {
    // Arrange, Act and Assert
    assertEquals(1, RealisticNumbers.productInt(1, 1));
  }

  @Test
  public void testPowerInt() {
    // Arrange, Act and Assert
    assertEquals(1.0, RealisticNumbers.powerInt(1, 1));
  }

  @Test
  public void testCreateDateFromInts() {
    // Arrange, Act and Assert
    assertEquals("0001-01-01", RealisticNumbers.createDateFromInts(1, 1, 1).toString());
  }

  @Test
  public void testFindById() {
    // Arrange, Act and Assert
    assertEquals(1.0, RealisticNumbers.findById(1));
  }
}

