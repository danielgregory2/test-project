// Copyright 2021 Diffblue Limited. All Rights Reserved.
// Unpublished proprietary source code.
// Use is governed by https://docs.diffblue.com/licenses/eula
package com.example.equalsAndHashCode;

import java.util.Objects;

public class EqualsAndHashCodeMethods {

  private final String x;

  public EqualsAndHashCodeMethods(String x) {
    this.x = x;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EqualsAndHashCodeMethods equalsAndHashCodeMethods = (EqualsAndHashCodeMethods) o;
    return Objects.equals(x, equalsAndHashCodeMethods.x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x);
  }
}
