import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("apples");
        linkedList.push("oranges");
        linkedList.push("grapes");
        linkedList.push("guava");

        System.out.println(linkedList);

        linkedList.add(3, "Strawberries");
        linkedList.addFirst("Avocado");
        linkedList.addLast("Kiwi");

        System.out.println(linkedList);
    }
}