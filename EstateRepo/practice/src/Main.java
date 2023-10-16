import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println("Hello world!");

        int arr[] =  {6,9,9};
        System.out.println(s.trappingWater(arr, arr.length));
    }
}

class Solution{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    long trappingWater(int arr[], int n) {
        List<Integer> leftArray=new ArrayList<>();
        List<Integer> rightArray=new ArrayList<>();
        int i;
        int x=Integer.MIN_VALUE;
        for(i=0;i<n;i++) {
            x=Math.max(x,arr[i]);
            leftArray.add(x);
        }

        x=Integer.MIN_VALUE;
        for(i=n-1;i>=0;i--) {
            x=Math.max(arr[i], x);
            rightArray.add(x);
        }
        Collections.reverse(rightArray);
        int result=0;
        for(i=0;i<n;i++) {
            result=result+Math.min(leftArray.get(i),rightArray.get(i))-arr[i];
        }
        return result;
        // Your code here
    }
}