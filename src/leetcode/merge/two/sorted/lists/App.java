package leetcode.merge.two.sorted.lists;

public class App {
    public static void main(String[] args) {
        var app = new App();
        display(app
                .mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4)))
                , new ListNode(1, new ListNode(3, new ListNode(4)))));         // [1,1,2,3,4,4]
        System.out.println("***************************************");
        display(app.mergeTwoLists(null, null));         // []
        System.out.println("***************************************");
        display(app.mergeTwoLists(null, new ListNode(0)));         // [0]
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    private static void display(ListNode listNode) {
        if (listNode == null) {
            System.out.println("[]");
            return;
        }
        System.out.println(listNode.val);
        if (listNode.next != null) {
            display(listNode.next);
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
