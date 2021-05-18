package io.diffblue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import java.util.List;
import org.junit.Test;


// These tests were generated using: Diffblue Cover 2021.05.01-SNAPSHOT-7e666cc
// See this PR: https://github.com/diffblue/cover/pull/4640
public class MyClassUnderTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    MyClassUnderTest actualMyClassUnderTest = new MyClassUnderTest();

    // Assert
    Collection<String> listAsCollection = actualMyClassUnderTest.getListAsCollection();
    List<String> list = actualMyClassUnderTest.getList();
    assertEquals(listAsCollection, list);
    Object listAsObject = actualMyClassUnderTest.getListAsObject();
    assertEquals(listAsObject, list);
    assertEquals(listAsObject, listAsCollection);
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    MyClassUnderTest actualMyClassUnderTest = new MyClassUnderTest();

    // Assert
    assertTrue(((Collection<Object>) actualMyClassUnderTest.getEmptyListAsObject()).isEmpty());
    assertEquals(1, ((Collection<String>) actualMyClassUnderTest.getPrivateListAsObject()).size());
    Object listAsObject = actualMyClassUnderTest.getListAsObject();
    assertEquals(1, ((Collection<String>) listAsObject).size());
    assertEquals("foo", ((List<String>) listAsObject).get(0));
    Collection<String> listAsCollection = actualMyClassUnderTest.getListAsCollection();
    assertEquals(1, listAsCollection.size());
    assertEquals("foo", ((List<String>) listAsCollection).get(0));
    List<String> list = actualMyClassUnderTest.getList();
    assertEquals(1, list.size());
    assertEquals("foo", list.get(0));
  }
}

