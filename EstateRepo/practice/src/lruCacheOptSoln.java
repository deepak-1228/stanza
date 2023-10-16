import java.util.HashMap;
import java.util.Map;

public class lruCacheOptSoln {

    static HashMap<Integer, doubleLLNode> hKeyLLNode=new HashMap<>();
    static doubleLLNode head;
    static doubleLLNode tail;
    static int maxSize;
//    static int curSize;

    lruCacheOptSoln(int cap)
    {
//        this.curSize=0;
        this.maxSize=cap;
        this.head=null;
        this.tail=null;
        //code here
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        if(hKeyLLNode.containsKey(key)) {
            removeAndAppendAtEnd(hKeyLLNode.get(key));
            printList(head);
            printListMap();
            return hKeyLLNode.get(key).value;
        }
        return -1;
        // your code here
    }

    static void deleteFromHead() {
        head=head.next;
    }

    static void printListMap() {
        System.out.println("map");
        for(Map.Entry<Integer, doubleLLNode> entry : hKeyLLNode.entrySet()) {
            System.out.println(entry.getKey()+ "  " + entry.getValue());
        }
        System.out.println();
    }

    static void printList(doubleLLNode node) {
        System.out.println("ANS:");
        while(node!=null) {
            System.out.print(node+" "+node.key+"  "+node.value);
            node=node.next;
            System.out.println();
        }
        System.out.println();
    }

    static void deleteNode(doubleLLNode node) {
        if(node.next==null&&node.prev==null) {
            head=tail=null;
        } else if(node.prev==null) {//head node
            head=head.next;
            head.prev=null;
        } else if(node.next==null) {//tail node
            tail=node.prev;
            node.prev.next=null;
        }else {
            node.prev.next=node.next;
            node.next.prev=node.prev;
        }
    }
    static void removeAndAppendAtEnd(doubleLLNode node) {
        deleteNode(node);
        node.next=null;
        node.prev=null;
        appendAtEnd(node);
    }
    static void appendAtEnd(doubleLLNode node) {
        if(tail==null&&head==null) {
            head=tail=node;
        } else {
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        if(hKeyLLNode.containsKey(key)) {
            hKeyLLNode.get(key).value=value;
            removeAndAppendAtEnd(hKeyLLNode.get(key));
            printList(head);
            printListMap();
        } else {
            if (hKeyLLNode.size() == maxSize) {
                deleteNode(head);
                hKeyLLNode.remove(head.key);
            }
            hKeyLLNode.put(key, new doubleLLNode(key,value));
            appendAtEnd(hKeyLLNode.get(key));
            printList(head);
            printListMap();
        }
        // your code here
    }
}
