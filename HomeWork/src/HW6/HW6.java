package HW6;
public class HW6 {
    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<Integer>(8);

        System.out.println("Is stack empty: " + stack.isEmpty());

        for (int index = 0; index < 10; index += 1) {
            stack.push(index);
        }

        System.out.println("In stack " + stack.getSize() + " elements");
        System.out.println("Last element: " + stack.peek());

        stack.pop();

        System.out.println("In stack " + stack.getSize() + " elements");
        System.out.println("Last element: " + stack.peek());
    };
}
