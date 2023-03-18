package houses;

// Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
// В методе toString() выводите в удобном виде всю известную информацию о доме.

// Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":
//   для частного дома выводите на экран: "Вы снесли частный дом";
public class PrivatHouse extends House {

  public PrivatHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return String.format("Частный дом - %s", getAddress());
  }

  @Override
  public void raze(){
    System.out.println("Вы снесли частный дом");
  }

}
