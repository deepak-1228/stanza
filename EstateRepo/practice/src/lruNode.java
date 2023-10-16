public class lruNode {
    int key;
    int value;
    long curTimeStamp;
    lruNode(int key,int value) {
        this.key = key;
        this.value = value;
        this.curTimeStamp = System.currentTimeMillis();


    }
}