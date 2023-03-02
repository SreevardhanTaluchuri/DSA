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

    public void edit(int data, int editData) {
        if (head == null)
            return;
        Node n = head;
        while (n.next != null) {
            if (n.data != data)
                n = n.next;
            else
                break;
        }
        n.data = editData;
    }

    public void editAt(int data, int pos) {
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
        n.data = n.data;
    }
}

public class edit {
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
        System.out.println("Enter the position where you want to edit and data");
        int pos = sc.nextInt();
        int data = sc.nextInt();
        list.editAt(data, pos);
        list.display();
        System.out.println("Enter the data that you want to edit");
        int editData = sc.nextInt();
        int _edit = sc.nextInt();
        list.edit(editData, _edit);
        list.display();
    }
}
