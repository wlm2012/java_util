package wlm.leecode;

class Solution {

    public int balancedStringSplit(String s) {
        int nums = 0;
        int i = 0;
        for (char c : s.toCharArray()) {
            i = 'L' == c ? i + 1 : i - 1;
            if (i == 0) {
                nums++;
            }
        }
        return nums;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    int[] n = { i, j };
                    return n;
                }
            }
        }
        return null;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        int val1 = 0;
        int val2 = 0;

        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        while (null != l1 || null != l2 || 1 == i) {
            cur.next = new ListNode(0);
            cur = cur.next;
            val1 = null == l1 ? 0 : l1.val;
            val2 = null == l2 ? 0 : l2.val;
            if ((val1 + val2 + i) > 9) {
                cur.val = (val1 + val2 + i) % 10;
                i = 1;
            } else {
                cur.val = val1 + val2 + i;
                i = 0;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }

        return listNode.next;
    }

    public static void main(String[] args) {
        /*
         * ListNode l1=new ListNode(5); l1.next=new ListNode(4); l1.next.next=new
         * ListNode(3);
         * 
         * ListNode l2=new ListNode(5); l2.next=new ListNode(6); l2.next.next=new
         * ListNode(4); Solution solution=new Solution();
         * 
         * ListNode listNode=solution.addTwoNumbers(l1,l2);
         * System.out.println(listNode.val+""+listNode.next.val+listNode.next.next.val);
         */

        Solution solution = new Solution();
        solution.balancedStringSplit("RLRRLLRLRL");
    }
}