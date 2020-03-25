package cn.xpbootcamp.gilded_rose;

class NormalProduct extends Product {
  NormalProduct(int sellIn, int quality, int depreciationPerDay) {
    super(sellIn, quality, depreciationPerDay);
  }

  @Override
  int getQuality(int passedDays) {
    return 0;
  }
}
