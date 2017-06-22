package sages.bootcamp;

public class Shop {
  private Storage storage;

  public Shop(Storage storage) {
    this.storage = storage;
  }

  public String getProductsView() {
    return String.join(
        ", ",
        storage.retrieve()
    );
  }
}
