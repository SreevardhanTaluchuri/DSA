import java.util.*;

class LinkedList {
    private class Node {
        int data;
        Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node node = new Node(data);
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void insertAt(int data, int pos) {
        if (head == null)
            return;

        Node n = head;
        for (int i = 1; i < pos - 1; i++) {
            n = n.next;
        }
        Node node = new Node(data);
        node.next = n.next;
        n.next = node;
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void display() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers(to stop enter -1 at end):");
        LinkedList list = new LinkedList();
        while (true) {
            int data = sc.nextInt();
            if (data == -1) {
                break;
            }
            list.append(data);
        }
        list.insertAt(8, 5);
        list.insertAt(3, 4);
        list.insertAt(7, 3);
        list.insert(1);
        list.display();
    }
}
