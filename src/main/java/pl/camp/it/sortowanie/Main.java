package pl.camp.it.sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("Mateusz");
        list.add("Janusz");
        list.add("Karol");
        list.add("Artur");
        list.add("Roman");*/

        /*List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(15);
        list.add(0);
        list.add(20);*/

        List<Car> list = new ArrayList<>();
        list.add(new Car("Toyota", "Corolla", 130));
        list.add(new Car("Audi", "A5", 250));
        list.add(new Car("BMW", "5", 350));
        list.add(new Car("Fiat", "Multipla", 30));
        list.add(new Car("Honda", "Civic", 120));

        /*Comparator<Car> porownywacz = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };*/

        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println("Sortowanie po marce rosnąco !!");
        System.out.println(list);

        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println("Sortowanie po marce malejąco !!");
        System.out.println(list);

        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println("Sortowanie po cenie rosnaco !!");
        System.out.println(list);


    }
}
