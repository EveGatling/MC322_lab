package library.equipments;

import library.constants.Equipment.Category;

public class Printing extends Equipment {
  protected String name;

  public Printing(String name, int id) {
    super(Category.PRINTING, id);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
