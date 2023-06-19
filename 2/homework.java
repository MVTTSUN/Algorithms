public class homework {
  public static void main(String[] args) {
    ListNode head = new ListNode(65);
    ListNode node2 = new ListNode(23);
    ListNode node3 = new ListNode(4);
    ListNode node4 = new ListNode(78);

    head.next = node2;
    node2.next = node3;
    node3.next = node4;

    ListNode current = head;
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }

    System.out.println();

    head = reverseList(head);

    current = head;
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }
  }

  static class ListNode {
    int value;
    ListNode next;

    ListNode(int x) {
      value = x;
    }
  }

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;
    return head;
  }
}