// Copyright 2021 Diffblue Limited. All Rights Reserved.
// Unpublished proprietary source code.
// Use is governed by https://docs.diffblue.com/licenses/eula
package com.example.equalsAndHashCode;

import java.util.Objects;

public class EqualsAndHashCodeMethodsWithException {

  private final String x;

  public EqualsAndHashCodeMethodsWithException(String x) {
    this.x = x;
  }

  @Override
  public boolean equals(Object o) {
    // weird
    throw new RuntimeException();
  }

  @Override
  public int hashCode() {
    return Objects.hash(x);
  }
}
