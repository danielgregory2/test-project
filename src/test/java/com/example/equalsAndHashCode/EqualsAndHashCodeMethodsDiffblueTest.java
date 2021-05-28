package com.example.equalsAndHashCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class EqualsAndHashCodeMethodsDiffblueTest {
  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new EqualsAndHashCodeMethods("foo")).equals("42"));
    assertFalse((new EqualsAndHashCodeMethods("foo")).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(101605, (new EqualsAndHashCodeMethods("foo")).hashCode());
  }
}

