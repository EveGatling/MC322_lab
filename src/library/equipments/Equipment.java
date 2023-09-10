package library.equipments;

import library.constants.Equipment.Category;

public class Equipment {
  protected Category category;

  public Equipment(Category category) {
    this.category = category;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
