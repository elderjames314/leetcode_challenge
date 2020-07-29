package challenge;

public class LinkedListGroupOddEven {
    public static void main(String[] args) {

    }

    public static ListNode groupLinkedListNode(ListNode head) {
        // 1, 2, 3, 4, 5, null
        // 1, 3, 5, 2, 5

        if(head != null || head.next != null)
            return head.next;
        ListNode hOdd = head;
        ListNode hEven = head.next;
        ListNode odd = hOdd;
        ListNode even =hEven;

        while (even != null) {
            if(even.next != null)
                odd.next = even.next;
            else {
                odd.next = hEven;
                return hOdd;
            }
            odd = odd.next;
            even.next = odd.next;
            even = even.next;


        }
        odd.next = hEven;
        return hOdd;
    }
}

 //Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
