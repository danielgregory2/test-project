// Copyright 2021 Diffblue Limited. All Rights Reserved.
// Unpublished proprietary source code.
// Use is governed by https://docs.diffblue.com/licenses/eula
package io.diffblue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyClassUnderTest {

  private List<String> list;
  private List<String> listCollection;
  private List<String> listObject;
  private List<String> emptyListObject;

  private static class MyPrivateList<T> extends ArrayList<T> {
    private static final long serialVersionUID = 0;
  }

  private MyPrivateList<String> myPrivateList;

  public MyClassUnderTest() {
    this.list = new ArrayList<>();
    this.list.add("foo");
    this.listCollection = new ArrayList<>();
    this.listCollection.add("foo");
    this.listObject = new ArrayList<>();
    this.listObject.add("foo");
    this.myPrivateList = new MyPrivateList<>();
    this.myPrivateList.add("foo");
    this.emptyListObject = new ArrayList<>();
  }

  public List<String> getList() {
    return list;
  }

  public Collection<String> getListAsCollection() {
    return listCollection;
  }

  public Object getListAsObject() {
    return listObject;
  }

  public Object getPrivateListAsObject() {
    return myPrivateList;
  }

  public Object getEmptyListAsObject() {
    return emptyListObject;
  }

}
