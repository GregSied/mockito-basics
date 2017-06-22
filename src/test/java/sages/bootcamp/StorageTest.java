package sages.bootcamp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StorageTest {

  // na początku storage jest pusty
  @Test
  public void shouldBeEmptyAfterCreation() {
    // given
    Storage storage = new Storage();
    List<String> expectedProducts = new ArrayList<>();

    // when
    List<String> actualProducts = storage.retrieve();

    // then
    assertEquals(expectedProducts, actualProducts);
  }

  // co wsadzę za pomocę store, wyciągam za pomocą retrieve
  @Test
  public void shouldRetrieveStoredProducts() {
    // given
    Storage storage = new Storage();
    List<String> expectedProducts = Arrays.asList("kawa", "mleko", "chleb");

    // when
    storage.store(expectedProducts);
    List<String> actualProducts = storage.retrieve();

    // then
    assertEquals(expectedProducts, actualProducts);
  }
}