import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

//class Node {
//    int data;
//    Node next;
//    Node(int x) {
//        data=x;
//        next=null;
//    }
//}
//class LinkListEntry{
//    static void printList(Node node) {
//        if(node==null)
//        System.out.println("dd");
//        while(node!=null) {
//            System.out.println(node.data);
//            node=node.next;
//        }
//    }
//    public static void main(String args[]) throws IOException {
//        Scanner sc=new Scanner(System.in);
//        Node head = null;
//        int t=sc.nextInt();
//        while(t>0) {
//            int n=sc.nextInt();
//            Node node=new Node(sc.nextInt());
//            head=node;
//            int i=0;
//            while(i<n-1){
//                node.next=new Node(sc.nextInt());
//                node=node.next;
//                i++;
//            }
//            t--;
//        }
//        ReverseLinkList rLl=new ReverseLinkList();
//        Node a[]=new Node[1];
//        a[0]=new Node(0);
//        Node res=null;
//        rLl.reverseListRecur(head, a);
//        head.next=null;
//        printList(a[0].next);
////        printList(rLl.reverseList(head));
////        System.out.println(rLl.reverseList(head));
//    }
//}


public class ReverseLinkList {
    Node reverseList(Node head) {
         Node cur=head,fwd,prev=null;
         while(cur!=null) {
             fwd=cur.next;
             cur.next=prev;
             prev=cur;
             cur=fwd;
        }
         return prev;
    }
   public void reverseListRecur(Node head, Node a[]) {

        if(head==null)
            return;
        if(head.next==null) {
            a[0].next = head;
            return;
        }

        reverseListRecur(head.next, a);
        head.next.next=head;
        return;
    }
}
