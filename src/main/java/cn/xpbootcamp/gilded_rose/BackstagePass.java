package cn.xpbootcamp.gilded_rose;

class BackstagePass extends Product {
  BackstagePass(int sellIn, int quality, int depreciationPerDay) {
    super(sellIn, quality, depreciationPerDay);
  }

  @Override
  int getQuality(int passedDays) {
    return 0;
  }
}
