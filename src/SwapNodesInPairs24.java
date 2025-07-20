public class SwapNodesInPairs24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;

        while (head != null && head.next != null) {
            // * 1 2 3 4

            ListNode first = head; // 1 - 2 - 3 -4
            ListNode second = head.next; // 2 - 3 - 4

            pre.next = second; // 0 - 2 - 3 - 4
            first.next = second.next; // 1 - 3 - 4
            second.next = first; // 2 - 1 - 3 - 4

            pre = first; // 1 - 3 - 4
            head = first.next; // 3 - 4
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = swapPairs(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
