package houses;

// Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
// При создании многоквартирного дома дополнительно принимайте в конструкторе целое
// число - количество подъездов.
// В методе toString() выводите в удобном виде всю известную информацию о доме.

// Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":
//   для многоквартирного дома выведите на экран: "Вы снесли многоквартирный дом. %d подъездов!"
//   Вместо %d должно быть число подъездов.
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

  @Override
  public void raze() {
    System.out.printf("Вы снесли многоквартирный дом. %d подъездов!", entrance);
  }
}
