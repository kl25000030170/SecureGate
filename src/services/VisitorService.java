package services;

import datastructures.VisitorQueue;
import models.Visitor;
import utils.DateTimeUtil;

public class VisitorService {

    private VisitorQueue visitorQueue;

    public VisitorService() {
        visitorQueue = new VisitorQueue();
    }

    public void registerVisitor(String name, String purpose) {

        String time = DateTimeUtil.getCurrentTimestamp();

        Visitor visitor = new Visitor(name, purpose, time);

        visitorQueue.enqueue(visitor);

        System.out.println("Visitor registered and added to queue.");
    }

    public void processNextVisitor() {

        Visitor visitor = visitorQueue.dequeue();

        if (visitor != null) {
            System.out.println("Processing visitor → " + visitor);
        }
    }

    public void displayVisitors() {
        visitorQueue.displayQueue();
    }
}