package datastructures;

import java.util.LinkedList;
import java.util.Queue;
import models.Visitor;

public class VisitorQueue {

    private Queue<Visitor> queue;

    public VisitorQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Visitor visitor) {
        queue.add(visitor);
    }

    public Visitor dequeue() {

        if (queue.isEmpty()) {
            System.out.println("No visitors in queue.");
            return null;
        }

        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("Visitor queue is empty.");
            return;
        }

        for (Visitor visitor : queue) {
            System.out.println(visitor);
        }
    }
}