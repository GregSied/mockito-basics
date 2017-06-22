package sages.bootcamp;

import java.util.ArrayList;
import java.util.List;

// na początku storage jest pusty
// co wsadzę za pomocę store, wyciągam za pomocą retrieve
public class Storage {
  private List<String> products = new ArrayList<>();

  List<String> retrieve() {
    return products;
  }

  void store(List<String> newProducts) {
    this.products = newProducts;
  }
}
