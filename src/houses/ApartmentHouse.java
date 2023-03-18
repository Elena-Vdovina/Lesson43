package houses;

// Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
// При создании многоквартирного дома дополнительно принимайте в конструкторе целое
// число - количество подъездов.
// В методе toString() выводите в удобном виде всю известную информацию о доме.
public class ApartmentHouse extends House {

  private int entrance;

  public ApartmentHouse(String address, int entrance) {
    super(address);
    this.entrance = entrance;
  }

  @Override
  public String toString() {
    return String.format("Многоквартирный дом (%d подъездов) - %s", entrance, getAddress());
  }
}
