package Nov_2023.nov3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Build_An_Array_With_Stack_Operations {

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        for (int i = 1; i <= n; i++) {
            if(current>=target.length){
                break;
            }
            if (target[current]==i){
                result.add("Push");
                current++;
            }else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
