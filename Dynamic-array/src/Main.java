public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add('B');
        dynamicArray.add('C');
        dynamicArray.add('D');
        dynamicArray.add('E');
        dynamicArray.add('R');
        dynamicArray.add('F');

        dynamicArray.insert(0, 'A');
        System.out.println(dynamicArray);
        dynamicArray.delete("A");
        System.out.println(dynamicArray. search("R"));
        System.out.println("size: " + dynamicArray.size);
        System.out .println("capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }
}