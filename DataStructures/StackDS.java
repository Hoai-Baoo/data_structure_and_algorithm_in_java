import java.util.Stack;
public class StackDS {
    
    public static void main(String[] args) {

        //stack = LIFO data structure. Last-in First-in
        //        stores objects into a sort of "vertical tower"
        //        push() to add to the top
        //        pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft"); //3
        stack.push("Skyrim"); //2
        stack.push("DOOM"); //1

        String myFavGame = stack.pop();

        System.out.println(stack);
        System.out.println(myFavGame);
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search("Skyrim"));

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling a functions (call stack in heap memory)
    }
}
