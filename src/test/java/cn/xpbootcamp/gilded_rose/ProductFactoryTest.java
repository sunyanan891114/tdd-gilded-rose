package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductFactoryTest {
  @Test
  void get_factory_should_return_normal_product_when_pass_in_normal() {
    ProductFactory productFactory = new ProductFactory();
    Product product = productFactory.getShape(ProductType.NORMAL_PRODUCT, 0, 0, 1);
    assertTrue(product instanceof NormalProduct);
  }
  @Test
  void get_factory_should_return_backstage_pass_when_pass_in_backstage_pass() {
    ProductFactory productFactory = new ProductFactory();
    Product product = productFactory.getShape(ProductType.BACKSTAGE_PASS, 0, 0, 1);
    assertTrue(product instanceof BackstagePass);
  }  @Test
  void get_factory_should_return_aged_brie_product_when_pass_in_aged_brie() {
    ProductFactory productFactory = new ProductFactory();
    Product product = productFactory.getShape(ProductType.AGEDBRIE, 0, 0, 1);
    assertTrue(product instanceof AgedBrie);
  }  @Test
  void get_factory_should_return_sulfuras_product_when_pass_in_sulfuras() {
    ProductFactory productFactory = new ProductFactory();
    Product product = productFactory.getShape(ProductType.SULFURAS, 0, 0, 1);
    assertTrue(product instanceof Sulfuras);
  }
}
