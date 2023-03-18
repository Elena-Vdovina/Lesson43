package houses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// В основном файле программы создайте список домов, в который поместите два частных дома
// и один многоквартирный.
// Выведите информацию о домах в списке с использованием цикла for-each.
public class Houses {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<House> houses = new ArrayList<>();
    String address1 = br.readLine();
    PrivatHouse ph1 = new PrivatHouse(address1);
    houses.add(ph1);
    String address2 = br.readLine();
    PrivatHouse ph2 = new PrivatHouse(address2);
    houses.add(ph2);
    String address3 = br.readLine();
    int entrance = Integer.parseInt(br.readLine());
    ApartmentHouse ah1 = new ApartmentHouse(address3, entrance);
    houses.add(ah1);
    for (House house : houses) {
      System.out.println(house.toString());
    }

  }
}
