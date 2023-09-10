package library.equipments;

import library.constants.Equipment.Category;

public class Audiovisual extends Equipment {
  protected String name;

  public Audiovisual(String name) {
    super(Category.AUDIOVISUAL);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
