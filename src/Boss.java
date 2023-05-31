import java.util.Queue;
import java.util.Stack;
public class Boss {
    /*private Queue toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Queue toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    } */

    private Stack toDoStack;// у босса тоже есть ссылка на стек из заданий
    public Boss(Stack toDoStack) {
        this.toDoStack = toDoStack;// даем ссылку на стек в конструкторе
    }
    public void giveTask(String task) {
        toDoStack.add(task); // кладем задание в стек
        System.out.println("Дал задачу " + task);
    }

}