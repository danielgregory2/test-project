// Copyright 2021 Diffblue Limited. All Rights Reserved.
// Unpublished proprietary source code.
// Use is governed by https://docs.diffblue.com/licenses/eula
package com.example.equalsAndHashCode;

import java.util.Objects;

public class EqualsAndHashCodeMethodsEqualsAlwaysTrue {

  private final String x;

  public EqualsAndHashCodeMethodsEqualsAlwaysTrue(String x) {
    this.x = x;
  }

  @Override
  public boolean equals(Object o) {
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x);
  }
}
