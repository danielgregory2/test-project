package com.example.staticmethods;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// This test was generated using Diffblue even though it doesn't end in DiffblueTest
public class StaticNonTrivialMethodsAfterMergeTest {

  //  Created using Diffblue Cover 2021.06.01-SNAPSHOT-abf08f7
  // This was AFTER https://github.com/diffblue/cover/pull/4890 got merged in.

  // Notice we never did get any tests for `StaticTrivialMethods` or `Currency`.

  @Test
  public void testGetBase() {
    // Arrange, Act and Assert
    assertEquals("hello", StaticNonTrivialMethods.getBase());
  }
}

