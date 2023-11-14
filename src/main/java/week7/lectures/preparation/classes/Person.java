package week7.lectures.preparation.classes;

import java.util.*;
import java.util.stream.Stream;

public class Person {
    private String name;
    private int age;
    private List<Order> orders;

    public Person(String name, int age, List<Order> orders) {
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

class MainRun {
    public static void main(String[] args) {
        HashMap<Item, Integer> itemList = new HashMap<>();
        itemList.put(new Honey("123", "Pravi med", 30.00, HoneyType.LIVADSKI), 2);
        itemList.put(new Milk("222", "Meggle", 2.70, 3.8), 5);

        List<HashMap<Item, Integer>> items = new ArrayList<>();
        items.add(itemList);

        Order firstOrder = new Order(
                String.valueOf(1),
                new Date(System.currentTimeMillis()),
                items
        );

        HashMap<Item, Integer> secondItemList = new HashMap<>();
        secondItemList.put(new Honey("777", "Nije pravi med", 28.00, HoneyType.LIVADSKI), 5);
        secondItemList.put(new Milk("222", "Meggle", 2.70, 3.8), 5);
        secondItemList.put(new Milk("999", "Nase mlijeko", 2.20, 3.2), 4);

        List<HashMap<Item, Integer>> itemsSecond = new ArrayList<>();
        itemsSecond.add(secondItemList);

        Order secondOrder = new Order(
                String.valueOf(2),
                new Date(System.currentTimeMillis()),
                itemsSecond
        );

        Person becir = new Person("Becir", 29, Arrays.asList(firstOrder));
        becir.setOrders(
                Stream.concat(
                        becir.getOrders().stream(),
                        Arrays.asList(secondOrder).stream()
                ).toList()
        );


        // Some marketplace
        List<Person> personList = new ArrayList<>();
        personList.add(becir);

        for (Person p : personList){
            System.out.println("Person " + p.getName() + " account: ");
            for (Order o : p.getOrders()){
                System.out.println("Order " + o.getOrderNo() + " belongs to " + p.getName());
                for (Map<Item, Integer> i : o.getItems()){
                    for (Item it : i.keySet()){
                        System.out.println(
                                "Item " + it.getBarcode() + " contains " + i.get(it)
                        );
                    }
                }
            }
        }
    }
}
