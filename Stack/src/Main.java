import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack =  new Stack<String>();
        stack.push("BGMI");
        stack.push("Genshin Impact");
        stack.push("MLBB");
        stack.push("Subway Surfers");

        // before removing the last element
        System.out.println(stack);

        String popElement = stack.pop();

        // after removing
        System.out.println(stack);
        System.out.println(popElement);

    }
}