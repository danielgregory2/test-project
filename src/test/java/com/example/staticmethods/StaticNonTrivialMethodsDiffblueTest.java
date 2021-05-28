package com.example.staticmethods;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StaticNonTrivialMethodsDiffblueTest {

  //  Created using Diffblue Cover 2021.06.01-SNAPSHOT-abf08f7
  // This was before https://github.com/diffblue/cover/pull/4890 got merged in
  // so as expected we don't see the bug.

  // Notice we never did get any tests for `StaticTrivialMethods`
  @Test
  public void testGetBase() {
    // Arrange, Act and Assert
    assertEquals("hello", StaticNonTrivialMethods.getBase());
  }
}

