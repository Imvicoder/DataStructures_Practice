import java.util.Scanner;

/**
 * Created by Descent-Vikas on 31-05-2017.
 */
public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void InsertNode(int index, int data) {
        Node temp = new Node(data);
        if (index == 0) {
            temp.next = head;
            head = temp;
        } else {
            Node temp1 = head;
            for (int i = 0; i <= index - 2; i++) {
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next = temp;
        }
    }

    public void printlist() {
        Node var = head;
        while (var != null) {
            System.out.print(var.data + " ");
            var = var.next;
        }
    }

    public static void main(String... args) {
        LinkedList list = new LinkedList();
        //System.out.println("Head is:->"+list.head);

        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to insert data ??");
        int test = sc.nextInt();
        while (test-- > 0) {

            System.out.println("Enter the index where you want to insert data ??");
            int indexTo = sc.nextInt();
            System.out.println("Enter the data");
            int d = sc.nextInt();
            System.out.println("Inserting node at" + indexTo + "th index with " + d);
            list.InsertNode(indexTo, d);
        }
        System.out.println("Printing List");
        list.printlist();
    }
}
