
public class trappingRainWater2 {
    public static void main(String args[]) {
        int arr[] = {6,0,9};
        System.out.println(trapWaterSoln(arr, arr.length));
    }

    public static long trapWaterSoln(int arr[], int n) {

        int l=0,r=n-1,lMax=arr[0],rMax=arr[n-1], res=0;
        l++;
        r--;

        while(l<r) {
            if(lMax<rMax) {
                res=res+Math.max(0,lMax-arr[l]);
                lMax=Math.max(lMax,arr[l]);
            } else {
                res=res+Math.max(0,rMax-arr[r]);
                rMax=Math.max(rMax, arr[r]);
            }
        }

        return res;
    }
}