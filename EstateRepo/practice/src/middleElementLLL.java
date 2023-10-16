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
//        while(node!=null) {
//            System.out.println(node.data);
//            node=node.next;
//        }
//        System.out.println("dd");
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
//        middleElementLLL mEl=new middleElementLLL();
//        printList(head);
//        System.out.println(mEl.getMiddleElement(head));
//    }
//}

public class middleElementLLL {

    int getMiddleElement(Node node) {
        Node slowPt=node, fastPt=node;
        while(Objects.nonNull(slowPt)&&Objects.nonNull(fastPt)&&Objects.nonNull(fastPt.next)) {
//            System.out.println("xD1");
            if(Objects.nonNull(slowPt)) {
                slowPt=slowPt.next;
//                System.out.println("xD2");
            }
            if(Objects.nonNull(fastPt)&&Objects.nonNull(fastPt.next)) {
                fastPt=fastPt.next.next;
//                System.out.println("xD3");
            }
        }
        return slowPt.data;
    }


}
