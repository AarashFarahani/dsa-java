package leetcode.remove.nth.node.from.end.of.list;

import java.util.HashMap;
import java.util.Map;

public class App {
    private final static int[] ARR1 = { 1, 2, 3, 4, 5 };
    private final static int[] ARR2 = { 1 };
    private final static int[] ARR3 = { 1, 2 };

    private ListNode head;
    private ListNode last;

    public static void main(String[] args) {
        ListNode head = new App().buildListNode(ARR1);
        printList(head);
        System.out.println();
        head = new App().removeNthFromEnd(head, 2);
        printList(head);
        System.out.println();
        System.out.println("******************************");

        head = new App().buildListNode(ARR2);
        printList(head);
        System.out.println();
        head = new App().removeNthFromEnd(head, 2);
        printList(head);
        System.out.println();
        System.out.println("******************************");

        head = new App().buildListNode(ARR3);
        printList(head);
        System.out.println();
        head = new App().removeNthFromEnd(head, 2);
        printList(head);
    }

    private ListNode buildListNode(int[] arr) {
        for (int item : arr) {
            addToTheLast(new ListNode(item));
        }

        return head;
    }

    private void addToTheLast(ListNode node) {
        if (head == null) {
            head = node;
            last = head;
        } else {
            last.next = node;
            last = last.next;
        }
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode node = head;

        int counter = 1;
        while (node != null) {
            map.put(counter++, node);
            node = node.next;
        }

        ListNode previousNode = map.get(counter - n - 1);
        ListNode nextNode = map.get(counter - n + 1);

        if(previousNode == null && nextNode == null)
            return null;
        else if(previousNode == null && nextNode != null)
            return nextNode;
        else
            previousNode.next = nextNode;

        return head;
    }
}
