import java.util.Arrays;
import java.util.Random;

/**
 * Created by Acer on 25.07.18.
 */
public class MergeSort {
    public static void sort(int[] a, int low, int high){
        int N = high-low;
        if (N<=1)
            return;
        int mid = low+N/2;

        sort(a,low,mid);
        sort(a,mid,high);

        int[] temp = new int[N];
        int i = low, j =mid;
        for (int k = 0; k<N ; k++){
            if (i==mid)
                temp[k]=a[j++];
            else if (j==high)
                temp[k]=a[i++];
            else if (a[j]<a[i])
                temp[k]=a[j++];
            else
                temp[k]=a[i++];
        }
        for (int k = 0; k <N ; k++) {
            a[low+k]=temp[k];
        }
    }
    public static void main(String[] args){
        Random rand = new Random();

        int arr[] = new int[10];
        for (int i = 0; i <10; i++) {
            arr[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr,0,10);
        System.out.println(Arrays.toString(arr));
    }
}
