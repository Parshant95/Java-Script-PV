import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class arraytolinked {
    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        if (arrayList.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node head = new Node(arrayList.get(0)); 
        Node current = head;

        for (int i = 1; i < arrayList.size(); i++) {
            current.next = new Node(arrayList.get(i)); 
            current = current.next;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");


    }
}
