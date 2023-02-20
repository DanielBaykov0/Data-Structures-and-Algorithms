public class Doubly {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList employeeDoublyLinkedList = new EmployeeLinkedList();

        employeeDoublyLinkedList.addToFront(janeJones);
        employeeDoublyLinkedList.addToFront(johnDoe);
        employeeDoublyLinkedList.addToFront(marySmith);
        employeeDoublyLinkedList.addToFront(mikeWilson);

        employeeDoublyLinkedList.printList();
//        System.out.println(employeeDoublyLinkedList.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        employeeDoublyLinkedList.addBefore(billEnd, johnDoe);

        employeeDoublyLinkedList.printList();
//        System.out.println(employeeDoublyLinkedList.getSize());
//
//        employeeDoublyLinkedList.removeFromFront();
//        employeeDoublyLinkedList.printList();
//        System.out.println(employeeDoublyLinkedList.getSize());
//
//        employeeDoublyLinkedList.removeFromEnd();
//        employeeDoublyLinkedList.printList();
//        System.out.println(employeeDoublyLinkedList.getSize());
    }
}
