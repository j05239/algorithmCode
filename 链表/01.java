/*
*  【Q】给定两个有序链表的头指针head1和head2，打印两个链表的公共部分
*  【A】因为是有序链表，所以从两个链表的头开始进行如下判断
*  1、如果head1的值小于head2，则head1往下移动
*  2、如果head2的值小于head1，则head2往下移动
*  3、如果head1的值和head2的值相等，则打印这个值，然后head1和head2都往下移动
*  4、head1或head2有任何一个移动到null，整个过程停止
* */

public class Node{
    public int value;
    public Node next;
    public Node(int data){
        this.value = data;
    }
}

public void PrintCommonPart(Node head1, Node head2){
    System.out.println("Common part:");
    while (head1 != null && head2 != null){
        if (head1.value < head2.value){
            head1 = head1.next;
        } else if (head1.value > head2.value) {
            head2 = head2.next;
        } else {
            System.out.println(head1.value + " ");
            head1 = head1.next;
            head2 = head2.next;
        }
    }
    System.out.println("");
}




















