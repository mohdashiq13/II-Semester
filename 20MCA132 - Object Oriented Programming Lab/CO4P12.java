import java.util.Stack;
public class CO4P12 {
    public static <T> void removeByPosition(Stack<T> stack, int position) {
        if (position < 1 || position > stack.size()) {
            System.out.println("Invalid position.");
            return;
        }
        Stack<T> tempStack = new Stack<>();
        int count = 1;
        while (!stack.isEmpty()) {
            if (count == position) {
                stack.pop(); // Remove the element at the specified position
                break;
            }
            tempStack.push(stack.pop());
            count++;
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        System.out.println("Original Stack: " + stack);
        int positionToRemove = 2;
        removeByPosition(stack, positionToRemove);
        System.out.println("Stack after removing element at position " + positionToRemove + ": " + stack);
    }
}
