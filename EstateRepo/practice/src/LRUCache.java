import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class LRUCache {

    static List<lruNode> al=new ArrayList<>();
    static int maxSize;


    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap)
    {
        this.maxSize=cap;
        //code here
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        for(lruNode a: al) {
            if(a.key==key) {
                return a.value;
            }
        }
        return -1;
        // your code here
    }

    //Function for storing key-value pair.
    public static void set(int key, int value) {
        Boolean update=Boolean.FALSE;

        for(lruNode a: al) {
            if(a.key==key) {
                a.value=value;
                a.curTimeStamp=System.currentTimeMillis();
                update=Boolean.TRUE;
            }
        }

        lruNode deleteAl=null;
        long minTime=Long.MAX_VALUE;
        if(update.equals(Boolean.FALSE)) {
            if(al.size()==maxSize) {
                for(lruNode tempAl: al) {
                    if(tempAl.curTimeStamp<minTime) {
                        deleteAl=tempAl;
                        minTime=tempAl.curTimeStamp;
                    }
                }
             }
            if (Objects.nonNull(deleteAl)) {
                al.remove(deleteAl);
            }
            al.add(new lruNode(key, value));
        }
        // your code here
    }
}
