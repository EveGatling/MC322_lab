package library.equipments;

import library.actions.Reservable;
import library.constants.Equipment.Category;

public class Equipment extends Reservable {
  protected Category category;

  public Equipment(Category category, int id) {
    super(id);
    this.category = category;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
