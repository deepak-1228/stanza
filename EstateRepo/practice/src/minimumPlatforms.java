import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class minimumPlatforms {
    public static void main(String args[]) {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(calcMinPlatforms1(arr, dep, arr.length));
    }

    public static int calcMinPlatforms(int arr[], int dep[], int n) {
        int i,j,ct=0,res=0;
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if(i!=j) {
                    if((arr[j]<=arr[i]&&arr[i]<=dep[j]) || (arr[j]<=dep[i]&&dep[i]<=dep[j]) || (arr[i]<=dep[j]&&dep[j]<=dep[i])) {
                        ct++;
                    }
                }
            }
            res=Math.max(ct,res);
            ct=0;
        }
        return res;
    }

    public static int calcMinPlatforms1(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,pt=0, res=0;
        while(i<n&&j<n) {
            if(arr[i]<=dep[j]) {
                pt++;
                i++;
            } else {
                pt--;
                j++;
            }
            res=Math.max(pt,res);
        }

        while(i<n) {
            pt++;
            i++;
            res=Math.max(pt,res);
        }

        while(j<n) {
            pt--;
            j++;
            res=Math.max(pt,res);
        }

        return res;
    }
}
