public class MainHashTable {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        HashTable hashTable = new HashTable();
        hashTable.put("Jones",janeJones);
        hashTable.put("Doe",johnDoe);
        hashTable.put("Wilson",mikeWilson);
        hashTable.put("Smith",marySmith);

        hashTable.printHashTable();

        System.out.println("Retrieve key Wilson: "+hashTable.get("Wilson"));
        System.out.println("Retrieve key Mary: "+hashTable.get("Smith"));
    }
}
