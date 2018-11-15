package com.training.LeetCode;

/**
 *���������ǿ���������ʾ�����Ǹ�������λ����������ʽ�洢�����ǵ�ÿ���ڵ�ֻ�洢�������֡���������ӷ���һ���µ�������
 *
 * ����Լ���������� 0 ֮�⣬���������ֶ��������㿪ͷ��
 *
 * ʾ����
 *
 * ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * �����7 -> 0 -> 8
 * ԭ��342 + 465 = 807
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }