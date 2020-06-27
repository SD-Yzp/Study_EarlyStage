import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }
        int len = lists.length;
        ListNode head = new ListNode(0);
        Arrays.sort(lists,(o1, o2) -> o1.val-o2.val);
        ListNode res = lists[0];
        ListNode node = head;
        for (int i = 0; i < lists.length; i++) {
            node.next = lists[i];
            lists[i] = lists[i].next;
            node = node.next;
        }
        Arrays.sort(lists,(o1, o2) -> o1.val-o2.val);
        node.next = null;

        ListNode temp2 = head;
        node = res;
        // 有序链表有值就继续
        while (temp2.next!=null){
            node = temp2.next;
            // 去掉已经用过的
            temp2.next = temp2.next.next;
            if(lists[0]!=null){
                ListNode temp = lists[0];

                // 插入已经排序的链表中
                while(temp2.next!=null){
                    if(temp.val<=temp2.next.val){
                        // 插入到有序链表中
                        lists[0] = temp.next;
                        temp.next = temp2.next;
                        temp2.next = temp;
                        break;
                    }else{
                        // 链表往下走
                        temp2 = temp2.next;
                        // 链表到末尾
                        if(temp2.next==null){
                            lists[0] = temp.next;
                            temp2.next = temp;
                            temp2 = temp2.next;
                            temp2.next = null;
                        }
                    }
                }
                if(lists[0]!=null){
                    // 排序
                    for (int i = 0; i < len-1; i++) {
                        if(lists[i].val>lists[i+1].val){
                            ListNode temp3 = lists[i];
                            lists[i] = lists[i+1];
                            lists[i+1] = temp3;
                        }
                    }
                }else{
                    for (int i = 0; i < len-1; i++) {
                        ListNode temp3 = lists[i];
                        lists[i] = lists[i+1];
                        lists[i+1] = temp3;
                    }
                    len--;
                }
            }
            node = node.next;
            temp2 = head;
        }


        return res;
    }




    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        ListNode node3 = new ListNode(2);
        node3.next = new ListNode(6);

        ListNode[] lists = {node1,node2,node3};

        ListNode node = mergeKLists(lists);
        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }


    }
}
