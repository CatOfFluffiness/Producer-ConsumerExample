import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

public class Worker {
    /*private Queue toDoQueue; // у рабочего есть ссылка на очередь из заданий
    public Worker(Queue toDoQueue) {
        this.toDoQueue = toDoQueue; // даем ссылку на очередь в конструкторе
    }
    public void takeTask() {
        Object task = toDoQueue.poll(); // вынимаем задание из очереди
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }*/

    private Stack toDoStack; // у рабочего есть ссылка на стек из заданий
    public Worker(Stack toDoStack) {
        this.toDoStack = toDoStack; // даем ссылку на стек в конструкторе
    }
    public void takeTask() {
        try {
            Object task = toDoStack.pop(); // вынимаем задание из стека
            if (task != null) {
                System.out.println("Выполняю задачу: " + task);
            }
        } catch (EmptyStackException e) {
            System.out.println("Нет работы! Можно идти домой");;
        }
    }
}