import java.io.IOException;
import java.util.*;

public class nextGreaterElement {


//    List<Integer> l = new ArrayList<Integer>();


    public static long[] nextGreaterElement(long[] arr, int n) {
        Stack<Integer> s=new Stack<Integer>();
        s.add(0);
        long ans[]=new long[n];
        int i;
        for(i=0;i<n;i++)
            ans[i]=-1;

        for(i=1;i<n;i++) {
            while(!s.empty()&&arr[s.peek()]<arr[i]) {
                ans[s.peek()]=arr[i];
                s.pop();
            }
            s.add(i);
        }
        return ans;
    }

    public static void main(String args[]) throws IOException {
        long arr[] = {6,8,0,1,3};
        long ans[] = nextGreaterElement(arr, arr.length);
        Arrays.stream(ans).forEach(a -> {
            System.out.println(a);
        });
    }
}
