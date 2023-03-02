import java.util.*;

public class create {
    class Node {
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

    private Node head = null;

    private void append(int data) {
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

    private void display() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers(to stop enter -1 at end):");
        create list = new create();
        while (true) {
            int data = sc.nextInt();
            if (data == -1) {
                break;
            }
            list.append(data);
        }
        list.display();
    }

}