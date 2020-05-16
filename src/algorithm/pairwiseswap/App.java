package algorithm.pairwiseswap;

public class App {
    private final static int[] ARR = { 1, 2, 2, 4, 5, 6, 7, 8 };
    private static Node head;
    private static Node last;

    public static void main(String[] args) {
        for (int item : ARR) {
            addToTheLast(new Node(item));
        }

        Node result = pairwiseSwap(head);
        printList(result);
    }

    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            last = head;
        } else {
            last.next = node;
            last = last.next;
        }
    }

    private static Node pairwiseSwap(Node node) {
        if(node.next == null)
            return node;

        int counter = 1;
        Node head = new Node(node.next.data);
        head.next = node;
        node.next = node.next.next;

        Node previousNode = node;

        while(node != null) {
            if(counter++ > 1 && node.next != null) {
                Node nextNode = node.next;
                previousNode.next = nextNode;
                node.next = nextNode.next;
                nextNode.next = node;
            }

            previousNode = node;
            node = node.next;
        }

        return head;
    }
}