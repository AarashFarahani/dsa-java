package leetcode.rotate.list;

public class App {
    private final static int[] ARR1 = { 1, 2, 3, 4, 5 };
    private final static int[] ARR2 = { 0, 1, 2 };
    private final static int[] ARR3 = { };
    private final static int[] ARR4 = { 1, 2, 3 };

    private ListNode head;
    private ListNode last;

    public static void main(String[] args) {
        ListNode head = new App().buildListNode(ARR1);
        printList(head);
        System.out.println();
        head = new App().rotateRight(head, 2);
        printList(head);
        System.out.println();
        System.out.println("******************************");

        head = new App().buildListNode(ARR2);
        printList(head);
        System.out.println();
        head = new App().rotateRight(head, 4);
        printList(head);
        System.out.println();
        System.out.println("******************************");

        head = new App().buildListNode(ARR3);
        printList(head);
        System.out.println();
        head = new App().rotateRight(head, 1);
        printList(head);
        System.out.println();
        System.out.println("******************************");

        head = new App().buildListNode(ARR4);
        printList(head);
        System.out.println();
        head = new App().rotateRight(head, 2000000000);
        printList(head);
        System.out.println();
        System.out.println("******************************");
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

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        int length;
        for (length = 0; fast.next != null; length++) //Get the total length
            fast = fast.next;

        for (int i = length - k % length; i > 0; i--)
            slow = slow.next;

        fast.next = dummy.next; //Do the rotation
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }

//    private ListNode rotateRight(ListNode head) {
//        ListNode firstNode = new ListNode();
//        ListNode dummy = firstNode;
//        dummy.next = head;
//        ListNode previousNode = firstNode;
//
//        while (head != null) {
//            if (head.next == null) {
//                firstNode.val = head.val;
//                previousNode.next = null;
//                break;
//            }
//
//            previousNode = head;
//            head = head.next;
//        }
//
//        return dummy;
//    }
}
