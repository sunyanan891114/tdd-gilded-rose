package cn.xpbootcamp.gilded_rose;

public class ProductFactory {
  Product getShape(ProductType type, int sellIn, int quality, int depreciationPerDay) {
    switch (type) {
      case AGEDBRIE:
        return new AgedBrie(sellIn, quality, depreciationPerDay);
      case BACKSTAGE_PASS:
        return new BackstagePass(sellIn, quality, depreciationPerDay);
      case SULFURAS:
        return new Sulfuras(sellIn, quality, depreciationPerDay);
      default:
        return new NormalProduct(sellIn, quality, depreciationPerDay);
    }
  }
}
