import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {

        List<Employee> employee1List = new ArrayList<>();
        employee1List.add(new Employee("Jane", "Jones", 123));
        employee1List.add(new Employee("John", "Doe", 4567));
        employee1List.add(new Employee("Mary", "Smith", 22));
        employee1List.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employee1List.set(1, new Employee("John", "Adams", 4568));
//        employeeList.forEach(System.out::println);
//
//        System.out.println(employeeList.size());
//
        employee1List.add(3, new Employee("John", "Doe", 4567));
//        employeeList.forEach(System.out::println);

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee : employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println(employee1List.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employee1List.indexOf(new Employee("John", "Doe", 4567)));

        employee1List.remove(2);
        employee1List.forEach(System.out::println);
    }
}
