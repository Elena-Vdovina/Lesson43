package houses;

// Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
// В методе toString() выводите в удобном виде всю известную информацию о доме.
public class PrivatHouse extends House {

  public PrivatHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return String.format("Частный дом - %s", getAddress());
  }

}
