package library.equipments;

import library.constants.Equipment.Category;

public class Audiovisual extends Equipment {
  protected String name;

  public Audiovisual(String name, int id) {
    super(Category.AUDIOVISUAL, id);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
