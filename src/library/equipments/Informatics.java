package library.equipments;

import library.constants.Equipment.Category;

public class Informatics extends Equipment {
  protected String name;

  public Informatics(String name) {
    super(Category.INFORMATICS);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
