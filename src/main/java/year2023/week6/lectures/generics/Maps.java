package year2023.week6.lectures.generics;

import java.util.HashMap;
import java.util.Map;

class Maps {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Becir", 12345);
        employees.put("Adnan", 2343242);
        employees.put("Amila", 23432423);

        System.out.println(employees);

        System.out.println(employees.get("Becir"));

        System.out.println(employees.containsKey("Becir"));

        System.out.println(employees.containsValue(12345));

        employees.replace("Becir", 88888);

        employees.putIfAbsent("John", 888832423);

        System.out.println(employees);

        employees.remove("John");

        System.out.println(employees);
    }
}
