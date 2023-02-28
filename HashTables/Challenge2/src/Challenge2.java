import java.util.*;

public class Challenge2 {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        Map<Integer, Employee> map = new HashMap<>();
        List<Employee> remove = new ArrayList<>();

        for (Employee employee : employees) {
            if (map.containsKey(employee.getId())) {
                remove.add(employee);
            } else {
                map.put(employee.getId(), employee);
            }
        }

        for (Employee employee : remove) {
            employees.remove(employee);
        }

        System.out.println("==================================================");

        employees.forEach(System.out::println);
    }
}
