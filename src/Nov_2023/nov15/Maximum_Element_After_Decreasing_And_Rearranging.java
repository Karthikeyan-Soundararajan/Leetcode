package Nov_2023.nov15;

import java.util.Arrays;

public class Maximum_Element_After_Decreasing_And_Rearranging {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        for (int i = 1; i < arr.length; i++) {
            if((arr[i]-arr[i-1])>1){
                arr[i] = arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        Maximum_Element_After_Decreasing_And_Rearranging maximumElementAfterDecreasingAndRearranging = new Maximum_Element_After_Decreasing_And_Rearranging();
        System.out.println(maximumElementAfterDecreasingAndRearranging.maximumElementAfterDecrementingAndRearranging(new int[]{1,2,3,4,5}));
    }
}
