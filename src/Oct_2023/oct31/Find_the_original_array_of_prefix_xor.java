package Oct_2023.oct31;

import java.util.Arrays;

public class Find_the_original_array_of_prefix_xor {

    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Find_the_original_array_of_prefix_xor findTheOriginalArrayOfPrefixXor = new Find_the_original_array_of_prefix_xor();
        System.out.println(Arrays.toString(findTheOriginalArrayOfPrefixXor.findArray(new int[]{5,2,0,3,1})));
    }
}
