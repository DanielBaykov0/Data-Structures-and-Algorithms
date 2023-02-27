import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainCircularQueue {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        CircularQueue queue = new CircularQueue(5);

//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.remove();
//        queue.add(marySmith);
//        queue.remove();
//        queue.add(mikeWilson);
//        queue.remove();
//        queue.add(billEnd);
//        queue.remove();
//        queue.add(janeJones);
//
//        queue.printQueue();

//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);

//        queue.printQueue();

//        queue.remove();
//        queue.remove();
//        queue.printQueue();

//        System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();

//        queue.add(mikeWilson);
//        queue.printQueue();

        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < string.toLowerCase().toCharArray().length; i++) {
            char c = string.toLowerCase().charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.add(c);
            }
        }

        return queue.remove().toString().equals(stack.pop().toString());
    }
}
