package programs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class _13_QueueATaleOfTwoStacks {

	public static class MyQueue<T> {
        Deque<T> d = new ArrayDeque<>();

        public void enqueue(T value) { // Push onto newest stack
            d.addLast(value);
        }

        public T peek() {
             return d.getFirst();
        }

        public T dequeue() {
            return d.removeFirst();
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}
