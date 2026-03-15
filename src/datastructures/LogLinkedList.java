package datastructures;

import models.LogEntry;

public class LogLinkedList {

    private class Node {
        LogEntry data;
        Node next;

        Node(LogEntry data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public void addLog(LogEntry log) {
        Node newNode = new Node(log);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void displayLogs() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }
}