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

    public void display() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void delete(int data) {
        if (head == null)
            return;
        Node n = head;
        while (n.next != null) {
            if (n.next.data != data)
                n = n.next;
            else
                break;
        }
        n.next = n.next.next;
    }

    public void deleteAt(int pos) {
        if (head == null || pos < 1)
            return;
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node n = head;
        for (int i = 1; i < pos - 2; i++) {
            n = n.next;
        }
        n.next = n.next.next;
    }
}

public class delete {
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
        list.display();
        System.out.println("Enter the position where you want to delete");
        int pos = sc.nextInt();
        list.deleteAt(pos);
        list.display();
        System.out.println("Enter the data that you want to delete");
        int data = sc.nextInt();
        list.delete(data);
        list.display();
    }
}
