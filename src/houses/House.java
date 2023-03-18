package houses;

// Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
// Напишите для адреса сеттер и геттер.
public abstract class House {

  private String address;

  public House(String address) {
    this.address = address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }
}
