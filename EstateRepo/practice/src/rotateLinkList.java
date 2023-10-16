import java.io.IOException;
import java.util.Scanner;


class LinkListEntry{
    static void printList(Node node) {
        while(node!=null) {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println("dd");
    }
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        Node head = null;
        int t=sc.nextInt();
        while(t>0) {
            int n=sc.nextInt();
            Node node=new Node(sc.nextInt());
            head=node;
            int i=0;
            while(i<n-1){
                node.next=new Node(sc.nextInt());
                node=node.next;
                i++;
            }
            t--;
        }
        rotateLinkList mEl=new rotateLinkList();
        printList(head);
        int k=1;
        printList(mEl.rotateLinkListUtil(head,k));
    }
}


public class rotateLinkList {


    Node rotateLinkListUtil(Node head, int k) {
        if(k==0||head==null)
            return head;
        Node link=head,rHead=null;
        k--;
        while(head.next!=null) {
            if(k==0) {
                rHead=head.next;
                head.next=null;
                head=rHead;
            }
            if(head.next!=null)
                head=head.next;
            k--;
        }
        if(rHead==null)
            return head;
            head.next=link;
        return rHead;
    }

}
