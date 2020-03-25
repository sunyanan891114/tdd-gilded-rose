package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Product{

  AgedBrie(int sellIn, int quality, int depreciationPerDay) {
    super(sellIn, quality, depreciationPerDay);
  }

  @Override
  int getQuality(int passedDays) {
    return Math.max(this.sellIn + passedDays * this.depreciationPerDay, MAX_QUALITY);
  }
}
