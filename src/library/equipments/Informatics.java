package library.equipments;

import library.constants.Equipment.Category;

public class Informatics extends Equipment {
  protected String name;

  public Informatics(String name, int id) {
    super(Category.INFORMATICS, id);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
